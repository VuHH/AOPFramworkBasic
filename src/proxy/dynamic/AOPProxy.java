package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AOPProxy implements InvocationHandler {

    private Object target;
    private Advice advice;

    public AOPProxy(Object target, Advice advice) {
        this.target = target;
        this.advice = advice;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (advice != null) {
            advice.before(method, args);
        }

        Object result = null;
        if (advice != null) {
            result = advice.around(method, args, target);
        } else {
            result = method.invoke(target, args);
        }

        if (advice != null) {
            advice.after(method, args);
        }

        return result;
    }

    public static Object getProxy(Object target, Advice advice) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new AOPProxy(target, advice)
        );
    }
}

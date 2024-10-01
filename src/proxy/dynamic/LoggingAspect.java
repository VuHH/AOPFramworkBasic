package proxy.dynamic;

import java.lang.reflect.Method;

public class LoggingAspect implements Advice{
    @Override
    public void before(Method method, Object[] args) {
        System.out.println("Before method: " + method.getName());
    }

    @Override
    public void after(Method method, Object[] args) {
        System.out.println("After method: " + method.getName());
    }

    @Override
    public Object around(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Around method: " + method.getName());
        return method.invoke(target, args);
    }
}

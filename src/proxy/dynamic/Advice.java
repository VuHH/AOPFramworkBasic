package proxy.dynamic;

import java.lang.reflect.Method;

public interface Advice {
    void before(Method method, Object[] args);

    void after(Method method, Object[] args);

    Object around(Method method, Object[] args, Object target) throws Throwable;
}

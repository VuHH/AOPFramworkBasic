package proxy.dynamic;

import java.lang.reflect.Method;

public interface PointCut {
    boolean matches(Method method);
}

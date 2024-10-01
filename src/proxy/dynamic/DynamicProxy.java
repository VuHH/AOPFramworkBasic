package proxy.dynamic;

import proxy.service.UserService;
import proxy.service.UserServiceImpl;

public class DynamicProxy {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        UserService proxy = (UserService) AOPProxy.getProxy(userService, new LoggingAspect());

        proxy.createUser("Vu");
    }
}

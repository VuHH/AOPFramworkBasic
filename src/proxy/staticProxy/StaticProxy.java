package proxy.staticProxy;

import proxy.service.UserServiceImpl;

public class StaticProxy {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy(userService);
        userServiceProxy.createUser("Test");
    }
}

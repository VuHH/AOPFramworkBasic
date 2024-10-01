package proxy.staticProxy;

import proxy.service.UserService;
import proxy.service.UserServiceImpl;

public class UserServiceProxy implements UserService {
    private UserServiceImpl userServiceImpl;

    public UserServiceProxy(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @Override
    public void createUser(String name) {
        System.out.println("Before Run Create...");
        userServiceImpl.createUser(name);
        System.out.println("After Run Create...");
    }
}

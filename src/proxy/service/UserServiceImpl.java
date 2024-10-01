package proxy.service;

public class UserServiceImpl implements UserService{
    @Override
    public void createUser(String name) {
        System.out.println("User is " + name);
    }
}

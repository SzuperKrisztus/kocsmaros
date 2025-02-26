package model.Users;

import java.util.List;

public interface UserDAO extends AutoCloseable {

    public void saveUser(User u);
    public void removeUser(User u);
    public void updateUser(User u);
    public List<User> getUsers();
    public User Login(String username, String password);
    public User Register(String username, String password, String email, String name);

}

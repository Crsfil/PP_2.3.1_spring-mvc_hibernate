package web.service;

import web.model.User;
import java.util.List;

public interface UserService {
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
    User findUserById(Long id);
    List<User> findAllUsers();
}
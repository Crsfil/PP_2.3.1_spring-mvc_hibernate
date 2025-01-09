package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser(User user) {
        userDao.save(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.update(user);
    }

    @Override
    public User findUserById(Long id) {
        return userDao.findById(id);
    }

    @Override
    public void deleteUser(Long id) {
        User user = userDao.findById(id);
        if (user != null) {
            userDao.delete(user);
        }
    }


    @Override
    public List<User> findAllUsers() {
        return userDao.findAll();
    }
}

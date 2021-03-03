package org.geektimes.projects.user.service.impl;

import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.repository.DatabaseUserRepository;
import org.geektimes.projects.user.repository.UserRepository;
import org.geektimes.projects.user.service.UserService;
import org.geektimes.projects.user.sql.DBConnectionManager;
import org.geektimes.projects.user.sql.DataSourceManager;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author sunhao
 * @date 2021/3/2 23:17
 * @Description:
 */
public class UserServiceImpl implements UserService {

    @Override
    public boolean register(User user) {
        DBConnectionManager dbConnectionManager = new DBConnectionManager();
        int result = dbConnectionManager.insertUser(user);
//        int result = DBConnectionManager.insertUser(user);
        return result == 1 ? true : false;
    }

    @Override
    public boolean deregister(User user) {
        return false;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public User queryUserById(Long id) {
        return null;
    }

    @Override
    public User queryUserByNameAndPassword(String name, String password) {
        return null;
    }
}

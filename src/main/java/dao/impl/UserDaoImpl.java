package src.main.java.dao.impl;

import src.main.java.dao.UserDao;
import src.main.java.model.User;

public class UserDaoImpl implements UserDao {

    @Override
    public User findUserByEmail(String email) {
        // this guy makes a connection to a DB
        // and gets the user object
        return null;
    }
}
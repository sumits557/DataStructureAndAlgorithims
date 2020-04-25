package src.main.java.dao;

import src.main.java.model.User;

public interface UserDao {
    public User findUserByEmail(String email);
}

package src.main.java.service;

import src.main.java.dao.UserDao;
import src.main.java.dao.impl.UserDaoImpl;
import src.main.java.model.User;

public class AuthenticationService {

    UserDao dao = new UserDaoImpl();

    public boolean login(String email, String password) {
        User user = dao.findUserByEmail(email);
        // check passwords...
        return true;
    }

    public UserDao getUserDao() {
        return dao;
    }

    public void setUserDao(UserDao dao) {
        this.dao = dao;
    }
}

package ohtu.services;

import ohtu.domain.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ohtu.data_access.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class AuthenticationService {

    private UserDao userDao;

    public AuthenticationService(UserDao userDao) {
        this.userDao = userDao;
    }

    public boolean logIn(String username, String password) throws IOException {
        User user = userDao.findByName(username);
        if (user != null && user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }

    public boolean createUser(String username, String password) throws IOException {

        if (userDao.findByName(username) != null) {
            return false;
        }

        if (invalid(username, password)) {
            return false;
        }

        userDao.add(new User(username, password));

        return true;
    }

    private boolean invalid(String username, String password) {

        if (invalidUsername(username)) {
            return true;
        }
        if (invalidPassword(password)) {
            return true;
        }

        return false;
    }

    private boolean invalidUsername(String username){
        if(username.length() >= 3 && username.matches("^[a-z]+$")) {
            return false;
        }
        return true;
    }

    private boolean invalidPassword(String password){
        if(password.length() >= 8 && password.matches("((?=(.*\\d){1,})|(?=(.*\\W){1,}))^.*$")) {
            return false;
        }
        return true;
    }
}

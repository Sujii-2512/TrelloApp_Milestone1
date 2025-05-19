package Trello_App.Helper;

import Trello_App.Model.User;
import java.util.*;

public class UserManager {
    private List<User> userList;

    public UserManager() {
        userList = new ArrayList<>();
    }

    public User getUser(int id) {
        for (User user : userList) {
            if (user.getUserId() == id) return user;
        }
        return null;
    }

    public User createOrGetUser(int id) {
        User user = getUser(id);
        if (user == null) {
            user = new User(id);
            userList.add(user);
        }
        return user;
    }

    public List<User> getUserList() {
        return userList;
    }
}

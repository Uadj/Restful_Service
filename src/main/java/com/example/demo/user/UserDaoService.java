package com.example.demo.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDaoService {
    private static int userCount = 3;

    private static List<User> users = new ArrayList<>();
    static {
        users.add(new User(1, "Kenneth", new Date()));
        users.add(new User(1, "Alice", new Date()));
        users.add(new User(1, "Elena", new Date()));
    }
    public User save(User user){
        if(user.getId()==null){
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }
    public List<User> findAll() {
        return users;
    }
    public User findOne(int id){
        for(User user : users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }
}

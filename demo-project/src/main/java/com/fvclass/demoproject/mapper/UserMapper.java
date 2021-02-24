package com.fvclass.demoproject.mapper;

import com.fvclass.demoproject.domain.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserMapper {
    private static Map<String, User> userMap = new HashMap<>();
    static {
        userMap.put("wayne",new User(1,"wayne","123"));
        userMap.put("logan",new User(2,"logan","123456l"));
        userMap.put("joke",new User(3,"joke","123j"));
    }
    public User login(String username,String pwd){
        User user = userMap.get(username);

        if(user == null){
            return null;
        }
        if (user.getPwd().equals(pwd)){
            return user;
        }
        return null;
    }
}
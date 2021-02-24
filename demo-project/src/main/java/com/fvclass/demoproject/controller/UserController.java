package com.fvclass.demoproject.controller;

import com.fvclass.demoproject.domain.User;
import com.fvclass.demoproject.service.UserService;
import com.fvclass.demoproject.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author fv
 * @date 2021/2/24
 */
@RestController
@RequestMapping("/api/v1/pub/user")
public class UserController {

//    @PostMapping("login")
//    public JsonData login(String pwd,String username){
//        System.out.println("username"+username+"pwd"+pwd);
//        return JsonData.buildSuccess("");

    @Autowired
    public UserService userService;

    @PostMapping("login")
    public JsonData login(@RequestBody User user) {
        System.out.println("user" + user.toString());

        String token = userService.login(user.getUsername(),user.getPwd());


        return token !=null ? JsonData.buildSuccess(token) : JsonData.buildError("账号密码错误");
    }
}
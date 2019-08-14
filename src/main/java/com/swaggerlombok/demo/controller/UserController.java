package com.swaggerlombok.demo.controller;

import com.swaggerlombok.demo.api.UserControllerApi;
import com.swaggerlombok.demo.entity.User;
import com.swaggerlombok.demo.result.Result;
import org.springframework.web.bind.annotation.RestController;

/**
 * Api的具体实现
 *
 * @Author wukq
 * @Time 2019-08-14  16:06
 */
@RestController
public class UserController implements UserControllerApi {

    @Override
    public String test(){
        return "success";
    }

    @Override
    public User getUser(Integer id, String name){
        return new User(id, name, "123456");
    }

    @Override
    public Result<User> addUser(User user){
        return new Result<>(Result.SUCCESS_CODE, Result.SUCCESS_MESSAGE, user);
    }
}

package com.swaggerlombok.demo.controller;

import com.swaggerlombok.demo.api.Test;
import com.swaggerlombok.demo.entity.User;
import com.swaggerlombok.demo.result.Result;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wukq
 * @Time 2019-08-15  10:37
 */
@RestController
public class TestController implements Test {
    @Override
    public String test() {
        return null;
    }

    @Override
    public User getUser(Integer id, String name) {
        return null;
    }

    @Override
    public Result<User> addUser(User user) {
        return null;
    }

    @Override
    public String ignoreTest() {
        return null;
    }
}

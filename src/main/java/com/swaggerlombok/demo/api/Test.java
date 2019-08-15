package com.swaggerlombok.demo.api;

import com.swaggerlombok.demo.entity.User;
import com.swaggerlombok.demo.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @Author wukq
 * @Time 2019-08-15  10:34
 */
@Api(value = "User1", tags = {"User"}, description = "用户相关")
@RequestMapping(value = "/user1")
public interface Test {
    /**
     * 这是一个测试接口
     * @return
     */
    @ApiOperation(value = "这是一个测试接口")
    @GetMapping("/test")
    String test();

    /**
     * 根据id和name查询一个用户
     * @param id
     * @param name
     * @return
     */
    @ApiOperation(value = "根据id和name查询一个用户")
    @GetMapping("/getUser/{id}/{name}")
    User getUser(@PathVariable @ApiParam(value = "这是id", required = true) Integer id,
                 @PathVariable @ApiParam(value = "这是name", required = true) String name);

    /**
     * 增加一个用户
     * @param user
     * @return
     */
    @ApiOperation(value = "增加一个用户")
    @PostMapping("/addUser")
    Result<User> addUser(@RequestBody @ApiParam(value = "这是一个user") User user);

    /**
     * 需要忽略的接口
     * @return
     */
    @ApiOperation(value = "需要忽略的接口")
    @ApiIgnore
    @GetMapping("/ignore")
    String ignoreTest();
}

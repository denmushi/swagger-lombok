package com.swaggerlombok.demo.api;

import com.swaggerlombok.demo.entity.User;
import com.swaggerlombok.demo.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * 每一个Controller实现一个对应的ControllerApi接口，
 * Api接口更注重对外的功能展示和文档描写，对于一个比较大的Controller有很好的可读性
 * Controller具体实现功能
 *
 * @Author wukq
 * @Time 2019-08-14  17:41
 */
@Api(value = "User", tags = {"User"}, description = "用户相关")
@RequestMapping(value = "/user")
public interface UserControllerApi {
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
}

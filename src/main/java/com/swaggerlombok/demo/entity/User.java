package com.swaggerlombok.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 用户Entity类，这里只展示和Swagger，lombok有关的功能
 *
 * @Author wukq
 * @Time 2019-08-14  16:00
 */
@ApiModel(description = "用户Model类")
@Data
@AllArgsConstructor
public class User {

    @ApiModelProperty(value = "用户ID", name = "id", example = "1")
    private Integer id;

    @ApiModelProperty(value = "用户名", name = "userName", required = true, example = "admin")
    private String userName;

    @ApiModelProperty(value = "密码", name = "password", required = true, example = "123456")
    private String password;
}

package com.swaggerlombok.demo.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 通用响应对象
 *
 * @Author wukq
 * @Time 2019-08-14  16:31
 */
@ApiModel(description = "响应对象")
@Data
@AllArgsConstructor
public class Result<T> {

    public static final int SUCCESS_CODE = 0;
    public static final String SUCCESS_MESSAGE = "成功";

    @ApiModelProperty(value = "响应码", name = "code", required = true, example = "" + SUCCESS_CODE)
    private Integer code;

    @ApiModelProperty(value = "响应信息", name = "msg", required = true, example = SUCCESS_MESSAGE)
    private String msg;

    @ApiModelProperty(value = "响应数据", name = "data")
    private T data;
}

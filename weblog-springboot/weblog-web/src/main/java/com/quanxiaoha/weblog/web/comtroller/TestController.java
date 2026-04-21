package com.quanxiaoha.weblog.web.comtroller;

import com.quanxiaoha.weblog.common.aspect.ApiOperationLog;
import com.quanxiaoha.weblog.common.utils.Response;
import com.quanxiaoha.weblog.web.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

/**
 * @Author: Withnoidea
 * @Date: 2026/4/21 10:37
 * @Version: v1.0.0
 * @Description: TODO
 */
@RestController
@Slf4j
public class TestController {

    @PostMapping("/test")
    @ApiOperationLog(description = "测试接口")
    public Response test(@RequestBody @Validated User user, BindingResult bindingResult) {
        // 是否存在校验错误
        if (bindingResult.hasErrors()) {
            // 获取校验不通过字段的提示信息
            String errorMsg = bindingResult.getFieldErrors()//获取所有校验失败的集合
                    .stream()//把list变成流水线
                    .map(error-> error.getDefaultMessage())
                    .collect(Collectors.joining(", "));//结束流水线，把所有文字用逗号拼接成一个字符串

            return Response.fail(errorMsg);
        }

        // 返参
        return Response.success();
    }

}

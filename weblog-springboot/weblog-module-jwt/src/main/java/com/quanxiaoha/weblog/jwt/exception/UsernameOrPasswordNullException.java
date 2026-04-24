package com.quanxiaoha.weblog.jwt.exception;


import org.springframework.security.core.AuthenticationException;

/**
 * @Author: Withnoidea
 * @Date: 2026/4/23 09:46
 * @Version: v1.0.0
 * @Description: 用户名或者密码为空异常
 */
public class UsernameOrPasswordNullException extends AuthenticationException {
    public UsernameOrPasswordNullException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public UsernameOrPasswordNullException(String msg) {
        super(msg);
    }
}

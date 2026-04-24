package com.quanxiaoha.weblog.jwt.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Withnoidea
 * @Date: 2026/4/24 10:55
 * @Version: v1.0.0
 * @Description: 用户登录
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginRspVO {
    /**
     * Token 值用户名
     */
    private String token;
}

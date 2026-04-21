package com.quanxiaoha.weblog.common.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Withnoidea
 * @Date: 2026/4/21 10:19
 * @Version: v1.0.0
 * @Description: Json工具类
 */
@Slf4j
public class JsonUtil {
    private static final ObjectMapper INSATANCE = new ObjectMapper();

    public static String toJsonString(Object obj){
        try {
            return INSATANCE.writeValueAsString(obj);
        } catch (Exception e) {
            return obj.toString();
        }
    }
}

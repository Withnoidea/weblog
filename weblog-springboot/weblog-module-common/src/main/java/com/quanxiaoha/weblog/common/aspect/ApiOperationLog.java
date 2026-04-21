package com.quanxiaoha.weblog.common.aspect;

import java.lang.annotation.*;

/**
 * @Author: Withnoidea
 * @Date: 2026/4/21 09:58
 * @Version: v1.0.0
 * @Description:
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD})
@Documented
public @interface ApiOperationLog {
    /**
     * API功能描述
     *
     * @return
     */

    String description() default "";
}

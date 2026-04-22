package com.quanxiaoha.weblog.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Withnoidea
 * @Date: 2026/4/22 13:42
 * @Version: v1.0.0
 * @Description: MybatisPlus 配置文件
 */
@Configuration
@MapperScan("com.quanxiaoha.weblog.common.domain.mapper")
public class MybatisPlusConfig {
}

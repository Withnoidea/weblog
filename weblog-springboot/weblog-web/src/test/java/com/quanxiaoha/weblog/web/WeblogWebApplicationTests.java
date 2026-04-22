package com.quanxiaoha.weblog.web;

import com.quanxiaoha.weblog.common.domain.dos.UserDO;
import com.quanxiaoha.weblog.common.domain.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
@Slf4j
class WeblogWebApplicationTests {


    @Test
    void contextLoads() {
    }

    @Test
    void testLog() {
        log.info("info log");
        log.debug("debug log");
        log.error("error log");
        log.warn("warn log");

        // 占位符
        String author = "犬小哈";
        log.info("这是一行带有占位符日志，作者：{}", author);
    }

    @Autowired
    private UserMapper userMapper;

    @Test
    void insertTest() {
        // 构建数据库实体类
        UserDO userDO = UserDO.builder()
                .username("犬小哈")
                .password("123456")
                .createTime(new Date())
                .updateTime(new Date())
                .isDeleted(false)
                .build();

        userMapper.insert(userDO);
    }
}

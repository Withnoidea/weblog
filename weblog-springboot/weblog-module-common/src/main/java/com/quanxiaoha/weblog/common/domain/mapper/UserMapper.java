package com.quanxiaoha.weblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.quanxiaoha.weblog.common.domain.dos.UserDO;

/**
 * @Author: Withnoidea
 * @Date: 2026/4/22 13:45
 * @Version: v1.0.0
 * @Description:
 */
public interface UserMapper extends BaseMapper<UserDO> {
    default UserDO findByUsername(String username){
        LambdaQueryWrapper<UserDO> wraper = new LambdaQueryWrapper<>();
        wraper.eq(UserDO::getUsername, username);
        return selectOne(wraper);
    }
}

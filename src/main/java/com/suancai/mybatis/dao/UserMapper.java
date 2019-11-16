package com.suancai.mybatis.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.suancai.mybatis.entity.User;

/**
 * @Author Bruce
 * @Date: 2019/11/16 11:55
 * @Description
 */
public interface UserMapper extends BaseMapper<User> {
    User getUserByName(String name);
}

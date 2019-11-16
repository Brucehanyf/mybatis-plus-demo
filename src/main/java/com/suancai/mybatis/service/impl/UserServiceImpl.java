package com.suancai.mybatis.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.suancai.mybatis.dao.UserMapper;
import com.suancai.mybatis.entity.User;
import com.suancai.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Bruce
 * @Date: 2019/11/16 14:04
 * @Description
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public PageInfo<User> listPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> users = userMapper.selectList(null);
        return new PageInfo<User>(users);
    }
}

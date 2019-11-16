package com.suancai.mybatis.service;

import com.github.pagehelper.PageInfo;
import com.suancai.mybatis.entity.User;

/**
 * @Author Bruce
 * @Date: 2019/11/16 14:03
 * @Description
 */
public interface UserService {
    PageInfo<User> listPage(int pageNum, int pageSize);
}

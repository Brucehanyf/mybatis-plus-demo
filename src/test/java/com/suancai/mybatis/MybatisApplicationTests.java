package com.suancai.mybatis;


import com.github.pagehelper.PageInfo;
import com.suancai.mybatis.dao.UserMapper;
import com.suancai.mybatis.entity.User;
import com.suancai.mybatis.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
       User user = userMapper.getUserByName("Jone");
        System.out.println(user);

        PageInfo<User> userPageInfo = userService.listPage(1, 1);
        System.out.println("userPageInfo");
    }
}

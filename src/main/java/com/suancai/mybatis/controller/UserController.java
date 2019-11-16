package com.suancai.mybatis.controller;

import com.suancai.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Bruce
 * @Date: 2019/11/16 14:41
 * @Description
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public Object pageList(int pageNum, int pageSize){
        return  userService.listPage(pageNum,pageSize);
    }
}

package com.yk.usercenter.controller;


import com.yk.usercenter.model.entity.User;
import com.yk.usercenter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 分享 前端控制器
 * </p>
 *
 * @author yangk
 * @since 2022-08-16
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User findById(@PathVariable Integer id) {
        return userService.getById(id);
    }


}


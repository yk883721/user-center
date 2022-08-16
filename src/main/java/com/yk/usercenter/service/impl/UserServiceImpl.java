package com.yk.usercenter.service.impl;

import com.yk.usercenter.model.entity.User;
import com.yk.usercenter.mapper.UserMapper;
import com.yk.usercenter.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 分享 服务实现类
 * </p>
 *
 * @author yangk
 * @since 2022-08-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}

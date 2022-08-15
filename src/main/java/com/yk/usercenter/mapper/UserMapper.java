package com.yk.usercenter.mapper;

import com.yk.usercenter.model.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 分享 Mapper 接口
 * </p>
 *
 * @author auther
 * @since 2022-08-14
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}

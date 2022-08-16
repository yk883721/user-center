package com.yk.usercenter.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 分享
 * </p>
 *
 * @author yangk
 * @since 2022-08-16
 */
@Getter
@Setter
@ApiModel(value = "User对象", description = "分享")
public class User {

    @ApiModelProperty("Id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("微信id")
    private String wxId;

    @ApiModelProperty("微信昵称")
    private String wxNickname;

    @ApiModelProperty("角色")
    private String roles;

    @ApiModelProperty("头像地址")
    private String avatarUrl;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("修改时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("积分")
    private Integer bonus;

}

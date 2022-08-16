package com.yk.usercenter.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 积分变更记录表
 * </p>
 *
 * @author yangk
 * @since 2022-08-16
 */
@Getter
@Setter
@TableName("bonus_event_log")
@ApiModel(value = "BonusEventLog对象", description = "积分变更记录表")
public class BonusEventLog {

    @ApiModelProperty("Id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("user.id")
    private Integer userId;

    @ApiModelProperty("积分操作值")
    private Integer value;

    @ApiModelProperty("发生的事件")
    private String event;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("描述")
    private String description;


}

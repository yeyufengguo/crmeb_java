package com.zbkj.crmeb.system.request;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * <p>
 * 后台管理员表
 * </p>
 *
 * @author Mr.Zhang
 * @since 2020-04-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("eb_system_admin")
@ApiModel(value="SystemAdmin对象", description="后台管理员表")
public class SystemAdminRequest implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "后台管理员表ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "后台管理员账号")
    private String account;

    @ApiModelProperty(value = "后台管理员密码")
    private String pwd;

    @ApiModelProperty(value = "后台管理员姓名")
    private String realName;

    @ApiModelProperty(value = "后台管理员权限(menus_id)")
    private String roles;

    @ApiModelProperty(value = "后台管理员最后一次登录ip")
    private String lastIp;

    @ApiModelProperty(value = "后台管理员最后一次登录时间")
    private Integer lastTime;

    @ApiModelProperty(value = "后台管理员添加时间")
    private Integer addTime;

    @ApiModelProperty(value = "登录次数")
    private Integer loginCount;

    @ApiModelProperty(value = "后台管理员级别")
    private Integer level;

    @ApiModelProperty(value = "后台管理员状态 1有效0无效")
    private Boolean status;

    @ApiModelProperty(value = "是否删除 1删除 0未删除")
    private Boolean isDel;


}

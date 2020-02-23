package com.iwsx.spring_ssm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_user")
public class User {
  @TableId(type = IdType.AUTO)
  private String id;
  private String userName;

  @TableField(select = false)
  private String password;
  private String name;
  private Integer age;
  private Integer sex;

  @TableField(value = "t_birthday")
  private Date birthday;
  private String created;
  private String updated;
}

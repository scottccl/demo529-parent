package com.wlwq.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.*;

@Data
public class User {

    @TableId("id")
    private Long id;
    @TableField("name")
    private String userName;
    private Integer age;
}

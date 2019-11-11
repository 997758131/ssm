package com.javakc.ssm.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class UserEntity {
    private String id;
    private String name;
    private int age;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date birthday;


}

package com.tecsun.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
public class User {
    @Id
    @GeneratedValue
    private int		userId;
    private String	name ;
    private String	idNum;
    private String  age;
    //0.正常 1.排除
    private String  status;
    private Date createTime;
}

package com.tecsun.bo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
public class UserBo {
    @Id
    @GeneratedValue
    private int		userId;
    private String	name ;
    private String	idNum;
    //0.正常 1.排除
    private String  status;
    private Date createTime;
}

package com.tecsun.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class SignDetail {
    @Id
    @GeneratedValue
    private int		deatailId;
    private String	userId ;
    private String	areaId;
    private Date signTime;//签到时间
    //0.已签到 1.未签到
    private String  status;
}

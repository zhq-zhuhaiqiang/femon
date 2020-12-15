package com.tecsun.jpadata.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class AreaJapEntity {
    @Id
    @GeneratedValue
    private int		areaId;
    private String	areaName ;
    private String	areaCode;
    //0.正常 1.排除
    private String  status;
}

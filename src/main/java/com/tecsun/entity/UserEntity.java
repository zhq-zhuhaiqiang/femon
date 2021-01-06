package com.tecsun.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name="user")
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="id_card")
    private String idCard;
    @Column(name="rysx")
    private String rysx;
    @Column(name="create_time")
    private String createTime;
    @Column(name="update_time")
    private String updateTime;


}

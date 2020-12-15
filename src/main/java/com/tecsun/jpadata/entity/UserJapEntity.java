package com.tecsun.jpadata.entity;

import com.tecsun.entity.User;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class UserJapEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Integer		userId;
    @Column
    private String	name ;
    @Column
    private String	idNum;
    @Column
    private String  age;
    //0.正常 1.排除
    @Column
    private String  status;
    @Column
    private Date createTime;
    public UserJapEntity(final User user) {
        this.userId = user.getUserId();
        this.name = user.getName();
        this.idNum = user.getIdNum();
        this.age = user.getAge();
        this.status = user.getStatus();
        this.createTime=user.getCreateTime();
    }
    public UserJapEntity(){

    }
    public UserJapEntity(String name,String idNum){
        this.name=name;
        this.idNum=idNum;

    }
    public User toUser() {
        User user = new User();
        user.setUserId(userId);
        user.setName(name);
        user.setAge(age);
        user.setStatus(status);
        user.setIdNum(idNum);
        user.setCreateTime(createTime);
        return user;
    }
}

package com.tecsun.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class UserImportEntity {
    @ExcelProperty(value = "用户名", index = 0)
    private String name;

    @ExcelProperty(value = "身份证号", index = 1)
    private String idNum;

    @ExcelProperty(value = "有效状态", index = 2)
    private String status;

    public UserImportEntity(String name, String idNum, String status) {
        this.name = name;
        this.idNum = idNum;
        this.status = status;
    }
    public UserImportEntity() {

    }
    public User toUser() {
        User user = new User();
        user.setName(name);
        user.setStatus(status);
        user.setIdNum(idNum);
        return user;
    }


}

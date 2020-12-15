package com.tecsun.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

import java.util.Date;

@Data
public class UserExportEntity extends BaseRowModel {

    @ExcelProperty(value = "姓名", index = 0)
    private String name;
    @ExcelProperty(value = "身份证号", index = 1)
    private String idNum;
    @ExcelProperty(value = "状态", index = 2)
    private String status;
    @ExcelProperty(value = "录入时间", index = 3)
    private Date creatTime;
    public UserExportEntity(){

    }
    public UserExportEntity(User user){
        this.name=user.getName();
        this.idNum=user.getIdNum();
        this.status=user.getStatus();
        this.creatTime=user.getCreateTime();
    }

}
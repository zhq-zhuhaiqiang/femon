package com.tecsun.request;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserExportReq extends BaseRowModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @ExcelProperty(value = "提交人", index = 1)
    private String detailcol1;
    @ExcelProperty(value = "提交时间", index = 2)
    private String detailcol2;
    @ExcelProperty(value = "更新时间", index = 3)
    private String detailcol3;
    @ExcelProperty(value = "请假时间", index = 4)
    private String detailcol4;
    @ExcelProperty(value = "连队（社区）", index = 5)
    private String detailcol5;
    @ExcelProperty(value = "包户干部", index = 6)
    private String detailcol6;
    @ExcelProperty(value = "户主姓名", index = 7)
    private String detailcol7;
    @ExcelProperty(value = "户主身份证号码", index = 8)
    private String detailcol8;
    @ExcelProperty(value = "家庭现住址", index = 9)
    private String detailcol9;
    @ExcelProperty(value = "请假去向", index = 10)
    private String detailcol10;
    @ExcelProperty(value = "请假原因", index = 11)
    private String detailcol11;
    @ExcelProperty(value = "姓名", index = 12)
    private String detailcol12;
    @ExcelProperty(value = "身份证号码", index = 13)
    private String detailcol13;
    @ExcelProperty(value = "联系电话", index = 14)
    private String detailcol14;
    @ExcelProperty(value = "外出日期", index = 15)
    private String detailcol15;
    @ExcelProperty(value = "返回日期", index = 16)
    private String detailcol16;
    @ExcelProperty(value = "请假天数", index = 17)
    private String detailcol17;
    @ExcelProperty(value = "备注", index = 18)
    private String detailcol18;
    @ExcelProperty(value = "销假日期", index = 19)
    private String detailcol19;


}
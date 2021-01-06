package com.tecsun.request;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserSignResultExportReq implements Serializable {
    private static final long serialVersionUID = 1L;
    @ExcelProperty(value = "姓名", index = 1)
    private String signcol1;
    @ExcelProperty(value = "部门", index = 2)
    private String signcol2;
    @ExcelProperty(value = "身份证号码", index = 3)
    private String signcol3;
    @ExcelProperty(value = "考勤日期", index = 4)
    private String signcol4;
    @ExcelProperty(value = "打卡时间", index = 5)
    private String signcol5;
    @ExcelProperty(value = "比对结果", index = 6)
    private String signcol6;

}

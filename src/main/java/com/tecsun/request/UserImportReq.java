package com.tecsun.request;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserImportReq implements Serializable {
    private static final long serialVersionUID = 1L;
    @ExcelProperty(value = "提交人", index = 1)
    private String ecol1;
    @ExcelProperty(value = "提交时间", index = 2)
    private String ecol2;
    @ExcelProperty(value = "更新时间", index = 3)
    private String ecol3;
    @ExcelProperty(value = "走访日期时间", index = 4)
    private String ecol4;
    @ExcelProperty(value = "填报人员所在连队（社区）", index = 5)
    private String ecol5;
    @ExcelProperty(value = "填报人员单位", index = 6)
    private String ecol6;
    @ExcelProperty(value = "填报人员", index = 7)
    private String ecol7;
    @ExcelProperty(value = "姓名", index = 8)
    private String ecol8;
    @ExcelProperty(value = "身份证号", index = 9)
    private String ecol9;
    @ExcelProperty(value = "人员属性", index = 10)
    private String ecol10;
    @ExcelProperty(value = "本人是否是下列人员（可多选或不选）", index = 11)
    private String ecol11;
    @ExcelProperty(value = "不放心的原因", index = 12)
    private String ecol12;
    @ExcelProperty(value = "人口类型", index = 13)
    private String ecol13;
    @ExcelProperty(value = "本人是否是兵地联姻？", index = 14)
    private String ecol14;
    @ExcelProperty(value = "本人是否是以下人员？", index = 15)
    private String ecol15;
    @ExcelProperty(value = "本人是否是特殊人员？", index = 16)
    private String ecol16;
    @ExcelProperty(value = "特殊人员原因", index = 17)
    private String ecol17;
    @ExcelProperty(value = "本人是否是不宜入住人员？", index = 18)
    private String ecol18;
    @ExcelProperty(value = "不宜入住原因", index = 19)
    private String ecol19;
    @ExcelProperty(value = "是否空挂户", index = 20)
    private String ecol20;
    @ExcelProperty(value = "是否人户分离", index = 21)
    private String ecol21;
    @ExcelProperty(value = "公民出生证件编号", index = 22)
    private String ecol22;
    @ExcelProperty(value = "原籍地", index = 23)
    private String ecol23;
    @ExcelProperty(value = "未落户原因", index = 24)
    private String ecol24;
    @ExcelProperty(value = "办理居住证情况", index = 25)
    private String ecol25;
    @ExcelProperty(value = "辖区暂住入住时间", index = 26)
    private String ecol26;
    @ExcelProperty(value = "拟暂住截止时间", index = 27)
    private String ecol27;
    @ExcelProperty(value = "直系亲属是否有被收押", index = 28)
    private String ecol28;
    @ExcelProperty(value = "直系亲属被收押基本情况", index = 29)
    private String ecol29;
    @ExcelProperty(value = "亲属暂住处所是自建房", index = 30)
    private String ecol30;
    @ExcelProperty(value = "亲属暂住处所是自建房基本情况", index = 31)
    private String ecol31;
    @ExcelProperty(value = "亲属中是否有重点人口", index = 32)
    private String ecol32;
    @ExcelProperty(value = "亲属中是否有重点人口的基本情况", index = 33)
    private String ecol33;
    @ExcelProperty(value = "居住方式", index = 34)
    private String ecol34;
    @ExcelProperty(value = "流动区域", index = 35)
    private String ecol35;
    @ExcelProperty(value = "工作地详址", index = 36)
    private String ecol36;
    @ExcelProperty(value = "流出日期", index = 37)
    private String ecol37;
    @ExcelProperty(value = "流出原因", index = 38)
    private String ecol38;
    @ExcelProperty(value = "流出去向", index = 39)
    private String ecol39;
    @ExcelProperty(value = "流出人员现住址", index = 40)
    private String ecol40;
    @ExcelProperty(value = "流出人员服务处所", index = 41)
    private String ecol41;
    @ExcelProperty(value = "是否请假（重点人员）", index = 42)
    private String ecol42;
    @ExcelProperty(value = "协查时间", index = 43)
    private String ecol43;
    @ExcelProperty(value = "协查方式", index = 44)
    private String ecol44;
    @ExcelProperty(value = "流入地警务室民警姓名、联系电话", index = 45)
    private String ecol45;
    @ExcelProperty(value = "流入地社区（连队）工作人员姓名、联系电话", index = 46)
    private String ecol46;
    @ExcelProperty(value = "流入地反馈现实表现", index = 47)
    private String ecol47;
    @ExcelProperty(value = "其他情况", index = 48)
    private String ecol48;
    @ExcelProperty(value = "户主姓名", index = 49)
    private String ecol49;
    @ExcelProperty(value = "户主身份证号码", index = 50)
    private String ecol50;
    @ExcelProperty(value = "户号（自动生成）", index = 51)
    private String ecol51;
    @ExcelProperty(value = "户口本编号", index = 52)
    private String ecol52;
    @ExcelProperty(value = "户别（户口类型）", index = 53)
    private String ecol53;
    @ExcelProperty(value = "与户主关系", index = 54)
    private String ecol54;
    @ExcelProperty(value = "住户类别（户主）", index = 55)
    private String ecol55;
    @ExcelProperty(value = "住户类别", index = 56)
    private String ecol56;
    @ExcelProperty(value = "性别", index = 57)
    private String ecol57;
    @ExcelProperty(value = "曾用名", index = 58)
    private String ecol58;
    @ExcelProperty(value = "民族", index = 59)
    private String ecol59;
    @ExcelProperty(value = "政治面貌", index = 60)
    private String ecol60;
    @ExcelProperty(value = "出生日期", index = 61)
    private String ecol61;
    @ExcelProperty(value = "出生地", index = 62)
    private String ecol62;
    @ExcelProperty(value = "籍贯", index = 63)
    private String ecol63;
    @ExcelProperty(value = "宗教信仰", index = 64)
    private String ecol64;
    @ExcelProperty(value = "户籍地址", index = 65)
    private String ecol65;
    @ExcelProperty(value = "是否办理身份证", index = 66)
    private String ecol66;
    @ExcelProperty(value = "居民身份证签发日期", index = 67)
    private String ecol67;
    @ExcelProperty(value = "现住址", index = 68)
    private String ecol68;
    @ExcelProperty(value = "本市（县）其他住址", index = 69)
    private String ecol69;
    @ExcelProperty(value = "所属派出所", index = 70)
    private String ecol70;
    @ExcelProperty(value = "管理隶属于连队（社区）", index = 71)
    private String ecol71;
    @ExcelProperty(value = "是否有监护人", index = 72)
    private String ecol72;
    @ExcelProperty(value = "监护人", index = 73)
    private String ecol73;
    @ExcelProperty(value = "监护关系", index = 74)
    private String ecol74;
    @ExcelProperty(value = "文化程度", index = 75)
    private String ecol75;
    @ExcelProperty(value = "毕业时间", index = 76)
    private String ecol76;
    @ExcelProperty(value = "毕业院校及专业", index = 77)
    private String ecol77;
    @ExcelProperty(value = "婚姻状况", index = 78)
    private String ecol78;
    @ExcelProperty(value = "兵役状况", index = 79)
    private String ecol79;
    @ExcelProperty(value = "身高", index = 80)
    private String ecol80;
    @ExcelProperty(value = "血型", index = 81)
    private String ecol81;
    @ExcelProperty(value = "职业", index = 82)
    private String ecol82;
    @ExcelProperty(value = "服务处所（在读学校）", index = 83)
    private String ecol83;
    @ExcelProperty(value = "联系方式（本人）", index = 84)
    private String ecol84;
    @ExcelProperty(value = "联系方式（应急联系人及电话）", index = 85)
    private String ecol85;
    @ExcelProperty(value = "是否有QQ号、微信号", index = 86)
    private String ecol86;
    @ExcelProperty(value = "QQ号码", index = 87)
    private String ecol87;
    @ExcelProperty(value = "微信号", index = 88)
    private String ecol88;
    @ExcelProperty(value = "是否参保", index = 89)
    private String ecol89;
    @ExcelProperty(value = "参保类型", index = 90)
    private String ecol90;
    @ExcelProperty(value = "是否已就业", index = 91)
    private String ecol91;
    @ExcelProperty(value = "就业去向", index = 92)
    private String ecol92;
    @ExcelProperty(value = "是否是民兵", index = 93)
    private String ecol93;
    @ExcelProperty(value = "民兵类型", index = 94)
    private String ecol94;
    @ExcelProperty(value = "现实表现", index = 95)
    private String ecol95;
    @ExcelProperty(value = "特殊职业技能", index = 96)
    private String ecol96;
    @ExcelProperty(value = "户口是否应销未销", index = 97)
    private String ecol97;
    @ExcelProperty(value = "应销未销原因", index = 98)
    private String ecol98;
    @ExcelProperty(value = "是否有包户干部", index = 99)
    private String ecol99;
    @ExcelProperty(value = "包户干部姓名", index = 100)
    private String ecol100;
    @ExcelProperty(value = "包户干部电话", index = 101)
    private String ecol101;
    @ExcelProperty(value = "包户干部工作单位及职务（工作队）", index = 102)
    private String ecol102;


}

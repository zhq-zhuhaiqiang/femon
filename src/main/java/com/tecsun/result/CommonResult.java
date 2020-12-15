package com.tecsun.result;

import lombok.Data;

import java.io.Serializable;
@Data
public class CommonResult implements Serializable {
    private String code;
    private String msg;
    private Object data;
}

package com.yibai.bean;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by yibai on 2018/12/29.
 */
@Setter
@Getter
@ToString
public class Address {
    private String country;
    private String province;
    private String detail;
}

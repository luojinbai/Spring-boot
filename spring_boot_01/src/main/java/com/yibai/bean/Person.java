package com.yibai.bean;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.Map;

/**
 * Created by WIN10 on 2018/12/29.
 */
@Setter
@Getter
@ToString
@Configuration
@ConfigurationProperties(prefix = "person")
@PropertySource(value = "classpath:person.properties") //自定义指定绑定的配置文件
public class Person {
    private int id;
    private String name;
    private int age;
    private Address address;
    private List<String> tags;
    private Map<String, String> map;
}

package com.yibai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yibai on 2018/12/29.
 */
@Configuration
public class CommonBeanFactory {

    @Bean
    public HelloService helloService() {
        return new HelloService();
    }

}

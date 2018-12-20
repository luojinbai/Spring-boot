package com.yibai.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yibai on 2018-12-20.
 */
@Controller
public class HelloWorldController {

    @ResponseBody
    @RequestMapping("sayHello")
    public String sayHello() {
        return "hello world";
    }
}

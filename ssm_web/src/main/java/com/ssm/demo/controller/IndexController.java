package com.ssm.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author lyr
 * @create 2020/4/12 17:27
 */
@Controller
public class IndexController {
    @ResponseBody
    @RequestMapping("/example")
    public String example() {
        return "example";
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}

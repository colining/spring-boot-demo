package com.example.web;

import com.example.excption.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生错误");
    }

    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("host", "http://colining.cn");
        return "index";
    }
}

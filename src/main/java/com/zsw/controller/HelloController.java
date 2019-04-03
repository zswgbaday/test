package com.zsw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class HelloController {

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "index";
    }

}

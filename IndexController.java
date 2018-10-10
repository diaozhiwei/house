package com.house.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class IndexController {

    @RequestMapping(value = "/main")//跳转
    public String main(){

        System.out.println("1111");
        return "index";
    }
}

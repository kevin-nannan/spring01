package com.zck.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class DemoController {
        @RequestMapping("demo")
        public String demo(String name,int age) {
                System.out.println("执行了demo"+name+"'s age:  "+age);
                return "main.jsp";
        }
        @RequestMapping("demo2")
        public String demo2() {
                System.out.println("执行了demo2");
                return "index.jsp";
        }
      
}

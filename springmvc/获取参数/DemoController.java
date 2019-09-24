package com.zck.spring.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zck.dao.People;
import com.zck.dao.Peos;
@Controller
public class DemoController {
        
        
        @RequestMapping("demo/{id1}/{name}")
        public String demo(@PathVariable String name,@PathVariable("id1") int age){                
                System.out.println(name+"   "+age);
                
                return "main.jsp";
                
        }
        
        
      
}

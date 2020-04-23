package com.example.ems_thymeleaf.controller;

import com.example.ems_thymeleaf.entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping("/index")
    public String toIndex(){
        return "login";
    }

    @GetMapping("/toregist")
    public String toregist(){
        return "regist";
    }

    @GetMapping("/error")
    public String toerror()
    {
        return "error";
    }

    @GetMapping("/emplist")
    public String emplist()
    {
        return "emplist";
    }

    @GetMapping("/toSave")
    public String toSave()
    {
        return "addEmp";
    }


}

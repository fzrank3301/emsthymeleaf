package com.example.ems_thymeleaf.controller;

import com.example.ems_thymeleaf.entity.EmpEnity;
import com.example.ems_thymeleaf.service.EmpService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    EmpService empService;

    @GetMapping("findAll")
    public String findAll(Model model) {
        List<EmpEnity> emps = empService.findAll();
        model.addAttribute("emps", emps);
        return "emplist";
    }

    @PostMapping("save")
    public String save(EmpEnity emp){
        empService.save(emp);
        return "redirect:/emp/findAll";
    }

    @GetMapping("delete")
    public String delete(String id)
    {
        empService.delete(id);
        return "redirect:/emp/findAll";
    }


    @GetMapping("find")
    public String find(String id, Model model)
    {
        EmpEnity empEnity = empService.find(id);
        model.addAttribute("empe",empEnity);
        return "updateEmp";
    }


    @PostMapping("update")
    public String update(EmpEnity emp)
    {
        System.out.printf(emp.toString());
        empService.update(emp);
        return "redirect:/emp/findAll";
    }

}

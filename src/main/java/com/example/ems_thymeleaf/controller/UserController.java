package com.example.ems_thymeleaf.controller;

import com.example.ems_thymeleaf.entity.UserEntity;
import com.example.ems_thymeleaf.service.UserService;
import com.example.ems_thymeleaf.service.UserServiceimpl;
import com.example.ems_thymeleaf.utils.ValidateImageCodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("code")
    public void GetImage(HttpSession session, HttpServletResponse response) throws IOException {
        String securityCode = ValidateImageCodeUtils.getSecurityCode();
        BufferedImage image = ValidateImageCodeUtils.createImage(securityCode);
        session.setAttribute("code", securityCode);
        ServletOutputStream outputStream = response.getOutputStream();
        ImageIO.write(image, "png", outputStream);
    }


    @PostMapping("/register")
    public String register(UserEntity userEntity, HttpSession session, String code) {
        String seesioncode = (String) session.getAttribute("code");
        if (seesioncode.equalsIgnoreCase(code)) {
            userService.regist(userEntity);
            return "redirect:/index";
        } else {
            return "redirect:/error";
        }

    }

    @PostMapping("login")
    public String login(String username, String password) {
        UserEntity login = userService.login(username, password);
        if (login != null) {
            return "redirect:/emp/findAll";
        } else {
            return "redirect:/error";
        }
    }

}

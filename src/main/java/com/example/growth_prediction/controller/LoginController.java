package com.example.growth_prediction.controller;

import com.example.growth_prediction.common.DoctorDAO;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "index";
    }

    @RequestMapping("/login")
    public String login(Model model, String doctor_id, String doctor_pw) {
        int result = DoctorDAO.login(doctor_id, doctor_pw);

        if (result == 1) {
            return "main";
        }

        return "redirect:/";
    }

    @RequestMapping("/logout")
    public String logout() {

        return "index";
    }
}

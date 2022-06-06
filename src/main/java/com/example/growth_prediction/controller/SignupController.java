package com.example.growth_prediction.controller;

import com.example.growth_prediction.common.DoctorDAO;
import com.example.growth_prediction.common.DoctorDTO;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignupController {

    @RequestMapping("/signup")
    public String signup() {
        return "signup";
    }

    @RequestMapping("/sign")
    public String sign(Model model,
            DoctorDTO doctorDTO) {
        DoctorDAO doctorDAO = new DoctorDAO();
        int result = doctorDAO.join(doctorDTO.getDoctor_id(), doctorDTO.getDoctor_pw(), doctorDTO.getDoctor_name(),
                doctorDTO.getDoctor_email(), doctorDTO.getHospital(), doctorDTO.getDoctor_number());
        model.addAttribute("result", result);

        return "redirect:/";
    }
}

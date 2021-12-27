package com.tripolskaya.laba5.controllers;

import com.tripolskaya.laba5.entities.Reception;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("DoctorAppointment")
public class ReceptionController {
    @RequestMapping("/AddNewAppointmentToDoctor")
    public String ShowPageAddingNewSpecialist(Model model)
    {
        model.addAttribute("appointment", new Reception());
        return "PageAdding/AddingAppointmentToDoctorPage";
    }
    @RequestMapping("/ShowNewAppointmentToDoctor")
    public String ShowPageAppointmentToDoctor(@Valid @ModelAttribute("appointment")Reception reception, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
        {
            return "PageAdding/AddingAppointmentToDoctorPage";
        }
        return "PageShow/ShowAppointmentToDoctorPage";
    }
}

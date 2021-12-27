package com.tripolskaya.laba5.controllers;

import com.tripolskaya.laba5.entities.Medical_histories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("Medical_history")
public class MedicalHistoriesController {
    @RequestMapping("/AddNewMedicalHistory")
    public String ShowPageAddingNewMedicalHistory(Model model)
    {
        model.addAttribute("medical_history", new Medical_histories());
        return "PageAdding/AddingMedicalHistoryPage";
    }
    @RequestMapping("/ShowNewMedicalHistory")
    public String ShowPageNewPet(@Valid @ModelAttribute("medical_history")Medical_histories medical_history, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
            return "PageAdding/AddingMedicalHistoryPage";
        return "PageShow/ShowNewMedicalHistoryPage";
    }
}

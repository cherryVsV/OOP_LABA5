package com.tripolskaya.laba5.controllers;

import com.tripolskaya.laba5.entities.Specialists;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("Specialists")
public class SpecialistsController {
    @RequestMapping("/AddNewSpecialist")
    public String ShowPageAddingNewSpecialist(Model model)
    {
        model.addAttribute("specialist", new Specialists());
        return "PageAdding/AddingSpecialistPage";
    }
    @RequestMapping("/ShowNewSpecialist")
    public String ShowPageNewPet(@Valid @ModelAttribute("specialist") Specialists specialist, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
            return "PageAdding/AddingSpecialistPage";
        return "PageShow/ShowNewSpecialistPage";
    }
}

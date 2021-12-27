package com.tripolskaya.laba5.controllers;

import com.tripolskaya.laba5.entities.Owners;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("Owners")
public class OwnersController {
    @RequestMapping("/AddNewOwner")
    public String ShowPageAddingNewOwner(Model model)
    {
        model.addAttribute("owner", new Owners());
        return "PageAdding/AddingOwnerPage";
    }
    @RequestMapping("/ShowNewOwner")
    public String ShowPageNewPet(@Valid @ModelAttribute("owner") Owners owner, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
            return "PageAdding/AddingOwnerPage";
        return "PageShow/ShowNewOwnerPage";
    }
}

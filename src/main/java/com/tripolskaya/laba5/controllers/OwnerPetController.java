package com.tripolskaya.laba5.controllers;

import com.tripolskaya.laba5.entities.OwnerPet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("Owner_Pet")
public class OwnerPetController {
    @RequestMapping("/AddNewOwnerPet")
    public String ShowPageAddingNewOwner(Model model)
    {
        model.addAttribute("owner_pet", new OwnerPet());
        return "PageAdding/AddingPetToOwnerPage";
    }
    @RequestMapping("/ShowNewOwnerOfPet")
    public String ShowPageNewOwnerOfPet(@Valid @ModelAttribute("owner_pet") OwnerPet owner_pet, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
        {
            return "PageAdding/AddingPetToOwnerPage";
        }
        return "PageShow/ShowNewOwnerOfPetPage";
    }
}

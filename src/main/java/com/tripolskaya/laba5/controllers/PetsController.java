package com.tripolskaya.laba5.controllers;

import com.tripolskaya.laba5.entities.Pets;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("Pets")
public class PetsController {
    @RequestMapping("/AddNewPet")
    public String ShowPageAddingNewPet(Model model)
    {
        model.addAttribute("pet", new Pets());
        return "PageAdding/AddingPetPage";
    }
    @RequestMapping("/ShowNewPet")
    public String ShowPageNewPet(@Valid @ModelAttribute("pet") Pets pet, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
            return "PageAdding/AddingPetPage";
        return "PageShow/ShowNewPetPage";
    }
    /*public String ShowPageNewPet(HttpServletRequest request, Model model)
    {
        String nickname = request.getParameter("petNickname");
        model.addAttribute("nickname", nickname);
        return "PageShow/showNewPetPage";
    }*/
}

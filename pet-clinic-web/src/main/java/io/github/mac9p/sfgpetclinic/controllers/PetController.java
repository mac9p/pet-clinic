package io.github.mac9p.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pets")
public class PetController {

    @RequestMapping("")
    public String listPets() {
        return "pets/index";
    }
}

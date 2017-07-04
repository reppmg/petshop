package com.repp.controller;

import com.repp.services.PetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 1 on 02.07.2017.
 */

@Controller
@RequestMapping("/pet")
public class PetsController {

    @Autowired
    PetsService petsService;

    @RequestMapping(method = RequestMethod.GET)
    public String getPets(ModelMap modelMap){

        return "pet";
    }
}

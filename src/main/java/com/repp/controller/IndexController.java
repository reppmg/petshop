package com.repp.controller;

import com.repp.services.MastersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    MastersService mastersService;

    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) throws Exception{
        return "index";
    }
}

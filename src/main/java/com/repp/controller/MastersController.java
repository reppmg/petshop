package com.repp.controller;

import com.repp.services.MastersService;
import com.repp.model.Master;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.sql.DataSource;

@Controller
@RequestMapping("/master")
public class MastersController {

    @Autowired
    DataSource dataSource;

    @Autowired
    MastersService mastersService;


    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) throws Exception{
        Master master = mastersService.getAllMasters().get(0);
        model.addAttribute("name", master.getName());
        model.addAttribute("phone", master.getPhone());
        model.addAttribute("mail", master.getMail());

        return "master";
    }
}

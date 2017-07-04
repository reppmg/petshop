package com.repp.controller;

import com.repp.model.Master;
import com.repp.services.MastersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 1 on 03.07.2017.
 */
@Controller
@RequestMapping("masters")
public class MastersRestController {

    @Autowired
    MastersService mastersService;


    /**
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    Object getMasters() {
        final List<Master> allMasters = mastersService.getAllMasters();
        return beautifyData(allMasters, allMasters.size());
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Object getMasterById(@PathVariable Long id) {
        return beautifyData(mastersService.getMasterById(id), 1);
    }


    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody boolean insertMaster(@RequestBody Map<String , String > params){
        final Master master = new Master();
        master.setMail(params.get("mail"));
        master.setName(params.get("name"));
        master.setPhone(params.get("phone"));
        mastersService.insertMaster(master);
        return true;
    }

    @RequestMapping(value = "/{id}",
            method = RequestMethod.PUT)
    public @ResponseBody boolean updatePet(@RequestBody Map<String , String > params, @PathVariable Long id){
        final Master master = new Master();
        master.setMail(params.get("mail"));
        master.setName(params.get("name"));
        master.setPhone(params.get("phone"));
        mastersService.updateMaster(master, id);
        return true;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public @ResponseBody boolean deleteMaster(@PathVariable Long id){
        mastersService.deleteMasterById(id);
        return true;
    }

    private Map<String, Object> beautifyData(Object data, int size) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("total", size);
        map.put("data", data);
        map.put("success", true);
        return map;
    }
}

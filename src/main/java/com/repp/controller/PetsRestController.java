package com.repp.controller;

import com.repp.model.Pet;
import com.repp.model.PetWithMaster;
import com.repp.services.PetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 1 on 03.07.2017.
 */
@Controller
@RequestMapping("/pets")
public class PetsRestController {

    @Autowired
    PetsService petsService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    Object getPets() {
        List<PetWithMaster> allPets = petsService.getAllPets();
        return convertToDto(allPets, allPets.size());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Object getPetById(@PathVariable Long id) {
        return convertToDto(petsService.getPetById(id), 1);
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody
    boolean insertPet(@RequestBody Map<String, String> params) {
        Pet pet = new Pet();
        pet.setBirthdate(new Date(Long.valueOf(params.get("birthdate"))));
        pet.setMaster(Long.valueOf(params.get("master")));
        pet.setName(params.get("name"));
        pet.setType(params.get("type"));
        return petsService.insertPet(pet);
    }

    @RequestMapping(value = "/{id}",
            method = RequestMethod.PUT)
    public @ResponseBody
    boolean updatePet(@RequestBody Map<String, String> params, @PathVariable Long id) {
        Pet pet = new Pet();
        pet.setMaster(Long.valueOf(params.get("master")));
        pet.setName(params.get("name"));
        pet.setType(params.get("type"));
        return petsService.updatePet(pet, id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public @ResponseBody
    boolean deleteMaster(@PathVariable Long id) {
        return petsService.deletePetById(id);
    }

    private Map<String, Object> convertToDto(Object data, int size) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("total", size);
        map.put("data", data);
        map.put("success", true);

        return map;
    }
}

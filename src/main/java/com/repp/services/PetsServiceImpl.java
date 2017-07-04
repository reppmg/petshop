package com.repp.services;

import com.repp.dao.PetMapper;
import com.repp.model.Pet;
import com.repp.model.PetWithMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 1 on 02.07.2017.
 */
@Service
public class PetsServiceImpl implements PetsService {

    @Autowired
    PetMapper petMapper;

    public List<PetWithMaster> getAllPets() {
        return petMapper.getAllPets();
    }

    @Override
    public void updatePet(Pet pet, Long id) {
        petMapper.updatePet(pet, id);
    }

    public void insertPet(Pet pet) {
        petMapper.insertPet(pet);
    }

    public Pet getPetById(Long id) {
        return petMapper.getPetById(id);
    }
}

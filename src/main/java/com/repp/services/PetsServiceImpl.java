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
    public boolean deletePetById(Long id) {
        return petMapper.deletePetById(id);
    }

    @Override
    public boolean updatePet(Pet pet, Long id) {
        return petMapper.updatePet(pet, id);
    }

    public boolean insertPet(Pet pet) {
        return petMapper.insertPet(pet);
    }

    public Pet getPetById(Long id) {
        return petMapper.getPetById(id);
    }
}

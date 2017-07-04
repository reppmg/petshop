package com.repp.dao;

import com.repp.model.Pet;
import com.repp.model.PetWithMaster;

import java.util.List;

/**
 * Created by 1 on 02.07.2017.
 */
public interface PetMapper {
    List<PetWithMaster> getAllPets();

    Pet getPetById(Long id);

    void insertPet(Pet pet);

    void updatePet(Pet pet, Long id);

    void deletePetById(Long id);
}

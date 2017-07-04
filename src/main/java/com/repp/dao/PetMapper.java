package com.repp.dao;

import com.repp.model.Pet;
import com.repp.model.PetWithMaster;

import java.util.List;

/**
 * Created by 1 on 02.07.2017.
 */
public interface PetMapper {
    List<PetWithMaster> getAllPetWithMasters();

    Pet getPetById(Long id);

    boolean insertPet(Pet pet);

    boolean updatePet(Pet pet, Long id);

    boolean deletePetById(Long id);
}

package com.repp.services;

import com.repp.dao.PetMapper;
import com.repp.model.Pet;
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

    public List<Pet> getAllPets() {
        return petMapper.getAllPets();
    }
}

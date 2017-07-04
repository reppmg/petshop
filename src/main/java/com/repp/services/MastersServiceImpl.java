package com.repp.services;

import com.repp.dao.MasterMapper;
import com.repp.model.Master;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 1 on 02.07.2017.
 */
@Service
public class MastersServiceImpl implements MastersService {

    @Autowired
    private MasterMapper masterMapper;

    public List<Master> getAllMasters() {
        return masterMapper.getAllMasters();
    }

    @Override
    public void deleteMasterById(Long id) {
        masterMapper.deleteMasterById(id);
    }

    @Override
    public void updateMaster(Master master, Long id) {
        masterMapper.updateMaster(master, id);
    }

    @Override
    public void insertMaster(Master master) {
        masterMapper.insertMaster(master);
    }

    public Master getMasterById(Long id) {
        return masterMapper.getMasterById(id);
    }
}

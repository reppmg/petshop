package com.repp.Services;

import com.repp.dao.MasterMapper;
import com.repp.model.Master;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by 1 on 02.07.2017.
 */
public class TheServiceImpl implements TheService {

    @Autowired
    private MasterMapper masterMapper;

    public List<Master> getAllMasters() {
        return masterMapper.getAllMasters();
    }
}

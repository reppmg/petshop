package com.repp.dao;

import com.repp.model.Master;

import java.util.List;

/**
 * Created by 1 on 02.07.2017.
 */
public interface MasterMapper {

    List<Master> getAllMasters();

    Master getMasterById(Long id);

    boolean insertMaster(Master master);

    boolean updateMaster(Master master, Long id);

    boolean deleteMasterById(Long id);
}

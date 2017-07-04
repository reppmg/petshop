package com.repp.services;

import com.repp.model.Master;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 1 on 02.07.2017.
 */
@Service
public interface MastersService {
    List<Master> getAllMasters();

    Master getMasterById(Long id);

    boolean insertMaster(Master master);

    boolean updateMaster(Master master, Long id);

    boolean deleteMasterById(Long id);
}

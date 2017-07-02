package com.repp.Services;

import com.repp.model.Master;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 1 on 02.07.2017.
 */
@Service
public interface TheService {
    List<Master> getAllMasters();
}

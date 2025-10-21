package com.mfsys.cargo.service;

import com.mfsys.cargo.model.Load;
import java.util.List;

public interface LoadService {
    Load saveLoad(Load load);
    List<Load> getAllLoads();
    Load getLoadById(Long id);
    Load getLoadByOrderNumber(String orderNumber);
}

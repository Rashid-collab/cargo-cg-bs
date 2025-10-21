package com.mfsys.cargo.service;

import com.mfsys.cargo.model.Load;
import com.mfsys.cargo.repository.LoadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoadServiceImpl implements LoadService {

    private final LoadRepository loadRepository;

    @Autowired
    public LoadServiceImpl(LoadRepository loadRepository) {
        this.loadRepository = loadRepository;
    }

    @Override
    public Load saveLoad(Load load) {
        return loadRepository.save(load);
    }

    @Override
    public List<Load> getAllLoads() {
        return loadRepository.findAll();
    }

    @Override
    public Load getLoadById(Long id) {
        Optional<Load> optionalLoad = loadRepository.findById(id);
        return optionalLoad.orElse(null);
    }

    @Override
    public Load getLoadByOrderNumber(String orderNumber) {
        return loadRepository.findByOrderNumber(orderNumber);
    }
}

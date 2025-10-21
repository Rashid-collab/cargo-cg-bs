package com.mfsys.cargo.controller;

import com.mfsys.cargo.model.Load;
import com.mfsys.cargo.service.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loads")
public class LoadController {

    private final LoadService loadService;

    @Autowired
    public LoadController(LoadService loadService) {
        this.loadService = loadService;
    }

    @PostMapping
    public ResponseEntity<Load> createLoad(@RequestBody Load load) {
        Load savedLoad = loadService.saveLoad(load);
        return ResponseEntity.ok(savedLoad);
    }

    @GetMapping
    public ResponseEntity<List<Load>> getAllLoads() {
        return ResponseEntity.ok(loadService.getAllLoads());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Load> getLoadById(@PathVariable Long id) {
        Load load = loadService.getLoadById(id);
        return load != null ? ResponseEntity.ok(load) : ResponseEntity.notFound().build();
    }

    @GetMapping("/order/{orderNumber}")
    public ResponseEntity<Load> getLoadByOrderNumber(@PathVariable String orderNumber) {
        Load load = loadService.getLoadByOrderNumber(orderNumber);
        return load != null ? ResponseEntity.ok(load) : ResponseEntity.notFound().build();
    }
}

package com.mfsys.cargo.repository;

import com.mfsys.cargo.model.Load;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoadRepository extends JpaRepository<Load, Long> {

    Load findByOrderNumber(String orderNumber);
}

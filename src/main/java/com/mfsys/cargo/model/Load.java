package com.mfsys.cargo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "lm_load")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Load {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderNumber;

    private Double length;

    private Double weight;

    private String commodity;
}

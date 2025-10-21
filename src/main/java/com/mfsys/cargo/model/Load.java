package com.mfsys.cargo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "lm-load")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Load {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_number", nullable = false, unique = true, length = 50)
    private String orderNumber;

    @Column(name = "length", nullable = false)
    private Double length;

    @Column(name = "weight", nullable = false)
    private Double weight;

    @Column(name = "commodity", length = 100)
    private String commodity;
}

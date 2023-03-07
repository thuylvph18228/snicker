package com.poly.snicker.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "bill_product")
public class BillProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bill_pro_id")
    private Integer billProId;

    private Double amount;

    private Double price;

    private int quantity;
}

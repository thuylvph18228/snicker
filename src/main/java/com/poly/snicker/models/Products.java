package com.poly.snicker.models;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_id")
    private Integer prodID;

    @Column(name = "name_prod")
    private String nameProd;

    private String gender;

    @Column(name = "total_amount")
    private String totalAmount;

    private String available;

    @CreationTimestamp
    @Column(updatable = false)
    protected LocalDateTime createdAt;

    @UpdateTimestamp
    protected LocalDateTime updatedAt;

}

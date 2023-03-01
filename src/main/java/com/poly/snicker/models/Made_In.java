package com.poly.snicker.models;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "made_in")
public class Made_In {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "org_id")
    private Integer orgID;

    private String country;

    @CreationTimestamp
    @Column(updatable = false)
    protected LocalDateTime createdAt;

    @UpdateTimestamp
    protected LocalDateTime updatedAt;

}

package com.poly.snicker.models;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "acc_id")
    private Integer accID;

    @Column(name = "username")
    private String userName;

    @Column(name = "fullname")
    private String fullName;

    private String password;

    private String email;

    private int phone;

    private String gender;

    @Column(name = "birthdate")
    private LocalDateTime birthDate;

    @CreationTimestamp
    @Column(updatable = false)
    protected LocalDateTime createdAt;

    @UpdateTimestamp
    protected LocalDateTime updatedAt;

//    @ManyToOne
//    @JoinColumn(name = "role_id")
//    private Roles role;
//
//    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
//    private List<Address> addresses;
}

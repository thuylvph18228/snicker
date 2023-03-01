package com.poly.snicker.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Getter
@Setter
@Table(name = "roles")
public class Roles implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    Integer roleID;

    @Column(name = "name_role")
    String nameRole;

//    @OneToMany(mappedBy = "roles", cascade = CascadeType.ALL)
//    private List<Accounts> accounts;

}

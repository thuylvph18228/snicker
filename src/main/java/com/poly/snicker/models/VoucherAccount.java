package com.poly.snicker.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "voucher_account")
public class VoucherAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vcacc_id")
    private Integer proCateId;

    private String status;
}

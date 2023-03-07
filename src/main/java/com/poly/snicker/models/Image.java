package com.poly.snicker.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "img_id")
    private Integer imgID;

    @Column(name = "alt_text")
    private String altText;

    @Column(name = "image_path")
    private String imagePath;

    @Column(name = "update_at")
    private String updateAt;

    @Column(name = "create_at")
    private String createAt;
}

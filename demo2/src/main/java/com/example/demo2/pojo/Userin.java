package com.example.demo2.pojo;


import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "USERIN")
public class Userin {
    @Id
    @GeneratedValue
    private Long userid;


    @Column(nullable = false)
    private String uname;


    @Column(nullable = false)
    private String upwd;


}

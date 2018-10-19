package com.example.demo2.pojo;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "USERINFO")
public class Userinfo {
    @Id
    @GeneratedValue
    private Long userinfoid;
    @Column(nullable = false)
    private String useradd;
    @Column(nullable = false)
    private Integer userage;


    @JoinColumn(name = "userinid")
    @ManyToOne(cascade = CascadeType.ALL)
    private Userin userins;

    public Long getUserinfoid() {
        return userinfoid;
    }

    public void setUserinfoid(Long userinfoid) {
        this.userinfoid = userinfoid;
    }

    public String getUseradd() {
        return useradd;
    }

    public void setUseradd(String useradd) {
        this.useradd = useradd;
    }

    public Integer getUserage() {
        return userage;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }

    public Userin getUserins() {
        return userins;
    }

    public void setUserins(Userin userins) {
        this.userins = userins;
    }
}

package com.ani.mappings.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nm;

    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
    private List<Permission> permissions;

    @OneToOne(mappedBy = "user")
    private UserAccount account;

    @ManyToMany(mappedBy = "user")
    private List<MobileApp> app;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }
}

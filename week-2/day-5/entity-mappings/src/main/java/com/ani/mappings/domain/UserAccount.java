package com.ani.mappings.domain;


import javax.persistence.*;
import java.sql.Date;

@Entity
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date created;

    @OneToOne
    @JoinColumn(name = "user_id")
    private AppUser user;
}

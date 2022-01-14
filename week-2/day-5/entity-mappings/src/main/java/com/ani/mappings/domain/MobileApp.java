package com.ani.mappings.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class MobileApp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String appNm;
    private Boolean isFree;

    @ManyToMany
    @JoinTable(
            name="mobile_user",
            joinColumns = @JoinColumn(
                    referencedColumnName = "id",
                    name = "app_user_id"
            ),
            inverseJoinColumns = @JoinColumn(
                    referencedColumnName = "id",
                    name = "mobile_app_id"
            )
    )
    private List<AppUser> user;
}

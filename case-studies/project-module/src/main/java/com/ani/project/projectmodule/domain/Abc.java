package com.ani.project.projectmodule.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Data
@Entity
public class Abc {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @Column(unique = false, nullable = true)
    private LocalDate dt;

    @Column(unique = false, nullable = false)
    private Integer num;
}

package com.ani.project.projectmodule.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Abc {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    @NotNull
    @Column(unique = true, nullable = false)
    private String name;

    @Column(unique = false, nullable = true)
    private LocalDate dt;

    @NotNull
    @Column(unique = false, nullable = false)
    private Integer num;
}

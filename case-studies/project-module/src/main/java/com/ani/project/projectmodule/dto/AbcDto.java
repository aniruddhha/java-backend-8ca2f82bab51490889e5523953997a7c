package com.ani.project.projectmodule.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Setter
@Getter
public class AbcDto {
    private Long id;
    private String name;
    private LocalDate dt;
    private Integer num;
}

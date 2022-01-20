package com.ani.project.projectmodule.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@AllArgsConstructor
@Setter
@Getter
public class AbcDto {
    private Long id;
    private String name;
    private Date dt;
    private Integer num;
}

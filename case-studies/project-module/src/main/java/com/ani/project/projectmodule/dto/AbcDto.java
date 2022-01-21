package com.ani.project.projectmodule.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@AllArgsConstructor
@Setter
@Getter
public class AbcDto {
    private Long id;

    @NotBlank
    @NotNull
    private String name;
    private LocalDate dt;

    @Max(100)
    @NotNull
    private Integer num;
}

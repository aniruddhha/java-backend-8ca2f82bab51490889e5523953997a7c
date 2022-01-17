package com.ani.abc.abcmicroservice.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@Data
public class Pqr {
    private Long id;
    private String name;
    private LocalDate date;
}

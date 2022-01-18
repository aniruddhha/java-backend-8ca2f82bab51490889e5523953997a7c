package com.ani.pqr.domain;

import lombok.*;

import java.time.LocalDate;

@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Pqr {
    private Long id;
    private String name;
    private LocalDate date;
}

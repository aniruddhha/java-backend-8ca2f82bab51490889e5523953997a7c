package com.ani.pqr.controller;

import com.ani.pqr.domain.Pqr;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/api/pqr")
@RestController
public class PqrController {

    private final List<Pqr> pqrs = List.of(
            new Pqr(1L, "abc", LocalDate.of(2021, 1, 1)),
            new Pqr(2L, "pqr", LocalDate.of(2023, 2, 14)),
            new Pqr(3L, "xyz", LocalDate.of(2022, 8, 10)),
            new Pqr(4L, "lmn", LocalDate.of(2020, 6, 3)),
            new Pqr(5L, "hji", LocalDate.of(1989, 4, 23)),
            new Pqr(6L, "vbt", LocalDate.of(1999, 10, 5))
    );

    @GetMapping
    public ResponseEntity<Pqr> get() {
        var pqr = new Pqr();
        pqr.setDate(LocalDate.of(2021,1,1));
        pqr.setId(10L);
        pqr.setName("abc");

        return ResponseEntity.ok(pqr);
    }

    @PostMapping
    public ResponseEntity<Pqr> post(@RequestBody Pqr pqr) {

        var pqrLaterTwoDays = new Pqr(
                pqr.getId(),
                pqr.getName(),
                pqr.getDate().plus(2, ChronoUnit.DAYS)
        );

        return ResponseEntity.ok(pqrLaterTwoDays);
    }

    @GetMapping("/{st}/{ed}")
    public ResponseEntity<List<Pqr>> findPqr(
            @PathVariable String st,
            @PathVariable String ed
    ) {
        var lcSt = LocalDate.parse(st);
        var lcEd = LocalDate.parse(ed);

        List<Pqr> filtered = pqrs.stream()
                .filter( p -> p.getDate().isAfter(lcSt) && p.getDate().isBefore(lcEd))
                .collect(Collectors.toList());

        return ResponseEntity.ok(filtered);
    }

}

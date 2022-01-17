package com.ani.abc.abcmicroservice.controller;

import com.ani.abc.abcmicroservice.dto.Pqr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/api/abc")
@RestController
public class AbcController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("i am abc");
    }

    @GetMapping("/{st}/{ed}")
    public ResponseEntity<List<String>> postInAbc(
            @PathVariable String st,
            @PathVariable String ed
            ){

        var lcSt = LocalDate.parse(st);
        var lcEd = LocalDate.parse(ed);

        ResponseEntity<List<Pqr>> entity = restTemplate.exchange(
                "http://localhost:8080/api/pqr/" + lcSt.toString() +"/"+ lcEd.toString(),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() { }
        );

        List<String> names = entity.getBody()
                .stream()
                .map( p -> p.getName())
                .collect(
                        Collectors.toList()
                );

        return ResponseEntity.ok(names);
    }
}

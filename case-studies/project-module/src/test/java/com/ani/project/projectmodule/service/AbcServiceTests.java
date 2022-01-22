package com.ani.project.projectmodule.service;

import com.ani.project.projectmodule.domain.Abc;
import com.ani.project.projectmodule.dto.AbcDto;
import com.ani.project.projectmodule.repository.AbcRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.util.List;

@ExtendWith(SpringExtension.class)
public class AbcServiceTests {

    @Mock
    private AbcRepository repository;

    @InjectMocks
    private AbcService service = new AbcServiceImpl();


    @Test
    void testSize() {
        Mockito.when(
                repository.findAll()
        ).thenReturn(
                List.of(
                        new Abc(1L, "abc", LocalDate.of(2021,1,1), 10),
                        new Abc(2L, "pqr", LocalDate.of(2021,1,2), 20)
                )
        );

        var dtos = service.findAll();
        Assertions.assertEquals(2, dtos.size());
    }
}

package com.ani.project.projectmodule.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.time.LocalDate;

public class AbcTests {

    @DisplayName("Domain : Checking Object Creation")
    @Test
    void testObjectCreation() {
        var abc = new Abc();
        Assertions.assertNotNull(abc);
    }

    @DisplayName("Domain : Checking getters and setters")
    @Test
    void testObjectGettersSetters() {
        var abc = new Abc();
        abc.setNum(10);
        abc.setDt(LocalDate.of(2021,1,1));
        abc.setName("abc");
        abc.setId(10L);

        Assertions.assertEquals(10, abc.getNum());
        Assertions.assertEquals(
                LocalDate.of(2021,1,1),
                abc.getDt()
        );
        Assertions.assertEquals("abc", abc.getName());
        Assertions.assertEquals(10, abc.getId());
    }

}

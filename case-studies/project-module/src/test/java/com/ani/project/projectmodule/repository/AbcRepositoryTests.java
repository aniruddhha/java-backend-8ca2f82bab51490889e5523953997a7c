package com.ani.project.projectmodule.repository;

import com.ani.project.projectmodule.domain.Abc;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.Date;
import java.time.LocalDate;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class AbcRepositoryTests {

    @Autowired
    private AbcRepository repository;

    @DisplayName("Abc Repo : Creating Abc")
    @Test
    public void testCreateAbc() {

        var abc = new Abc();
        abc.setId(565L);
        abc.setName("abc");
        abc.setNum(56);
        abc.setDt(LocalDate.now());

        repository.save(abc);
    }
}

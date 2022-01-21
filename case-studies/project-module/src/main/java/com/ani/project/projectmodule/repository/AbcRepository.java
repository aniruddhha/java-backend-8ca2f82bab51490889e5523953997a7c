package com.ani.project.projectmodule.repository;

import com.ani.project.projectmodule.domain.Abc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AbcRepository extends JpaRepository<Abc, Long> {
    List<Abc> findByDtBetween(LocalDate st, LocalDate ed);
}

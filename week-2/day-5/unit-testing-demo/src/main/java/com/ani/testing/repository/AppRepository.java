package com.ani.testing.repository;

import com.ani.testing.domain.App;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface AppRepository extends JpaRepository<App, Long> {
    List<App> findByPubDtBetween(Date st, Date ed);
}

package com.ani.orm.repository;

import com.ani.orm.domain.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarCrudRepo extends CrudRepository<Car, Long > {

    @Override
    List<Car> findAll();
}

package com.ani.springdata.jdbc.controller;

import com.ani.springdata.jdbc.domain.Emp;
import com.ani.springdata.jdbc.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/db")
@RestController
public class DbController {

    @Autowired
    private DbService service;

    @PostMapping // POST - http://localhost:8080/db
    public String save(@RequestBody Emp emp) {
        service.saveOperation(
                emp.getId(),
                emp.getName(),
                emp.getDob(),
                emp.getManager()
        );
        return "Employee Saved";
    }

    @PostMapping(value = "/v2") // POST - http://localhost:8080/db/v2
    public String saveV2(@RequestBody Emp emp) { // json to java specific object
        service.saveOpV2(emp);
        return "Employee Saved";
    }

    @GetMapping // GET - http://localhost:8080/db/ // java specific object to json
    public @ResponseBody List<Emp> employees() {
        return service.findEmployees();
    }
}

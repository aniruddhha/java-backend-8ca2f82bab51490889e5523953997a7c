package com.ani.project.projectmodule.controller;

import com.ani.project.projectmodule.dto.AbcDto;
import com.ani.project.projectmodule.dto.AppResponse;
import com.ani.project.projectmodule.service.AbcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/abc")
@RestController
public class AbcController {

    @Autowired
    private AbcService service;

    @PostMapping
    public ResponseEntity<AppResponse<AbcDto>> createAbc(@RequestBody AbcDto dto) {

        var svObj = service.createAbc(dto);

        var response = new AppResponse<AbcDto>();
        response.setStatus("success");
        response.setMessage("Abc saved successfully");
        response.setBody(svObj);

        return ResponseEntity.ok(response);
    }
}

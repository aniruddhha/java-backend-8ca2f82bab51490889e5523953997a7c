package com.ani.project.projectmodule.controller;

import com.ani.project.projectmodule.dto.AbcDto;
import com.ani.project.projectmodule.dto.AppResponse;
import com.ani.project.projectmodule.service.AbcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/abc")
@RestController
public class AbcController {

    @Autowired
    private AbcService service;

    @PostMapping
    public ResponseEntity<AppResponse<AbcDto>> createAbc(@Valid @RequestBody AbcDto dto) {

        var svObj = service.createAbc(dto);

        var response = new AppResponse<AbcDto>();
        response.setStatus("success");
        response.setMessage("Abc saved successfully");
        response.setBody(svObj);

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{locality}/{doctor}")
    public ResponseEntity<AppResponse<List<AbcDto>>> findLocalityDoctor(@PathVariable String locality, @PathVariable String doctor) {
        return null;
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({MethodArgumentNotValidException.class})
    public Map<String, String> handleExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> messages = new HashMap<>();

       List<ObjectError> errors = ex.getBindingResult().getAllErrors();

       for(ObjectError oe : errors) {
           FieldError fe = (FieldError) oe;

           String errorField = fe.getField(); // it will tell. which is error filed
           String errorMessage = fe.getDefaultMessage(); // what is error message

           messages.put(errorField, errorMessage);
       }

       return messages;
    }
}

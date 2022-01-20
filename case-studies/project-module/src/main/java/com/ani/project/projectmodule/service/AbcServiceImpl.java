package com.ani.project.projectmodule.service;

import com.ani.project.projectmodule.domain.Abc;
import com.ani.project.projectmodule.dto.AbcDto;
import com.ani.project.projectmodule.repository.AbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AbcServiceImpl implements AbcService{

    @Autowired
    private AbcRepository repository;

    @Override
    public AbcDto createAbc(AbcDto dto) {

        var abc = new Abc();
        abc.setDt(dto.getDt());
        abc.setName(dto.getName());
        abc.setNum(dto.getNum());
        repository.save(abc);

        return dto;
    }
}

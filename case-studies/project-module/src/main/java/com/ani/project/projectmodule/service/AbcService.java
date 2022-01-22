package com.ani.project.projectmodule.service;

import com.ani.project.projectmodule.dto.AbcDto;

import java.util.List;

public interface AbcService {

    public AbcDto createAbc(AbcDto dto);

    public List<AbcDto> findAll();

    List<AbcDto> findAbcByLocalityAndDoctor(String loc, String doc);

    List<AbcDto> findTenDaysBack();
}

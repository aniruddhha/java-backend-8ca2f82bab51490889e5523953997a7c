package com.ani.project.projectmodule.service;

import com.ani.project.projectmodule.domain.Abc;
import com.ani.project.projectmodule.dto.AbcDto;
import com.ani.project.projectmodule.repository.AbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<AbcDto> findAll() {

        List<Abc> abcs = repository.findAll();

        List<AbcDto> dtos = new ArrayList<>();
        for (int i = 0; i < abcs.size(); i++) {

            Abc abc = abcs.get(i); // you are getting ith element

            AbcDto dto = new AbcDto(
                    abc.getId(),
                    abc.getName(),
                    abc.getDt(),
                    abc.getNum()
            );
            dtos.add(dto);
        }

//        List<AbcDto> dtos1 = abcs.stream()
//                .map( abc -> new AbcDto(abc.getId(),abc.getName(),abc.getDt(), abc.getNum()) )
//                .collect(Collectors.toList());

        return dtos;
    }

    @Override
    public List<AbcDto> findAbcByLocalityAndDoctor(String loc, String doc) {
        return null;
    }

    @Override
    public List<AbcDto> findTenDaysBack() {

        LocalDate dt = LocalDate.now();
        LocalDate backDate = dt.minusDays(10);
        return null;
    }
}

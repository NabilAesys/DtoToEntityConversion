package com.nbl.DtoToEntityConversion.controller;


import java.util.List;

import com.nbl.DtoToEntityConversion.converter.StudentConverter;
import com.nbl.DtoToEntityConversion.dto.StudentDto;
import com.nbl.DtoToEntityConversion.entity.Student;
import com.nbl.DtoToEntityConversion.repo.StudentRepository;
import com.nbl.DtoToEntityConversion.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/findAll")
    public List<StudentDto> findAll() {
        return studentService.findAll();

    }

    @GetMapping("/find/{ID}")
    public StudentDto findById(@PathVariable(value = "ID") Long id) {
        return studentService.findById(id);


    }

    @PostMapping("/save")
    public StudentDto save(@RequestBody StudentDto dto) {

        return studentService.save(dto);
    }

}

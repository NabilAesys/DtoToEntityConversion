package com.nbl.DtoToEntityConversion.service;

import com.nbl.DtoToEntityConversion.converter.StudentConverter;
import com.nbl.DtoToEntityConversion.dto.StudentDto;
import com.nbl.DtoToEntityConversion.entity.Student;
import com.nbl.DtoToEntityConversion.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;
@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    StudentConverter converter;

    public List<StudentDto> findAll() {
        List<Student> findAll = studentRepository.findAll();
        return converter.entityToDto(findAll);
    }

    public StudentDto findById(@PathVariable(value = "ID") Long id) {
        Student orElse = studentRepository.findById(id).orElse(null);
        return converter.entityToDto(orElse);

    }

    public StudentDto save(StudentDto dto) {
        Student student = converter.dtoToEntity(dto);
        student=  studentRepository.save(student);
        return converter.entityToDto(student);
    }
}

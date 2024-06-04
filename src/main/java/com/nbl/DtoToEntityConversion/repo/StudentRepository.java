package com.nbl.DtoToEntityConversion.repo;


import com.nbl.DtoToEntityConversion.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

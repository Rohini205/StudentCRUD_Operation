package com.springBoot.sms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.sms.Entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{


}

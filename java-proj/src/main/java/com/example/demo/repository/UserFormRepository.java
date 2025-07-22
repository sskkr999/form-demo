package com.example.demo.repository;

import com.example.demo.model.UserForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserFormRepository extends JpaRepository<UserForm, Long> {
}

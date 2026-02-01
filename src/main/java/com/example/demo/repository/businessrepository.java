package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Business;

public interface businessrepository extends JpaRepository<Business,Long>{

}

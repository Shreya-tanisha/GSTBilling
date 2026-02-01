package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.invoice;


@Repository
public interface invoicerepository extends JpaRepository<invoice, Integer>{
	@Query("SELECT DISTINCT i FROM invoice i LEFT JOIN FETCH i.items")
        	public List<invoice> findAllWithItems();

}

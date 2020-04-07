package com.example.cirilomoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cirilomoney.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}

package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Long> {

}

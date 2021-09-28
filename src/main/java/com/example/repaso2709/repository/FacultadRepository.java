package com.example.repaso2709.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.repaso2709.model.Facultad;

@Repository
public interface FacultadRepository extends JpaRepository<Facultad, Long>{

}

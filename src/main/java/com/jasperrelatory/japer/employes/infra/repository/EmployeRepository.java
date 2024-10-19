package com.jasperrelatory.japer.employes.infra.repository;

import com.jasperrelatory.japer.employes.infra.entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe, Integer> { }


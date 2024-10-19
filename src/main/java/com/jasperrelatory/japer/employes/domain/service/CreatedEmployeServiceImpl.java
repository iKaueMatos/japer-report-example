package com.jasperrelatory.japer.employes.domain.service;

import com.jasperrelatory.japer.employes.application.request.NewEmployeRequest;
import com.jasperrelatory.japer.employes.application.service.CreatedNewEmployeService;
import com.jasperrelatory.japer.employes.infra.entity.Employe;
import com.jasperrelatory.japer.employes.infra.repository.EmployeRepository;
import org.springframework.stereotype.Service;

@Service
public class CreatedEmployeServiceImpl implements CreatedNewEmployeService {
    private final EmployeRepository employeRepository;

    public CreatedEmployeServiceImpl(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    @Override
    public Boolean create (NewEmployeRequest employeRequest) {
        Employe employe = new Employe(employeRequest.firstname(), employeRequest.lastanme(), employeRequest.age(), employeRequest.office(), employeRequest.anual_remuneration());
        employeRepository.save(employe);
        return true;
    }
}

package com.jasperrelatory.japer.employes.application.service;

import com.jasperrelatory.japer.employes.application.request.NewEmployeRequest;
import org.springframework.http.ResponseEntity;

public interface CreatedNewEmployeService {
    Boolean create(NewEmployeRequest employeRequest);
}

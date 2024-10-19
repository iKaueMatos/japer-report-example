package com.jasperrelatory.japer.employes.application.useCase;

import com.jasperrelatory.japer.employes.application.request.NewEmployeRequest;
import com.jasperrelatory.japer.employes.application.service.CreatedNewEmployeService;
import org.springframework.stereotype.Service;

@Service
public class CreatedNewEmployeUseCase {
    private final CreatedNewEmployeService createdNewEmployeService;

    public CreatedNewEmployeUseCase(CreatedNewEmployeService createdNewEmployeService) {
        this.createdNewEmployeService = createdNewEmployeService;
    }

    public Boolean execute(NewEmployeRequest newEmployeRequest) {
        Boolean result = createdNewEmployeService.create(newEmployeRequest);
        return result;
    }
}

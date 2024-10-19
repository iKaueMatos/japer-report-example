package com.jasperrelatory.japer.employes.infra.http.controller;

import com.jasperrelatory.japer.employes.application.request.NewEmployeRequest;
import com.jasperrelatory.japer.employes.application.useCase.CreatedNewEmployeUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
public class CreatedEmployeController {
    private final CreatedNewEmployeUseCase createdNewEmployeUseCase;

    public CreatedEmployeController(CreatedNewEmployeUseCase createdNewEmployeUseCase) {
        this.createdNewEmployeUseCase = createdNewEmployeUseCase;
    }

    @PostMapping("/employees")
    public ResponseEntity<String> createNewEmployee(@RequestBody NewEmployeRequest newEmployeRequest) {
        try {
            Boolean isEmployeeCreated = createdNewEmployeUseCase.execute(newEmployeRequest);
            if (isEmployeeCreated) {
                URI location = URI.create("/employees/" + newEmployeRequest.firstname());
                return ResponseEntity.created(location).body("Funcionário adicionado com sucesso!");
            }

            return ResponseEntity.badRequest().body("Erro ao adicionar funcionário.");
        } catch (Exception ex) {
            return ResponseEntity.status(500).body("Erro interno ao adicionar funcionário: " + ex.getMessage());
        }
    }
}

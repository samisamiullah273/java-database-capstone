package com.project.back_end.controllers;

import com.project.back_end.models.Prescription;
import com.project.back_end.services.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrescriptionController {

    @Autowired
    private TokenService tokenService;

    @PostMapping("/api/prescriptions/{token}")
    public ResponseEntity<?> savePrescription(@PathVariable String token, @RequestBody Prescription prescription) {
        if (!tokenService.validateToken(token)) {
            return ResponseEntity.status(401).body("Invalid token");
        }
        // In a real app, save prescription via service/repository
        return ResponseEntity.ok(prescription);
    }
}

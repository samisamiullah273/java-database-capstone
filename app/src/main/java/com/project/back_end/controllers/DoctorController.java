package com.project.back_end.controllers;

import com.project.back_end.services.DoctorService;
import com.project.back_end.services.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private TokenService tokenService;

    /**
     * Retrieve doctor's availability for a given date. Requires token validation.
     * Example: GET /api/doctors/5/availability?date=2026-08-04
     */
    @GetMapping("/api/doctors/{id}/availability")
    public ResponseEntity<?> getAvailability(
            @RequestHeader(value = "Role", required = false) String role,
            @PathVariable Long id,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
            @RequestParam String token
    ) {
        if (!tokenService.validateToken(token)) {
            return ResponseEntity.status(401).body("Invalid token");
        }
        List<String> slots = doctorService.getAvailability(id, date);
        return ResponseEntity.ok(slots);
    }

    @GetMapping("/api/doctors")
    public ResponseEntity<?> getAllDoctors() {
        return ResponseEntity.ok("[]"); // placeholder for list of doctors
    }
}

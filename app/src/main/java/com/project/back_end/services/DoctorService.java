package com.project.back_end.services;

import com.project.back_end.models.Doctor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorService {

    // Placeholder implementation that would call repository in real app
    public List<String> getAvailability(Long doctorId, LocalDate date) {
        List<String> slots = new ArrayList<>();
        slots.add(date.toString() + "T09:00");
        slots.add(date.toString() + "T10:30");
        return slots;
    }

    public boolean validateLogin(String email, String password) {
        // Placeholder: validate against DB in real app
        return "doctor@example.com".equals(email) && "password".equals(password);
    }
}

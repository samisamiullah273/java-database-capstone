package com.project.back_end.services;

import com.project.back_end.models.Appointment;
import com.project.back_end.repo.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    // Book a new appointment
    public Appointment bookAppointment(Appointment appointment) {
        // Basic validations would be performed here in a real app
        return appointmentRepository.save(appointment);
    }

    // Retrieve appointments by doctor and date (day)
    public List<Appointment> getAppointmentsByDoctorAndDate(Long doctorId, LocalDate date) {
        LocalDateTime from = date.atStartOfDay();
        LocalDateTime to = date.plusDays(1).atStartOfDay();
        return appointmentRepository.findByDoctorIdAndAppointmentTimeBetween(doctorId, from, to);
    }
}

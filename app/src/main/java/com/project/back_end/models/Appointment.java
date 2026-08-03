package com.project.back_end.models;

import java.time.LocalDateTime;

public class Appointment {
    private Integer id;
    private Integer doctorId;
    private Integer patientId;
    private LocalDateTime appointmentTime;
    private String status;

    // constructors, getters, setters omitted for brevity
}

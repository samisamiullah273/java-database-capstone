# Schema Design (MySQL)

-- Tables

CREATE TABLE Doctor (
  id INT AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR(100),
  last_name VARCHAR(100),
  specialty VARCHAR(100),
  email VARCHAR(150) UNIQUE,
  phone VARCHAR(30)
);

CREATE TABLE Patient (
  id INT AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR(100),
  last_name VARCHAR(100),
  email VARCHAR(150) UNIQUE,
  phone VARCHAR(30),
  dob DATE
);

CREATE TABLE Appointment (
  id INT AUTO_INCREMENT PRIMARY KEY,
  doctor_id INT,
  patient_id INT,
  appointment_time DATETIME,
  status VARCHAR(30),
  notes TEXT,
  FOREIGN KEY (doctor_id) REFERENCES Doctor(id),
  FOREIGN KEY (patient_id) REFERENCES Patient(id)
);

CREATE TABLE Prescription (
  id INT AUTO_INCREMENT PRIMARY KEY,
  appointment_id INT,
  medication VARCHAR(200),
  dosage VARCHAR(100),
  instructions TEXT,
  FOREIGN KEY (appointment_id) REFERENCES Appointment(id)
);

-- Indexes and sample queries
CREATE INDEX idx_doctor_specialty ON Doctor(specialty);

-- Stored procedures (examples)
-- GetDailyAppointmentReportByDoctor
-- GetDoctorWithMostPatientsByMonth
-- GetDoctorWithMostPatientsByYear

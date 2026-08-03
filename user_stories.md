# User Stories

Each story includes: Title, Description (As a..., I want..., So that...), Acceptance Criteria, Priority, Story Points

## Doctor

### D-01: View daily appointments
- Description: As a Doctor, I want to view my daily appointments so that I can manage my schedule.
- Acceptance Criteria:
  - Given a valid doctor token and date, when I request the daily schedule, then I receive a list of appointments for that date.
  - Each appointment includes patient name, appointment time, status, and patient phone.
- Priority: High
- Story Points: 3

### D-02: Update appointment status
- Description: As a Doctor, I want to update appointment status to completed or cancelled so patient records are accurate.
- Acceptance Criteria:
  - Given a valid doctor token, when I update an appointment status, then the appointment record is updated and returned.
- Priority: Medium
- Story Points: 2

## Patient

### P-01: Register and login
- Description: As a Patient, I want to register and log in so I can book appointments.
- Acceptance Criteria:
  - Registration stores unique email and returns patient id.
  - Login returns a JWT token valid for 1 hour.
- Priority: High
- Story Points: 5

### P-02: Search for doctors
- Description: As a Patient, I want to search for doctors by name or specialty so I can find the right provider.
- Acceptance Criteria:
  - Search returns doctors matching name or specialty, with available slots for a date.
- Priority: High
- Story Points: 3

### P-03: View upcoming appointments
- Description: As a Patient, I want to view my upcoming appointments and prescriptions.
- Acceptance Criteria:
  - Given a patient token, the API returns upcoming appointments and linked prescriptions.
- Priority: Medium
- Story Points: 3

## Admin

### A-01: Add a doctor
- Description: As an Admin, I want to add a doctor so the system has current staff information.
- Acceptance Criteria:
  - Admin can create a Doctor record with required fields (firstName, lastName, specialty, email).
  - New doctor appears in doctor list.
- Priority: High
- Story Points: 2

### A-02: Edit doctor details
- Description: As an Admin, I want to edit doctor details so information stays current.
- Acceptance Criteria:
  - Admin can update doctor's phone, specialty, and available times.
- Priority: Medium
- Story Points: 2

### A-03: Remove doctor
- Description: As an Admin, I want to remove a doctor so that inactive staff are not listed.
- Acceptance Criteria:
  - Admin can deactivate or delete a doctor record; active lists exclude removed doctors.
- Priority: Medium
- Story Points: 2

### A-04: View system reports
- Description: As an Admin, I want to view system reports (daily appointments, doctor workload) so I can manage resources.
- Acceptance Criteria:
  - Admin can run stored procedures GetDailyAppointmentReportByDoctor, GetDoctorWithMostPatientsByMonth/Year and see tabular output.
- Priority: High
- Story Points: 5

### A-05: Manage user accounts
- Description: As an Admin, I want to manage patient and doctor accounts (reset password, deactivate) so account issues can be resolved.
- Acceptance Criteria:
  - Admin can reset password, change status, and view account activity history.
- Priority: Low
- Story Points: 3

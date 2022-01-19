## Appointment Module

#### User Stories
- As a user, I would like to create appointment
- As a user, I would like to update appointment
- As a user, I would like to cancel appointment
- As a user, I would like to see all appointments 
- As a user, I would like to search cancelled appointments
- As a user, I would like to search appointments between dates
- As a user, I would like to search appointments for type between dates

#### Database Entities
- Appointment
    - id : primary key number
    - type : non null string (opd, ipd)
    - placedDate : non null date
    - appointmentDate : non null date

#### Hints
- Use JPA Repository - 10 Marks
- Create Service - 10 Marks
- Create Rest Controller - 10 Marks
- Write Unit Test Case - 10 Marks
- Effective Use postman for testing - 5 Marks
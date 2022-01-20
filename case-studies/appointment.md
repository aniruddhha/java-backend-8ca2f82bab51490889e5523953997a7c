## Appointment Module

#### User Stories
- USAP01 : As a user, I would like to create appointment
- USAP02 : As a user, I would like to update appointment
- USAP03 : As a user, I would like to cancel appointment
- USAP04 : As a user, I would like to see all appointments 
- USAP05 : As a user, I would like to search cancelled appointments
- USAP06 : As a user, I would like to search appointments between dates
- USAP07 : As a user, I would like to search appointments for type between dates
- USAP08 : As a user, I would like to search appointments by doctor name
- USAP09 : As a user, I would like to search appointments by type

#### Database Entities
- Appointment
    - id : primary key number
    - type : non null string (opd, ipd)
    - placed date : non null date
    - appointment date : non null date
    - doctor name : can be null string

#### Hints
- Use JPA Repository - 10 Marks
- Create Service - 10 Marks
- Create Rest Controller - 10 Marks
- Write Unit Test Case - 10 Marks
- Effective Use postman for testing - 5 Marks
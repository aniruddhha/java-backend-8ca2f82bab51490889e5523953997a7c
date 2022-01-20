## Billing Module

#### User Stories
- As a user, I would like to create new bill 
- As a user, I would like to update bill
- As a user, I would like to mark bill as paid
- As a user, I would like to see list of all bills
- As a user, I would like to search bills by patient name
- As a user, I would like to search paid bills by given dates 

#### Database Entities
- Bill
    - id : primary key number
    - patientName : non null string
    - billDate : non null date
    - treatment : can be null string
    - paidDate : not null date
    - billStatus : not null boolean (paid, due)

#### Hints
- Use JPA Repository - 10 Marks
- Create Service - 10 Marks
- Create Rest Controller - 10 Marks
- Write Unit Test Case - 10 Marks
- Effective Use postman for testing - 5 Marks

## Billing Module

#### User Stories
- USBIL01 : As a user, I would like to create new bill 
- USBIL02 : As a user, I would like to update bill
- USBIL03 : As a user, I would like to mark bill as paid
- USBIL04 : As a user, I would like to see list of all bills
- USBIL05 : As a user, I would like to search bills by patient name
- USBIL06 : As a user, I would like to search paid bills by given dates 
- USBIL07 : As a user, I would like to search unpaid bills for given treatment
- USBIL08 : As a user, I would like to search the bills with given amount is more than 15000
- USBIL09 : As a user, I would like to see treatment wise bill amount

#### Database Entities
- Bill
    - id : primary key number
    - patient name : non null string
    - bill date : non null date
    - treatment : can be null string
    - paid date : not null date
    - bill status : not null boolean (paid, due)
    - bill amount : not null number

#### Hints
- Use JPA Repository - 10 Marks
- Create Service - 10 Marks
- Create Rest Controller - 10 Marks
- Write Unit Test Case - 10 Marks
- Effective Use postman for testing - 5 Marks

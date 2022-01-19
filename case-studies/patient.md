## Patient Module

#### User Stories 
- As a user, I would like to have patient registration
- As a user, I would like to update patient information
- As a user, I would like to delete patient
- As a user, I would like to see list of registered patients
- As a user, I would like to search patient by name
- As a user, I would like to search patient by between give age

#### Database Entities
- Patient 
  - id : primary key number
  - name : non null string 
  - mobile: can be null string
  - dob : non null date
  - status : non null boolean

#### Hints
- Use JPA Repository - 10 Marks
- Create Service - 10 Marks
- Create Rest Controller - 10 Marks
- Write Unit Test Case - 10 Marks
- Effective Use postman for testing - 5 Marks
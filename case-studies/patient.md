## Patient Module

#### User Stories 
- USPT1 : As a user, I would like to have patient registration
- USPT2 : As a user, I would like to update patient information
- USPT3 : As a user, I would like to delete patient
- USPT4 : As a user, I would like to see list of registered patients
- USPT5 : As a user, I would like to search patient by name
- USPT6 : As a user, I would like to search patient by between give age
- USPT7 : As a user, I would like to search all active patients
- USPT8 : As a user, I would lieke to search all patients who visited 10 days back
- USPT9 : As a user, I would like to find mobile number, name of all patients who visited today 

#### Database Entities
- Patient 
  - id : primary key number
  - name : non null string 
  - mobile: can be null string
  - dob : non null date
  - status : non null boolean
  - last visited : can be null date

#### Hints
- Use JPA Repository - 10 Marks
- Create Service - 10 Marks
- Create Rest Controller - 10 Marks
- Write Unit Test Case - 10 Marks
- Effective Use postman for testing - 5 Marks
## Doctor Module

#### User Stories
- As a user, I would like to have doctor registration
- As a user, I would like to update doctor information
- As a user, I would like to delete doctor
- As a user, I would like to see list of registered doctors
- As a user, I would like to search doctor by specialization
- As a user, I would like to search doctor by hospital locality

#### Database Entities
- Doctor 
  - id : primary key number
  - name : non null string 
  - specialization : non null string  
  - hospital name : can be null string
  - hospital locality : can be null string

#### Hints
- Use JPA Repository - 10 Marks
- Create Service - 10 Marks
- Create Rest Controller - 10 Marks
- Write Unit Test Case - 10 Marks
- Effective Use postman for testing - 5 Marks

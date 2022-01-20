## Doctor Module

#### User Stories
- USDOC1 : As a user, I would like to have doctor registration
- USDOC2 : As a user, I would like to update doctor information
- USDOC3 : As a user, I would like to delete doctor
- USDOC4 : As a user, I would like to see list of registered doctors
- USDOC5 : As a user, I would like to search doctor by specialization
- USDOC6 : As a user, I would like to search doctor by hospital locality
- USDOC7 : As a user, I would like to find visiting doctors for given specialization
- USDOC8 : As a user, I would like to find count of doctors in given locality with given specialization
- USDOC9 : As a user, I would like to find permanent doctors for given specialization 

#### Database Entities
- Doctor 
  - id : primary key number
  - name : non null string 
  - specialization : non null string  
  - hospital name : can be null string
  - hospital locality : can be null string
  - visiting : non null boolean

#### Hints
- Use JPA Repository - 10 Marks
- Create Service - 10 Marks
- Create Rest Controller - 10 Marks
- Write Unit Test Case - 10 Marks
- Effective Use postman for testing - 5 Marks

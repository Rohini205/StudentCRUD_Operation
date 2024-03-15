## Student Management System - Spring Boot (Java)

The Student Management System is a Java-based application developed using Spring Boot framework. It provides RESTful APIs for managing student information, including CRUD operations (Create, Read, Update, Delete), and utilizes the repository class to map the application to a MySQL database. This README file provides an overview of the project, instructions for running the application, and details about the APIs and database configuration.



## Features

1. CRUD Operations:

* Create: Add new students to the system.
* Read: Retrieve student details based on ID or other parameters.
* Update: Modify student information such as name, age, and grade.
* Delete: Remove students from the system.

2. MySQL Database Integration:
* Use of Spring Data JPA and Hibernate to map entities to MySQL database tables.
* Repository class for performing CRUD operations on the database.

3. Spring Security:

* Secure API endpoints with authentication and authorization.
* Implement role-based access control for different user roles (admin, user).
## Installation and Setup

1. Clone the repository to your local machine:


    git clone https://github.com/Rohini205/StudentCRUD_Operation
2. Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).
3. Make sure you have Java Development Kit (JDK) and Maven installed on your machine.
4. Configure database settings in the application.properties file:

        spring.datasource.driver-class-name=com.mysql.jdbc.Driver
        spring.datasource.url=jdbc:mysql://localhost:3306/sms?autoreconnect=true&SSL=false
        spring.datasource.username=root
        spring.datasource.password=root@123
        
        #JPA
        spring.jpa.hibernate.ddl-auto=update
        spring.jpa.show-sql=true
        spring.jpa.properties.hibernate.dialect=org.hibernate.     dialect.MySQL5Dialect

## spring security
 This cofiguration setting is added in application.properties file for the security of spring boot application.
 
    
    spring.security.user.name=Admin
    spring.security.user.password=Root@123
## Running the Application

1. Start the Spring Boot application:
* Run the main class (StudentManagementSystemApplication) in your IDE.

2. Access the API endpoints using tools like Postman or URL:
* Base URL: http://localhost:8080/api/students
* Use HTTP methods (GET, POST, PUT, DELETE) for different operations.
## API Endpoints

* GET /api/students: Get all students.
* GET /api/students/{id}: Get student by ID.
* POST /api/students: Create a new student.
* PUT /api/students/{id}: Update student details.
* DELETE /api/students/{id}: Delete student by ID.

Example request for creating a new student:

POST /student/InsertStudentDetails

    {
        "id":1,
        "firstname": "Alice Smith",
        "lastname": "Desusa",
        "email":"alis123@gmail.com",
        "city": "bengalore"
    }
## Repository Class

The StudentRepository interface extends the Spring Data JPA JpaRepository interface, providing methods for CRUD operations on the Student entity.

        import org.springframework.data.jpa.repository. JpaRepository;
        import org.springframework.stereotype.Repository;

    @Repository
    public interface StudentRepository extends CrudRepository<Student, Long> {
        
    }

## Contributing

Contributions to the Student Management System project are welcome! Please fork the repository, make your changes, and submit a pull request with a detailed description of your modifications.

## Contact

For any questions or support, please contact rohinitibile25@gmail.com.

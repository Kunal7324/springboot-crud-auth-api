# springboot-crud-auth-api
-------------------------------------------------------------------------------

The Springboot CRUD Auth API is a backend application that is built using Spring Boot. This application provides services that let people manage products. People can use the Springboot CRUD Auth API to do things like add new products. They can also use the Springboot CRUD Auth API to get information about products that already exist. The Springboot CRUD Auth API even lets people change details about products.. When products are not needed anymore people can use the Springboot CRUD Auth API to delete them. The Springboot CRUD Auth API is really, about managing products.
The application follows clean architecture principles with a layered design that separates concerns across controller, service, and repository layers. It includes Bean Validation (JSR-380) to ensure data integrity, global exception handling for consistent error responses, and is fully documented using Swagger (OpenAPI) for easy API exploration and testing.

-------------------------------------------------------------------------------
Tech Stack used :
-------------------------------------------------------------------------------

Language Java 17,
Framework Spring Boot,
ORM Spring Data JPA (Hibernate),
Database MySQL,
Validation Bean Validation (JSR-380),
API Documentation Swagger (OpenAPI 3),
Build Tool Maven,
Architecture Layered (Controller → Service → Repository)

--------------------------------------------------------------------------------------
Features :
-------------------------------------------------------------------------------

Create a product
Fetch all products
Fetch product by ID
Update product details
Delete product
Input validation with meaningful error messages
Global exception handling
Interactive API documentation using Swagger

---------------------------------------------------------------
REST API Endpoints :
-------------------------------------------------------------------------------
HTTP Method Endpoint Description
To make a product I need to use the POST option, with the products section.
This is how you create a product.
You do this by going to the products section and using the POST option.
The products section is where you go to create a product.
You will use the POST option to make this product in the products section.
GET /products Fetch all products
GET /products/{id} Fetch product by ID
PUT /products/{id} Update product
DELETE /products/{id} Delete product

------------------------------------------------------------------
Swagger API Documentation :
-------------------------------------------------------------------------------

Swagger UI is really useful because it lets you test APIs in an interactive way. You can use Swagger UI to try out your APIs and see how they work. This makes it a great tool for testing APIs. Swagger UI is, about making it easy to test your APIs.
Swagger URL:
http://localhost:9999/swagger-ui/index.html

------------------------------------------------------------------------------
Database Configuration (application.properties)
------------------------------------------------------------------------------
server.port=9999
spring.application.name=demo
spring.datasource.url=jdbc:mysql://localhost:3306/product_db
spring.datasource.username=root
spring.datasource.password=Test
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
springdoc.swagger-ui.path=/swagger-ui.html

--------------------------------------------------------------------------------------------
We used design patterns and best practices.
----------------------------------------------------------------------------------
when we were making things the design patterns we used are the things that people do over and over because they work well.
We also used practices which are the good ways of doing things that people have learned from their experiences.
Design patterns and best practices help us make things that're good and that work very well.
We made sure to follow the practices so that our things are easy to use and understand.
The design patterns we used are things like making sure everything has a home and that things are easy to find.
We also used practices, like testing our things many times to make sure they work correctly.
Design patterns and best practices are very important when we are making things because they help us make things that're good and that people will like to use.
(1️) Layered Architecture
Controller → Service → Repository
Ensures loose coupling and clear responsibility
(2) Repository Pattern
Implemented using JpaRepository
Abstracts database logic from business logic
(3️) Service Pattern
Business logic isolated in Service layer
Improves testability and maintainability
(4️) Dependency Injection (DI)
Constructor-based injection
Promotes immutability and easier testing
(5️) Exception Handling Pattern
Centralized error handling using @ControllerAdvice
Clean and consistent error responses
(6️) Validation Best Practices
Declarative validation using annotations
Reduces boilerplate code
(7️) REST API Best Practices
Proper HTTP methods
Meaningful status codes
Clean URI design
(8️) Clean Code Principles
Single Responsibility Principle (SRP)
Maningful class and method names
No business logic in controllers

------------------------------------------------------------------------------
▶ How to Run the Application
Step 1: Clone the Repository
git clone https://github.com/your-username/demo.git

Step 2: Create Database
CREATE DATABASE product_db;

Step 3: Build the Project
mvn clean install

Step 4: Run the Application
mvn spring-boot:run 

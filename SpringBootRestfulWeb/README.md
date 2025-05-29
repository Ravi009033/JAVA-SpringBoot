# Spring Boot RESTful Web Service

This project is a basic example of a **RESTful Web Service** built using **Spring Boot**. 
It demonstrates how to build robust and scalable REST APIs using the Spring framework.

## 🔧 Features

- RESTful CRUD operations
- JSON-based API responses
- Clean and layered architecture (Controller, Service, Repository)
- Exception handling
- Integrated with MySQL (can be changed to H2/PostgreSQL etc.)
- Cross-Origin Resource Sharing (CORS) enabled

## 🛠️ Technologies Used

- Java 17 (or Java 8+)
- Spring Boot
- Spring Web (REST)
- Spring Data JPA (Hibernate)
- MySQL
- Maven
- Postman (for API testing)

## ✅ Prerequisites

- Java JDK installed
- MySQL server running
- Maven installed
- IDE (IntelliJ IDEA, Eclipse, etc.)

## 🚀 Getting Started

### 1. Clone the Repository

```
git clone https://github.com/Ravi009033/springboot-restful-web.git
cd springboot-restful-web
```
### 2.Set Up MySQL Database
- Create a new database:
  ```CREATE DATABASE restful_db```
- Update the application.properties file in src/main/resources:
 ```
    spring.datasource.url=jdbc:mysql://localhost:3306/restful_db
    spring.datasource.username=root
    spring.datasource.password=your_password
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    
```
- Server will run at:
  ``` http://localhost:8080 ```

## 🌐 API Endpoints    
| Method | Endpoint          | Description          |
| ------ | ----------------- | -------------------- |
| GET    | `/api/users`      | Get all users        |
| GET    | `/api/users/{id}` | Get user by ID       |
| POST   | `/api/users`      | Create new user      |
| PUT    | `/api/users/{id}` | Update existing user |
| DELETE | `/api/users/{id}` | Delete user          |

## 📝 Note
This project is intended for learning and demonstration purposes. It provides a basic structure for building RESTful APIs using Spring Boot. 
You can easily extend it by adding more entities, integrating with frontend frameworks (like Angular or React), securing it with Spring Security, or deploying it to cloud platforms.


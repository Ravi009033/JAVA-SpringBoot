# Spring Boot with JPA CRUD Project

This is a basic **CRUD application** built using **Spring Boot** and **Spring Data JPA**. 
It demonstrates how to use **JPA** to perform Create, Read, Update, and Delete operations on a relational database using a clean and simple REST API.

## 🔧 Features

- Create new records
- Retrieve all records or by ID
- Update existing records
- Delete records
- RESTful API using Spring Web
- Persistence using Spring Data JPA
- Auto DDL generation
- MySQL database integration

## 🛠️ Technologies Used

- Java 17 (or Java 8+)
- Spring Boot
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
git clone https://github.com/Ravi009033/springboot-jpa-crud.git
cd springboot-jpa-crud
```
### 2.Set Up MySQL Database
- Create a new database:
  ```CREATE DATABASE jpa_crud_db```
- Update the application.properties file in src/main/resources:
 ```
    spring.datasource.url=jdbc:mysql://localhost:3306/jpa_crud_db
    spring.datasource.username=root
    spring.datasource.password=your_password
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```
- Server will run at:
  ``` http://localhost:8080 ```

## 🌐 API Endpoints    
| Method | Endpoint          | Description         |
| ------ | ----------------- | ------------------- |
| GET    | `/student`        | Get all students   |
| GET    | `/student/{id}`   | Get student by ID  |
| POST   | `/student`        | Create new student |
| PUT    | `/student/{id}`   | Update student     |
| DELETE | `/student/{id}`   | Delete student     |

## ✅ Notes
- Uses JpaRepository for simplified CRUD operations.
- Hibernate is the default JPA provider.
- Supports @Entity, @Id, @GeneratedValue, and more annotations for ORM mapping.

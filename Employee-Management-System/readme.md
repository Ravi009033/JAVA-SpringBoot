# Employee Management System

**Employee Management System** built using **Spring Boot**, **MySQL**, and **JWT (JSON Web Token)** for secure authentication 
and role-based access control.

## 🧰 Tech Stack

- **Backend**: Java, Spring Boot, Spring Security, JWT, Hibernate, JPA
- **Database**: MySQL
- **Frontend**: Postman for testing APIs
- **Authentication**: JWT (Access Token)
- **Build Tool**: Maven

---

## ✨ Features

- Employee Registration and Login
- JWT Token-Based Authentication
- Role-Based Access Control (Admin/User)
- CRUD Operations on Employees
- Secure Endpoints using Spring Security
- MySQL Database Integration
- Token stored on client side (localStorage/cookie)

---

## ⚙️ Configuration
- **Clone the repository**
   ```bash
   git clone https://github.com/Ravi009033/JAVA-SpringBoot/tree/main/Employee-Management-System.git
   cd Employee-Management-System
```
- Create a new database:
  ```CREATE DATABASE ems_db```

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
- API endpoints (via Postman): 
  ``` http://localhost:8080/api/...```

## 🔐 API Endpoints
-**Auth**
  - POST /api/register — Register new user

  - POST /api/login — Login and receive JWT token

-**Employees**
  - GET /api/employees — Get all employees (Admin only)

  - GET /api/employee/{id} — Get employee by ID

  - POST /api/employee — Add employee (Admin only)

  - PUT /api/employee/{id} — Update employee

  - DELETE /api/employee/{id} — Delete employee (Admin only)

## Notes:
- JWT token must be added to the Authorization header as:
```bash
Authorization: Bearer <token>
```
## 🛡️ Security
- Only authenticated users can access endpoints (except login/register).
- Admin users can perform all operations; User role has limited access.
- Passwords are securely encoded using BCrypt.
- JWT is validated for each request through a custom JwtFilter.

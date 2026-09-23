# Student Management System - Java Full Stack

A beginner-friendly Java Full Stack Development project using:

- Java 17
- Spring Boot
- Spring Web / REST API
- HTML
- CSS
- JavaScript
- Maven

## Architecture

Frontend -> Controller -> Service -> Student data

### Project structure

```text
src/main/java/com/example/studentmanagement
├── controller
│   └── StudentController.java
├── model
│   └── Student.java
├── service
│   └── StudentService.java
└── StudentManagementApplication.java

src/main/resources
├── static
│   ├── index.html
│   ├── style.css
│   └── script.js
└── application.properties
```

## How to run

Open the project in VS Code or IntelliJ.

Make sure Java 17+ is installed.

On Windows:

```bash
.\mvnw.cmd spring-boot:run
```

Then open:

http://localhost:8080

## REST APIs

### Get students

```http
GET /students
```

### Add student

```http
POST /students
Content-Type: application/json
```

Example:

```json
{
  "id": 3,
  "name": "Anu",
  "email": "anu@example.com",
  "course": "CSE"
}
```

### Delete student

```http
DELETE /students/3
```

## Important note

This beginner version stores students in memory, so data resets when the application restarts. A next version can add MySQL + Spring Data JPA for permanent database storage.

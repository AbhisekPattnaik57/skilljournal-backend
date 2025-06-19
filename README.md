# 🧠 SkillJournal - Backend

This is the Spring Boot backend for the SkillJournal app. It allows users to log new skills they are learning along with time spent and descriptions.

## 🚀 Features

- Add a new skill log (name, description, hours spent)
- Retrieve all logged skills
- RESTful API
- CORS enabled

Also add a demo link
https://drive.google.com/file/d/1NVl8ldUfHrmWri39vv74aPH12zXfU1hj/view?usp=drive_link
## 🛠 Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

## 🧪 API Endpoints

| Method | Endpoint             | Description         |
|--------|----------------------|---------------------|
| GET    | `/api/skills`        | Get all skills      |
| POST   | `/api/skills`        | Add a new skill log |

### 📦 Sample JSON (POST)
```json
{
  "name": "Java",
  "description": "Practiced Streams API",
  "hoursSpent": 2
}

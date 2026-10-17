# Home Services Booking API

Starter implementation for the AdityaX Java Full Stack Intern assignment using Java 17, Spring Boot, Spring Data JPA and MySQL.

## Requirements
- JDK 17 or newer
- Maven 3.9+
- MySQL 8+

## Configure MySQL
Create a database (optional; the JDBC URL can create it if the MySQL user has permission):
```sql
CREATE DATABASE home_services_db;
```
Set credentials in `src/main/resources/application.properties`, or provide environment variables `DB_URL`, `DB_USERNAME`, and `DB_PASSWORD`. Do not commit real passwords to GitHub.

## Run
From this directory:
```bash
mvn spring-boot:run
```
On startup, eight sample services are inserted if the service table is empty.

## API endpoints
- `GET /api/services`
- `GET /api/services?search=clean`
- `GET /api/services/{id}`
- `POST /api/bookings`
- `GET /api/bookings`
- Swagger UI: `http://localhost:8080/swagger-ui/index.html`

Example booking request:
```json
{
  "serviceId": 1,
  "name": "Aarav Sharma",
  "phone": "9876543210",
  "address": "Pune, Maharashtra",
  "date": "2026-10-17",
  "timeSlot": "10:00 AM - 12:00 PM"
}
```



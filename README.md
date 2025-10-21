# Spring Security Authentication & Authorization Implementation

## Objectives Met
- Implemented Authentication and Authorization security tactics
- Used Spring Framework for implementation
- Multiple user types with different privileges
- URL-based service access control
- Java programming language

### Prerequisites
- Java 17 or higher
- Maven 3.6+
- Postman or curl for API testing

### Installation & Running
1. Clone/Download the project
    - `git clone https://github.com/SoudagarLondhe/Authentication-Authorization-Tactics.git`
2. Navigate to project directory:
    - `cd Authentication-Authorization-Tactics`
3. Build the application:
    - `mvn clean package`
4. Run the application:
    - `mvn spring-boot:run`
5. Testing using postman:
    1. Get token for John (USER role)
        - `curl -X POST http://localhost:8080/api/auth/login \
  -H "Content-Type: application/json" \
  -d '{"username":"john","password":"password123"}'`

    2. Get token for Michael (ADMIN role) 
        - `curl -X POST http://localhost:8080/api/auth/login \
  -H "Content-Type: application/json" \
  -d '{"username":"michael","password":"admin123"}'`

    3. Test admin endpoint with Michael's token (should work)
        - `curl http://localhost:8080/api/admin/secret -H "Authorization: Bearer <MICHAEL_TOKEN>"`

    4. Test admin endpoint with John's token (should return 403 Forbidden)
        - `curl http://localhost:8080/api/admin/secret -H "Authorization: Bearer <JOHN_TOKEN>"`

    5. Test user endpoint with both tokens (should work for both)
        - `curl http://localhost:8080/api/user/data -H "Authorization: Bearer <JOHN_TOKEN>"`
        - `curl http://localhost:8080/api/user/data -H "Authorization: Bearer <MICHAEL_TOKEN>"`

    6. Test public endpoint (no auth required)
        - `curl http://localhost:8080/api/public/ping`
    
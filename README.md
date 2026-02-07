Password Management System
>This repository contains the backend implementation of the Password Management System (PMS).
>The backend handles business logic, database operations, and exposes REST APIs used by the frontend application.
Project Description
>The backend is built using Spring Boot and follows a layered architecture.
>It provides RESTful APIs for managing user authentication and password CRUD operations.
>The backend is containerized using Docker, analyzed with SonarCloud for code quality, and automated with GitHub Actions CI/CD pipelines for build, test, and deployment.
Technologies Used
>Java 17
>Spring Boot
>Spring Data JPA
>REST API
>H2 Database
>Maven
>Docker (Multi-stage build)
>GitHub Actions (CI)
>SonarCloud (Code Quality)
Backend Modules
1️.Controller Layer
>Handles HTTP requests
>Exposes REST APIs for login, signup, and password operations
>Manages CORS for frontend access
2️.Service Layer
>Contains business logic
>Password encryption & validation
>Handles CRUD operations for user passwords
3️.Repository Layer
>JPA / Database repository for users and passwords
>Performs CRUD operations
4️.Entity Layer
>Defines User and Password entities
>Maps to database table structures
Docker Implementation
>Backend is containerized using multi-stage Dockerfile
>Maven build happens inside Docker
>Image optimized for size and deployment
Build Docker Image
>docker build -t pms-backend .
Run Backend Container
>docker run -p 8080:8080 pms-backend
<img width="1920" height="1080" alt="Screenshot 2026-02-07 193838" src="https://github.com/user-attachments/assets/4bd0ab7c-d5e7-4f66-9d09-cc74db833fb1" />
SonarCloud Analysis
>SonarCloud checks backend code quality for bugs, code smells, and maintainability.
>Integrated with GitHub Actions CI pipeline, so every push automatically scans the backend code.
>Detects issues like unused code, potential errors, and security vulnerabilities.
<img width="1920" height="1080" alt="Screenshot 2026-02-07 185620" src="https://github.com/user-attachments/assets/80061fa6-ec32-465a-b339-89d94c9eec78" />
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/25b08b65-d6a8-43b3-b0c6-068fc30d6c74" />
DevOps & CI/CD
>GitHub Actions automates build, test, SonarCloud analysis, Docker image creation, and deployment.
>CI pipeline ensures backend is always tested, containerized, and ready to deploy automatically.
Challenges & Learnings
>Secure authentication and password encryption
>Containerizing backend with Docker
>Integrating SonarCloud for automated code quality checks
>Automating CI/CD pipeline to reduce manual steps
>Ensuring backend APIs work correctly with frontend

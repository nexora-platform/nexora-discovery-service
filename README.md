# Nexora Discovery Service

## Overview

The **Nexora Discovery Service** is the Service Registry component of the Nexora Platform microservices architecture.

It provides centralized service registration and discovery using Netflix Eureka, enabling dynamic service-to-service communication across the platform.

This service is built with:

* Spring Boot 3.5.x
* Spring Cloud Netflix Eureka Server
* Spring Boot Actuator
* Java 21+

---

## Architecture Role

Within the Nexora Platform ecosystem, this service is responsible for:

* Registering all microservices
* Providing service discovery capabilities
* Enabling load-balanced communication
* Acting as a central registry for the system

---

## Tech Stack

* Java 21+
* Spring Boot
* Spring Cloud
* Netflix Eureka
* Maven
* Docker (planned)
* GitHub Actions (planned)

---

## Running the Service

### 1️⃣ Build the project

```bash
mvn clean install
```

### 2️⃣ Run the application

```bash
mvn spring-boot:run
```

### 3️⃣ Access Eureka Dashboard

```
http://localhost:8761
```

---

## Configuration

The service runs on port:

```
8761
```

Self-registration is disabled since this is the registry server.

---

## Future Improvements

* Dockerization
* Production logging configuration
* Caffeine caching
* High-availability cluster setup
* CI/CD pipeline
* Monitoring integration (Prometheus / Grafana)

---

## Author

Built as part of Nexora Platform microservices architecture.

---
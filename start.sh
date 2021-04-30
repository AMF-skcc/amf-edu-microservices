#!/bin/bash
./mvnw spring-boot:run -pl edu-admin & ./mvnw spring-boot:run -pl edu-course & ./mvnw spring-boot:run -pl edu-member &

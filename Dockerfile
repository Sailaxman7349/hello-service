# Stage 1: Build the Java Spring Boot service JAR file
FROM amazoncorretto:17-alpine AS builder
RUN apk update && apk add maven
COPY . /
RUN mvn clean package

# Stage 2: Copy the JAR file to the child container and run the service
FROM amazoncorretto:17
COPY builder:/target/*.jar /hello-service.jar
CMD ["java", "-jar", "/hello-service.jar"]
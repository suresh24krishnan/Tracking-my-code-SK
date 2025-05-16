# Use a lightweight OpenJDK base image consistent with our project's Java version
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file (ensure the name matches your JAR) into the container
COPY target/simple-api-0.0.1-SNAPSHOT.jar app.jar

# Expose port 2224 (the port our Spring Boot app is configured to use)
EXPOSE 2224

# Command to run the Spring Boot app when the container starts
ENTRYPOINT ["java", "-jar", "app.jar"]


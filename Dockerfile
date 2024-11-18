# Use an OpenJDK image as a base image
FROM openjdk:17-jdk-slim

# Copy the Spring Boot JAR file into the container
COPY target/voting-app-0.0.1-SNAPSHOT.jar /app/voting-app.jar

# Expose the port the application will run on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/voting-app.jar"]

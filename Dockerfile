# Use OpenJDK 17 image from Docker Hub
FROM openjdk:17-jdk-slim

# Set working directory in the container
WORKDIR /app

# Copy the built jar file into the container
COPY target/voting-app.jar voting-app.jar

# Expose port 8080
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "voting-app.jar"]

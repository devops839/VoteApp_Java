# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the built .jar file into the container
COPY target/voting-app-*.jar /app/voting-app.jar

# Expose port 8080 to make the app accessible
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/voting-app.jar"]

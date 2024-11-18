# Use a base image with Java 17
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the built .jar file into the container
COPY target/voting-app-*.jar /app/voting-app.jar  # Ensure the path matches the actual output file name

# Expose port 8080 to make the app accessible
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "/app/voting-app.jar"]

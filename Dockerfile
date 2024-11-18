# Stage 1: Build the application
FROM maven:3.8.4-openjdk-17-slim AS build

# Set the working directory for the build
WORKDIR /app

# Copy the pom.xml and the source code to the container
COPY pom.xml /app
COPY src /app/src

# Build the .jar file (this will execute `mvn package` and generate the .jar file)
RUN mvn clean package -DskipTests

# Stage 2: Run the application in a lighter environment
FROM openjdk:17-jdk-slim

# Set the working directory for the runtime environment
WORKDIR /app

# Copy the built .jar file from the build stage
COPY --from=build /app/target/voting-app-*.jar /app/voting-app.jar

# Expose port 8080 to make the app accessible
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/voting-app.jar"]

# Stage 1: Build the application
FROM maven:3.8-openjdk-17 AS build

# Set the working directory for the build
WORKDIR /app

# Copy the all the source codes to the container
COPY . /app

# Build the .jar file (this will execute `mvn package` and generate the .jar file)
RUN mvn clean package

# Stage 2: Prepare the final image
FROM openjdk:17-jdk-slim 

# Set the working directory for the build
WORKDIR /app

# Copying reuired jar from stage-1 to reduce image size
COPY --from=build /app/target/voting-app.jar /app/voting-app.jar

# Command to run the application
CMD ["java", "-jar", "/app/voting-app.jar"]


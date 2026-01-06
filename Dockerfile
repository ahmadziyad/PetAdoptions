# Use OpenJDK 24 as base image
FROM openjdk:24-jdk-slim

# Set working directory
WORKDIR /app

# Copy Maven wrapper and pom.xml
COPY mvnw mvnw.cmd pom.xml ./
COPY .mvn .mvn

# Copy source code
COPY src ./src

# Make mvnw executable
RUN chmod +x mvnw

# Build the application
RUN ./mvnw clean package -DskipTests

# Expose port
EXPOSE 8080

# Set environment variable for port
ENV PORT=8080

# Run the application
CMD ["java", "-jar", "target/adoptions-0.0.1-SNAPSHOT.jar", "--server.port=${PORT}"]
# Use Java 17 base image
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy the built jar file into the container
COPY target/*.jar app.jar

# Expose port (Render maps this to $PORT)
EXPOSE 8080

# Start the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]

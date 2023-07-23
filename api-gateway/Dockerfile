# Start with a base image containing Java runtime
FROM openjdk:17-jdk-buster

# Add a volume pointing to /tmp
VOLUME /tmp

# Install Dockerize
RUN apt-get update && apt-get install -y wget && \
    wget https://github.com/jwilder/dockerize/releases/download/v0.7.0/dockerize-linux-amd64-v0.7.0.tar.gz && \
    tar -C /usr/local/bin -xzvf dockerize-linux-amd64-v0.7.0.tar.gz && \
    rm dockerize-linux-amd64-v0.7.0.tar.gz

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file
ARG JAR_FILE=target/api-gateway-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} api-gateway.jar

# Run the jar file
ENTRYPOINT ["dockerize", "-wait", "http://user-service-app:8080/actuator/health", "-wait", "http://product-service-app:8080/actuator/health", "-wait", "http://order-service-app:8080/actuator/health", "-timeout", "60s", "java","-jar","/api-gateway.jar"]


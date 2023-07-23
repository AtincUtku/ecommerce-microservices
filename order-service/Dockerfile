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
ARG JAR_FILE=target/order-service-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} order-service.jar

# Run the jar file
ENTRYPOINT ["dockerize", "-wait", "tcp://order-service-db:3306", "-timeout", "60s", "java","-jar","/order-service.jar"]

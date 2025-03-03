# FROM eclipse-temurin:21
FROM openjdk:21-jdk-slim

RUN apt update -y && apt install -y maven \
    && apt-get clean && rm -rf /var/lib/apt/lists/*

# RUN mkdir /opt/app

COPY ./ /app
WORKDIR /app

# COPY japp.jar /opt/app
CMD ["tail", "-f", "/dev/null"]
# CMD ["java", "-jar", "/app/app.jar"]
# CMD ["java", "HelloWorld"]


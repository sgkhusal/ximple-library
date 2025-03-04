FROM openjdk:21-jdk-slim

RUN apt update -y && apt install -y maven \
    && apt-get clean && rm -rf /var/lib/apt/lists/*

COPY ./ /app
WORKDIR /app/ximple_library

RUN chmod +x ./script.sh

STOPSIGNAL SIGQUIT

ENTRYPOINT [ "/app/ximple_library/script.sh" ]
CMD ["mvn", "spring-boot:run"]
# CMD ["tail", "-f", "/dev/null"]
# CMD ["java", "-jar", "/app/app.jar"]
# CMD ["java", "HelloWorld"]

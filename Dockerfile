FROM openjdk:21-jdk-slim

WORKDIR /app

COPY target/demo-0.0.1-SNAPSHOT.jar ./demo.jar


ENTRYPOINT ["java", "-jar", "demo.jar"]
#ENTRYPOINT ["tail", "-f", "/dev/null"]
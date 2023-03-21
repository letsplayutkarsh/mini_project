FROM openjdk:19
COPY ./target/mini_project-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
FROM eclipse-temurin:20-jdk-alpine
VOLUME /tmp
COPY target/docker-github-actions-demo-app1-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
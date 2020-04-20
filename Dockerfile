FROM maven:3.6.0-jdk-11-slim AS build

CMD mvn clean package -Dmaven.test.skip=true

FROM openjdk:jre-alpine

EXPOSE 8080

COPY target/demo-api-0.0.1-SNAPSHOT.jar .

ENTRYPOINT exec java $JAVA_OPTS -jar demo-api-0.0.1-SNAPSHOT.jar

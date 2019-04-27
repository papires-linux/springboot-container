###Executar command
# mvn clean package -Dmaven.test.skip=true
##############################################

#FROM anapsix/alpine-java
FROM openjdk:jre-alpine

EXPOSE 8080
COPY target/demo-api-0.0.1-SNAPSHOT.jar .
ENTRYPOINT exec java $JAVA_OPTS -jar demo-api-0.0.1-SNAPSHOT.jar

# docker build -t <nome da imagem que deseja> .
# docker run --name <nome do container que deseja > -d  <nome da imagem que deseja>

###Saber IP do container
# docker inspect <nome do container> | grep \"IPAddress\"


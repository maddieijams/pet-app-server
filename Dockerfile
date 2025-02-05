FROM openjdk:21-jdk-slim
VOLUME /tmp
COPY target/serving-web-content-0.0.1-SNAPSHOT.jar serving-web-content.jar
ENTRYPOINT ["java","-jar","/serving-web-content.jar"]
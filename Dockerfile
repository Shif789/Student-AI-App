FROM eclipse-temurin:17-jdk
LABEL authors="shefat"
WORKDIR /app
#ADD target/spring-ai-app.jar /spring-ai-app.jar
COPY target/spring-ai-app.jar /spring-ai-app.jar

EXPOSE 8083

ENTRYPOINT ["java", "-jar", "/spring-ai-app.jar"]
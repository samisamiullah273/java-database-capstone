FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/app.jar /app/app.jar
CMD ["java","-jar","/app/app.jar"]

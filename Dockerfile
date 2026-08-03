# Build stage
FROM maven:3.8.8-openjdk-17 AS build
WORKDIR /workspace/app
COPY pom.xml ./
# If there is a multi-module project, adjust the copy to include modules
COPY src ./src
RUN mvn -B -DskipTests package

# Run stage
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=build /workspace/app/target/*.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]

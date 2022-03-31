FROM maven:3.6.0-jdk-11-slim AS build
WORKDIR /mvn-test
COPY pom.xml ./pom.xml
RUN mvn clean install
FROM adoptopenjdk/openjdk11:alpine-jre
WORKDIR /testproject
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY --from = build ${JAR_FILE} /testproject/app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]

#
# Build stage
#
#FROM maven:3.6.0-jdk-11-slim AS build
#COPY src /home/app/src
#COPY pom.xml /home/app
#RUN mvn -f /home/app/pom.xml clean package
#
##
## Package stage
##
#FROM openjdk:11-jre-slim
#COPY --from=build /home/app/target/demo-0.0.1-SNAPSHOT.jar /usr/local/lib/demo.jar
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","/usr/local/lib/demo.jar"]

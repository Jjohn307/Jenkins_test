FROM openjdk:8
ADD target/java-project-1.0-SNAPSHOT.jar java-project-1.0-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","java-project-1.0-SNAPSHOT.jar"]

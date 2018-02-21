FROM openjdk:8-jdk-alpine
ADD ./target/SpringBootAngularDemo-0.0.1-SNAPSHOT.jar /home
WORKDIR /home
EXPOSE 8082
ENTRYPOINT ["java", "-jar" , "/home/SpringBootAngularDemo-0.0.1-SNAPSHOT.jar"]
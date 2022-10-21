FROM openjdk:8
EXPOSE 8089
ADD /target/Cloud-Gateway-1-0.0.1-SNAPSHOT.jar gateway.jar
ENTRYPOINT ["java", "-jar", "gateway.jar"]
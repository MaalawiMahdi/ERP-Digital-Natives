FROM openjdk:latest
EXPOSE 8089
ADD /target/microservice-commande.jar microservice-commande.jar
ENTRYPOINT ["java","-jar", "microservice-commande.jar"]
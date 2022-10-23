FROM openjdk:latest
EXPOSE 8085
ADD /target/microservice-commande.jar microservice-commande.jar
ENTRYPOINT ["java","-jar", "microservice-commande.jar"]
FROM ubuntu:jammy
RUN apt update && apt install openjdk-21-jdk -y
WORKDIR /home/andrew/GeekBrains/diploma/geocatalog
COPY target/geocatalog-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java", "-jar", "geocatalog-0.0.1-SNAPSHOT.jar"]

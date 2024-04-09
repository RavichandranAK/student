FROM eclipse-temurin:17
COPY target/studentdetails.jar studentdetails.jar
RUN apt-get update && apt-get install -y mysql-client
CMD [ "java","-jar","studentdetails.jar" ]
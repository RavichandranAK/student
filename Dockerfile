FROM eclipse-temurin:17
COPY target/studentdetails.jar studentdetails.jar
CMD [ "java","-jar","studentdetails.jar" ]
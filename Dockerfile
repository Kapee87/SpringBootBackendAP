FROM amazoncorretto:12-alpine-jdk
MAINTAINER Kapeeh
COPY target/kapeeh-0.0.1-SNAPSHOT.jar kapeeh-app.jar
ENTRYPOINT ["java","-jar","/kapeeh-app.jar"]
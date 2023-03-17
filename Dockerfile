FROM amazoncorreto:18-alpine-jdk
MAINTAINER kapeeh
COPY target/kapeeh-0.0.1-SNAPSHOT.jar kapeeh-app.jar
ENTRYPOINT ["java", "-jar", "/kapeeh-app.jar" ]
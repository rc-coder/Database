FROM amazoncorretto:17
MAINTAINER rcCoder
COPY target/Database-0.0.1-SNAPSHOT.jar Database-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Database-0.0.1-SNAPSHOT.jar] 
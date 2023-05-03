FROM amazoncorretto:19

COPY  target/security-0.0.1-SNAPSHOT.jar app.jar

MAINTAINER mglujoy

ENTRYPOINT ["java", "-jar", "/app.jar"]

FROM amazoncorretto:17

MAINTAINER mglujoy

COPY target/security-0.0.1-SNAPSHOT.jar security-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "security-0.0.1-SNAPSHOT.jar"]
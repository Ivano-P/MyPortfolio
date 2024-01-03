FROM openjdk:21

WORKDIR /app

COPY target/my-portfolio.jar /app/my-portfolio.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/my-portfolio.jar"]
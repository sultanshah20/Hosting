FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*app.jar app
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 27017
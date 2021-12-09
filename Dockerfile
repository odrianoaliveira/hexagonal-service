FROM adoptopenjdk:11-jre-hotspot

RUN groupadd hexagonal && useradd -u 1000 -g hexagonal hexagonal

RUN mkdir /hexagonal-service
RUN chown hexagonal.hexagonal /hexagonal-service

COPY --chown=hexagonal:hexagonal ./build/libs/hexagonal-service-all.jar /hexagonal-service/app.jar

USER hexagonal
EXPOSE 8080
CMD ["java", "-jar", "/hexagonal-service/app.jar"]

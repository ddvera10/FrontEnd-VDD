FROM amazoncorretto:11-alpine-jdk  //imagen de partida
MAINTAINER VDD                     //propietario del proyecto
COPY target/vdd-0.0.1-SNAPSHOT.jar vdd-app.jar //empaquetado a copiar a Git
ENTRYPOINT ["java","-jar","/vdd-app.jar"]    //instruccion a ejecutar primero

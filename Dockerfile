# Usar una imagen base de OpenJDK
FROM openjdk:17-jdk-slim

# Copiar el archivo JAR generado al contenedor
ARG JAR_FILE=target/inventory-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

# Exponer el puerto 8080
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app.jar"]
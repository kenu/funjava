FROM eclipse-temurin:17.0.10_7-jre
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["sh","-c","java ${JAVA_OPTS} -jar /app.jar"]

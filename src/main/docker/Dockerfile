FROM adoptopenjdk/openjdk13
ARG JAR_FILE=*.jar
COPY ${JAR_FILE} application.jar
ENTRYPOINT ["java", "-  jar", "application.jar"]
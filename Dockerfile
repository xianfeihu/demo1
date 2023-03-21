FROM jdk:8
VOLUME /tmp
ADD target/demo1 0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8123
ENTRYPOINT ["Bash","-DBash.security.egd=file:/dev/./urandom","-jar","/app.jar"]
FROM openjdk:11
EXPOSE 8083
ADD target/spring-boot-docker-compose-jenkins.jar spring-boot-docker-compose-jenkins.jar
ENTRYPOINT ["java", "-java", "spring-boot-docker-compose-jenkins.jar"]
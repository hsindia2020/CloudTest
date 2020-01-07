FROM java:8-jre
WORKDIR Assignment/src
EXPOSE 9082:9082
ADD ./target/assignment-framework.jar /Assignment/src/assignment-framework.jar
ENTRYPOINT ["java" ,"-jar","assignment-framework.jar"]
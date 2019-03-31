FROM java:8-jdk-alpine
COPY ./target/callbackapi-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch callbackapi-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-jar","callbackapi-0.0.1-SNAPSHOT.jar"]
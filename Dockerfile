FROM goodrainapps/maven:jdk7-alpine

COPY demo.user.provider-0.0.1-SNAPSHOT.jar /user-provider.jar

ENTRYPOINT exec java -jar /user-provider.jar
FROM maven
WORKDIR /app
COPY pom.xml ./
RUN mvn install
COPY . .
CMD [ "mvn", "clean", "compile", "exec:java" ]
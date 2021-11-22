FROM maven as builder
COPY . .
RUN mvn clean install -DskipTests=true

FROM openjdk:11
COPY --from=builder ./target/backend-1.0.jar backend-1.0.jar
EXPOSE 3000
ENTRYPOINT ["java","-jar","backend-1.0.jar"] 

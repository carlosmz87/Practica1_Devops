FROM maven as builder
COPY . .
RUN mvn clean install -DskipTests=true

FROM openjdk:11
COPY --from=builder ./target/springcrudback.jar springcrudback.jar
EXPOSE 3000
ENTRYPOINT ["java","-jar","springcrudback.jar"] 

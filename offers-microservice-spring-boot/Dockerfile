# FROM maven as build
# MAINTAINER sarat.e99@gmail.com Sarat Chandra E


# WORKDIR /app
# COPY . .
# RUN mvn install

# #jdk
# FROM openjdk:11.0.10-jre
# WORKDIR /app
# COPY --from=build /app/target/offers-0.0.1-SNAPSHOT.jar /app 

# EXPOSE 1001

# CMD ["java", "-jar", "offers-0.0.1-SNAPSHOT.jar"] 


FROM maven as builder

WORKDIR /app

COPY . /app/

RUN mvn install -Dmaven.test.skip

FROM openjdk:11.0.10-jre

WORKDIR /app

COPY --from=builder /app/target/offers-0.0.1-SNAPSHOT.jar /app/

EXPOSE 1001

CMD [ "java","-jar","offers-0.0.1-SNAPSHOT.jar" ]
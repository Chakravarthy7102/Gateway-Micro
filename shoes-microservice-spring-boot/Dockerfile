# FROM maven as build
# MAINTAINER sarat.e99@gmail.com Sarat Chandra E


# WORKDIR /app
# COPY . .
# RUN mvn install

# #jdk
# FROM openjdk:11.0.10-jre
# WORKDIR /app
# COPY --from=build /app/target/shoes-0.0.1-SNAPSHOT.jar /app 

# EXPOSE 1002

# CMD ["java", "-jar", "shoes-0.0.1-SNAPSHOT.jar"] 


FROM maven as builder

WORKDIR /app

COPY . /app

RUN mvn install

FROM openjdk:11.0.10-jre

WORKDIR /app

COPY --from=builder /app/target/shoes-0.0.1-SNAPSHOT.jar ./

EXPOSE 1002

CMD ["java","-jar","shoes-0.0.1-SNAPSHOT.jar"]
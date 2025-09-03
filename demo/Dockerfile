# Etapa de build
FROM maven:3.8.4-eclipse-temurin-17 AS build

WORKDIR /app

# Primeiro copiar apenas o pom.xml para cache de dependências
COPY pom.xml .
RUN mvn dependency:go-offline

# Agora copiar o código
COPY src ./src

# Compilar a aplicação
RUN mvn clean package -DskipTests

# Etapa de runtime
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

# Copiar o JAR gerado na etapa anterior
COPY --from=build /app/target/demo-0.0.1-SNAPSHOT.jar app.jar


# Expor a porta
EXPOSE 8080

# Rodar o jar
ENTRYPOINT ["java", "-jar", "app.jar"]

#docker build -t spring-demo .
#docker build --no-cache -t spring-demo .
#docker run -p 8080:8080 spring-demo


#NATUCCI
#sudo docker compose up --build

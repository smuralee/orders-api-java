# Todos API

- Endpoint : `/native-todos`
    - Supported operations : **GET**, **POST**, **PUT**, **DELETE**
  
## Compile, Test and Package

```shell
mvn test
mvn clean install
mvn package
```

## Build the native image

```shell
mvn spring-boot:build-image
```

## Push image to the ECR repository

```shell
docker tag todos-api:1.0 123456789012.dkr.ecr.us-east-1.amazonaws.com/todos-api-v2:latest
docker tag todos-api:1.0 todos-api-v2:latest
docker push 123456789012.dkr.ecr.us-east-1.amazonaws.com/todos-api-v2:latest
```

# vertx-microservices-examples
Example code of using Vert.x for create Microservices blueprint 

## Compile:

mvn clean compile

## Test:

mvn clean test

## package

mvn clean package

## run vertical

java -jar vertx-http-server-1.0-SNAPSHOT-fat.jar 

## Project Structure

├── README.md
├── pom.xml
├── src
│   ├── main
│   │   └── java
│   │       └── io
│   │           └── vertx
│   │               └── SimpleHttpVertical.java
│   └── test
│       └── java
│           └── io
│               └── vertx
│                   └── SimpleHttpVerticalTest.java
└── target

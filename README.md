Akka-http graphQL Bootstrap
=========================

[![travis-ci.org](https://travis-ci.org/sammyrulez/bootstrap-akka-graphql.g8.svg?branch=master)](https://travis-ci.org/sammyrulez/bootstrap-akka-graphql.g8)
[![shields.io](http://img.shields.io/badge/license-Apache2-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.txt)
[![sammyrulez.com](https://img.shields.io/badge/Version-1.0-brightgreen.svg)](https://sammyrulez.com)
[![howtographql.com](https://img.shields.io/badge/graphql-ok-green.svg)]
(https://howtographql.com)



## Info
This is a boilerplate template for a akka graphql microservice with slick and flyway database migration. You can use it to create your own GraphQL Services on top of the lightbend stack.

### Requirements
* JDK8 [http://www.oracle.com/technetwork/java/javase/downloads/index.html](http://www.oracle.com/technetwork/java/javase/downloads/index.html))
* sbt([http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html](http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html))
* docker for dockerbuild ([https://www.docker.com/community-edition/](https://www.docker.com/community-edition/))
* aws account if you want to use a cognito userpool for authentifaction ([https://aws.amazon.com/de/](https://aws.amazon.com/de/))

### Implemented Features

* Integration of *graphiql* ui ```localhost:8080```
* Integration *sangria* for graphql
* CRUD Repositorys via *slick-repo* with a sample service with get and add implemented
* CORS Support via *akka-http-cors*
* Implemented Authentication with AWS Cognito (JWK) and JWT Token via *nimbusds* (in *Java*) - For Tests All Requests are allowed
* Test coverage with *ScalaTest* and *scoverage* code coverage report
* Ready for *Docker* deployment and *CloudFormation* deployment
* Config file with optional runtime parameters
* In-Memory Postgres SQL database for tests
* Flyway database migration
* *HikariCP* as connection pool
* Logging via *Log4j* with a xml template

## Configuration
* Start a PostgreSQL Database via RDS, Docker or locally
* Create a Userpool with AWS Cognito if you need AWS Authentication.
* Configure your application.conf and the docker.conf (`src/main/resources/`) (application.conf in test has to stay as it is, for running in a in-memory postgresql instance)

### Environment variables 
- `SQL_URL` - database url by scheme `jdbc:postgresql://host:port/database-name`
- `SQL_USER` - database user
- `SQL_PASSWORD` - database password
- `NIC_IP` - IP Address bounded to the http service default is 0.0.0.0
- `NIC_PORT` - TCP Port used for the http service default is 8080
- `USER_POOL` - Define an other cognito user pool than the preconfigured userpool


## Run application
To run application, call:
```
sbt run
```
If you wanna restart your application without reloading of sbt, use (*revolver* sbt plugin):
```
sbt re-start
```

### Run in Docker
For launching application in Docker, you must configure database docker instance and run docker image, generated by sbt.

Generating application docker image and publishing on localhost:
```
sbt docker:publishLocal
```

Example of running, generated docker image:
```
docker run --name akkaHttp -e SQL_USER=dbuser -e SQL_PASSWORD=dbpass -e SQL_URL=jdbcURL -d -p 9090:9000 APPLICATION_IMAGE
```
- `APPLICATION_IMAGE` - id or name of application docker image

look at ```--link``` parameter if the database is also a docker container

## Test
To run tests, call:
```
sbt test
```

To run all tests, with codecoverage, call:

```sbt clean coverage test```

To generate a coverage report afterwars the testrun, call:

```sbt coverageReport```

## Copyright & Contributers
Fork from Tobias Jonas https://github.com/innFactory/bootstrap-akka-graphql

Published under the Apache 2 License.
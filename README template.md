# SAMPLE MICROSERVICE

Brief description of the purpose.

## Purpose

This micro service does the following: ...

## Development Guidelines

### Packaging
___

- **com.educacional._SERVICE_NAME_HERE_.application**: ?


- **com.educacional._SERVICE_NAME_HERE_.domain**: Contains all abstractions
  responsible for delivering business value, i.e.: business entities, value-objects,
  business services, exceptions. It must not depend on third party
  libraries of any kind including spring.

- **com.educacional._SERVICE_NAME_HERE_.infra**: Carries all implementations
  of interfaces defined in the domain level and that should come from the host
  infrastructure itself, i.e.: configurations, database access,
  logging implementations, tracing.

### Artifact naming
___

Some common words are used throughout the source code to name classes and interfaces.
Each one is used to identify specific constructions. They are described below:

Suffixes:

- Client: Used to identify "Open Feign" interfaces.
- Repository: Used to identify interfaces to data storages.

Prefixes:

- MongoDB: Used to identify implementations relative to MongoDB.

## Configuration
___

This section describes all variables used by the service:

- HOST: Any valid host name or IP address
- PORT: Any valid port number

DO NOT commit your local configuration files.

## Running
___

**Get the project**

Use the git client of your preference to clone the repository. Here is a command
line example:

```bash
$ git clone git@bitbucket.org:acmecorporation/sample-service.git
```

**Building the project**

Make sure you have gradle installed and invoke the following command:

```bash
$ cd sample-service
$ gradle build
```

**Using java directly**

Once you have built the application, you may invoke it directly using java as
illustrated below:

```bash
$ java -jar target/sample-project-1.0.0-SNAPSHOT.jar
```


[1]: "https://swapi.co" "Star Wars API"
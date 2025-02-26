# quarkus_hw
Quarkus hello world done via powershell cli


## Create the Project on the Poweshell
```
mvn io.quarkus.platform:quarkus-maven-plugin:3.18.4:create    "-DprojectGroupId=org.acme" "-DprojectArtifactId=getting-started" "-Dextensions=rest"
```

## Run project in dev mode

```
mvn quarkus:dev
```

## Test it with Curl

```
curl localhost:8080/hello
```
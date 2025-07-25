# Banking Platform

## Axon Server
- https://download.axoniq.io/axonserver/AxonServer.zip

### Run Axon Server
```
$ cd /
$ cd c/efra/tools/AxonServer-2024.1.4
$ java -jar axonserver.jar
```

### Axon Server URL
- http://localhost:8024/

### API URL
- http://localhost:8080/swagger-ui/index.html

### ENVIRONMENT VARIABLES
```
SPRING_PROFILES_ACTIVE=local|prod
DATASOURCE_URL=jdbc:mysql://{host}:3306/banking-es?serverTimezone=UTC
DATASOURCE_USERNAME=developer
DATASOURCE_PASSWORD=P@ssword24
AXONSERVER_SERVERS={host}:8124
```

### Axon Event Store Configuration
axon.axonserver.servers=${AXONSERVER_SERVERS}

### JPA Event Store Configuration
axon.axonserver.enabled=false
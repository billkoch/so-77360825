# StackOverflow 77360825
An attempt to reproduce StackOverflow Question 77360825

## Default Behavior
By default, the `/actuator/info` endpoint will return the build time in a friendly ISO8601 format:

```bash
curl http://localhost:8080/actuator/info
```

```json
{
    "build": {
        "artifact": "so-77360825",
        "name": "so-77360825",
        "time": "2023-10-25T16:14:15.944Z",
        "version": "0.0.1-SNAPSHOT",
        "group": "com.example"
    }
}
```

## Unfriendly Date Formatting
To get the `/actuator/info` endpoint to return the build time in an unfriendly format, uncomment the `ObjectMapper` bean defined in [Config.java](src/main/java/com/example/demo/Config.java)

```bash
curl http://localhost:8080/actuator/info
```

```json
{
  "build": {
    "artifact": "so-77360825",
    "name": "so-77360825",
    "time": 1698250475.416,
    "version": "0.0.1-SNAPSHOT",
    "group": "com.example"
  }
}
```

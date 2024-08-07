# Step to run
Install GraalVM https://www.graalvm.org/latest/docs/getting-started/macos/
```
➜  ~ java -version
java version "22.0.2" 2024-07-16
Java(TM) SE Runtime Environment Oracle GraalVM 22.0.2+9.1 (build 22.0.2+9-jvmci-b01)
Java HotSpot(TM) 64-Bit Server VM Oracle GraalVM 22.0.2+9.1 (build 22.0.2+9-jvmci-b01, mixed mode, sharing)

./mvnw clean package                            # pack jar
./mvnw -Pnative native:compile -DskipTests      # build native image

```
- Build jar time

![img_2.png](img_2.png)
  
- Build native time

![img_1.png](img_1.png)

# Test Run
### Run jar
```
java -jar target/spring-boot-graalvm-0.0.1-SNAPSHOT.jar

ps -ax | grep -i spring-boot-graalvm    # find PID
top -pid <PID>
```
![img_3.png](img_3.png)
![img_4.png](img_4.png)

## Run native
```
./target/spring-boot-graalvm

ps -ax | grep -i spring-boot-graalvm    # find PID
top -pid <PID>
```
![img_5.png](img_5.png)
![img_6.png](img_6.png)

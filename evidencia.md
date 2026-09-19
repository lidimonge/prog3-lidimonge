# Evidencia de entorno · Lidiana Monge Araya

## java -version
```
openjdk version "25.0.4.1" 2026-08-18 LTS
OpenJDK Runtime Environment Temurin-25.0.4.1+1 (build 25.0.4.1+1-LTS)
OpenJDK 64-Bit Server VM Temurin-25.0.4.1+1 (build 25.0.4.1+1-LTS, mixed mode, sharing)
```

## mvn -v
```
Apache Maven 3.9.16 (2bdd9fddda4b155ebf8000e807eb73fd829a51d5)
Maven home: C:\Program Files\Apache\apache-maven-3.9.16
Java version: 25.0.4.1, vendor: Eclipse Adoptium, runtime: C:\Program Files\Eclipse Adoptium\jdk-25.0.4.101-hotspot
Default locale: es_CR, platform encoding: UTF-8
OS name: "windows 11", version: "10.0", arch: "amd64", family: "windows"
```

## git --version
```
git version 2.55.0.windows.3
```

## docker run hello-world
```
Hello from Docker!
This message shows that your installation appears to be working correctly.

To generate this message, Docker took the following steps:
 1. The Docker client contacted the Docker daemon.
 2. The Docker daemon pulled the "hello-world" image from the Docker Hub.
    (amd64)
 3. The Docker daemon created a new container from that image which runs the
    executable that produces the output you are currently reading.
 4. The Docker daemon streamed that output to the Docker client, which sent it
    to your terminal.

To try something more ambitious, you can run an Ubuntu container with:
 $ docker run -it ubuntu bash

Share images, automate workflows, and more with a free Docker ID:
 https://hub.docker.com/

For more examples and ideas, visit:
 https://docs.docker.com/get-started/
```

## mvn clean package && java -cp target/classes uam.prog3.App
```
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------------< uam.prog3:hola-mundo >------------------------
[INFO] Building hola-mundo 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.4.0:clean (default-clean) @ hola-mundo ---
[INFO] Deleting C:\Users\Lidi\Documents\hola-mundo\target
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ hola-mundo ---
[INFO] skip non existing resourceDirectory C:\Users\Lidi\Documents\hola-mundo\src\main\resources
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ hola-mundo ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 1 source file with javac [debug release 17] to target\classes
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ hola-mundo ---
[INFO] skip non existing resourceDirectory C:\Users\Lidi\Documents\hola-mundo\src\test\resources
[INFO] 
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ hola-mundo ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 1 source file with javac [debug release 17] to target\test-classes
[INFO] 
[INFO] --- surefire:3.3.0:test (default-test) @ hola-mundo ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running uam.prog3.AppTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.048 s -- in uam.prog3.AppTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- jar:3.4.2:jar (default-jar) @ hola-mundo ---
[INFO] Building jar: C:\Users\Lidi\Documents\hola-mundo\target\hola-mundo-1.0-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.426 s
[INFO] Finished at: 2026-09-18T22:18:05-06:00
[INFO] ------------------------------------------------------------------------

Hello World!
```

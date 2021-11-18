# Spring Boot Starter (template)
A minimal working starter template for Spring Boot applications with a demonstration of Java annotation-based [Inversion of Control](https://stackoverflow.com/questions/3058/what-is-inversion-of-control) via [Dependency Injection](https://stackoverflow.com/questions/130794/what-is-dependency-injection). 

## Run the app

Checkout the latest code from `main` and run the Maven goal `spring-boot:run`:

```
mvn spring-boot:run
```

## What the app does

This small app just parses a file with a collection of good coding prayers and creates a singleton instance of an `CodingPrayersMessageService`. This concrete implementation uses the interface `MessageService`, that comes with only one public method: `String collect()`. 

In the main app code, we just retrieve this Singleton instance or Bean in Spring lingua from the loaded context and call the service. The collected message is then printed out to the command line interface:

```

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.5.6)

2021-11-18 09:17:37.640  INFO 68052 --- [           main] l.q.s.SpringMinimalTemplateApplication   : Starting SpringMinimalTemplateApplication using Java 17.0.1 on imperator.am10.uni-tuebingen.de with PID 68052 (/Users/sven1103/git/spring-boot-starter-template/target/classes started by sven1103 in /Users/sven1103/git/spring-boot-starter-template)
2021-11-18 09:17:37.641  INFO 68052 --- [           main] l.q.s.SpringMinimalTemplateApplication   : No active profile set, falling back to default profiles: default
2021-11-18 09:17:38.164  INFO 68052 --- [           main] l.q.s.SpringMinimalTemplateApplication   : Started SpringMinimalTemplateApplication in 0.808 seconds (JVM running for 1.489)
####################### Message of the day ##################
Have you written unit tests yet? If not, do it!
##############################################################

```

## Realisation of IoC and DPI

<img width="381" alt="grafik" src="https://user-images.githubusercontent.com/9976560/142376871-5bee068f-208c-4af0-a35b-9442ee498789.png">


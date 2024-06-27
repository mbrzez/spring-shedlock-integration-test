# Spring @SchedulerLock integration test

The example presents Spring integration test for `@SchedulerLock` annotation. When annotation is applied and method is executed, lock should be held until stack leaves the method or `lockAtLeastFor` time has passed.

The integration test `SchedulerLockIntegrationTest` uses `@SchedulerLock` annotation from the shedlock library
```
<dependency>  
 <groupId>net.javacrumbs.shedlock</groupId>  
 <artifactId>shedlock-provider-jdbc-template</artifactId>  
 <version>5.13.0</version>  
</dependency>
```
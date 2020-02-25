# spring-batch-reader-retry-command-line-runner

Run using
> mvn spring-boot:run

Output:
```
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building SpringBatchApplication 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] >>> spring-boot-maven-plugin:2.1.4.RELEASE:run (default-cli) > test-compile @ batch-retry-command-line-runner >>>
[INFO]
[INFO] --- maven-resources-plugin:3.1.0:resources (default-resources) @ batch-retry-command-line-runner ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.8.0:compile (default-compile) @ batch-retry-command-line-runner ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:3.1.0:testResources (default-testResources) @ batch-retry-command-line-runner ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory D:\spring-batch-reader-retry\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.0:testCompile (default-testCompile) @ batch-retry-command-line-runner ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] <<< spring-boot-maven-plugin:2.1.4.RELEASE:run (default-cli) < test-compile @ batch-retry-command-line-runner <<<
[INFO]
[INFO] --- spring-boot-maven-plugin:2.1.4.RELEASE:run (default-cli) @ batch-retry-command-line-runner ---
[INFO] Attaching agents: []

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.1.4.RELEASE)

2020-02-25 11:22:46.824  INFO 20740 --- [  restartedMain] c.d.spring.batch.SpringBatchApplication  : Starting SpringBatchApplication on HONEYPOT with PID 20740 (D:\spring-batch-reader-retry\target\classes started by neeteshbhardwaj in D:\spring-batch-reader-retry)
2020-02-25 11:22:46.828  INFO 20740 --- [  restartedMain] c.d.spring.batch.SpringBatchApplication  : No active profile set, falling back to default profiles: default
2020-02-25 11:22:46.899  INFO 20740 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2020-02-25 11:22:48.240  INFO 20740 --- [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2020-02-25 11:22:48.501  INFO 20740 --- [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2020-02-25 11:22:48.512  INFO 20740 --- [  restartedMain] o.s.b.c.r.s.JobRepositoryFactoryBean     : No database type set, using meta data indicating: H2
2020-02-25 11:22:48.711  INFO 20740 --- [  restartedMain] o.s.b.c.l.support.SimpleJobLauncher      : No TaskExecutor has been set, defaulting to synchronous executor.
2020-02-25 11:22:48.964  INFO 20740 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2020-02-25 11:22:49.002  INFO 20740 --- [  restartedMain] c.d.spring.batch.SpringBatchApplication  : Started SpringBatchApplication in 2.537 seconds (JVM running for 3.142)
2020-02-25 11:22:49.105  INFO 20740 --- [  restartedMain] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=myJob]] launched with the following parameters: [{JobID=1582609969008}]
2020-02-25 11:22:49.136  INFO 20740 --- [  restartedMain] o.s.batch.core.job.SimpleStepHandler     : Executing step: [step1]
MyReader : 0
MyProcessor : 0
MyWriter : [0]
MyReader : 1
MyProcessor : 1
MyWriter : [1]
MyReader : 2
MyProcessor : 2
MyWriter : [2]
MyReader : 3
****
MyReader : 3
****
MyReader : 3
****
MyReader : 3
MyProcessor : 3
MyWriter : [3]
MyReader : 4
MyProcessor : 4
MyWriter : [4]
MyReader : 5
2020-02-25 11:22:56.311  INFO 20740 --- [  restartedMain] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=myJob]] completed with the following parameters: [{JobID=1582609969008}] and the following status: [COMPLETED]
2020-02-25 11:22:56.336  INFO 20740 --- [       Thread-8] o.s.b.f.support.DisposableBeanAdapter    : Invocation of destroy method failed on bean with name 'inMemoryDatabaseShutdownExecutor': org.h2.jdbc.JdbcSQLNonTransientConnectionException: Database is already closed (to disable automatic closing at VM shutdown, add ";DB_CLOSE_ON_EXIT=FALSE" to the db URL) [90121-199]
2020-02-25 11:22:56.337  INFO 20740 --- [       Thread-8] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2020-02-25 11:22:56.341  INFO 20740 --- [       Thread-8] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 14.147 s
[INFO] Finished at: 2020-02-25T11:22:56+05:30
[INFO] Final Memory: 24M/304M
[INFO] ------------------------------------------------------------------------
```
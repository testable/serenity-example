Example Serenity project that is compatible with [Testable](https://www.testable.io).

Testable will run the project using either Gradle or Maven by auto-detecting a build.gradle or pom.xml file
in the root of the repository. If both are detected, Gradle will be used.

**Gradle**: `gradle test [params as system properties]` ([master branch](https://github.com/testable/serenity-example/tree/master))

**Maven**: `mvn clean test -Dmaven.test.failure.ignore=true [params as system properties]` ([maven branch](https://github.com/testable/serenity-example/tree/maven))

To configure system properties either create scenario parameters or a
[serenity.properties](src/test/resources/serenity.properties) file with
any [settings](http://www.thucydides.info/docs/serenity/#_serenity_system_properties_and_configuration).

Testable will override the value of the following properties when this code is executed
on a test runner: `serenity.home`, `serenity.outputDirectory`, `webdriver.remote.url`, `output.formats`.
Most other properties can be set as a system property or in a selenium.properties file.
# lombok-gradle-example

Super simple java app using lombok. In this example we show
how to never write getter and setter methods again. 

## Requirements

You must have.

- `java 11`
- `gradle 6.9.2`

Then in your `build.gradle` you must have these dependencies

```groovy
dependencies {  
  compileOnly 'org.projectlombok:lombok:1.18.24'
  annotationProcessor 'org.projectlombok:lombok:1.18.24'
  testCompileOnly 'org.projectlombok:lombok:1.18.24'
  testAnnotationProcessor 'org.projectlombok:lombok:1.18.24'
}
```

### How to run 

```shell
gradle run
```
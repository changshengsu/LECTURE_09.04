# LECTURE_09.04

# Webapps

* HTTP methods: `GET` vs. `POST` vs "the others"
   * REST often uses three others: 	`PUT`,	`PATCH`,	`DELETE`
       * See: <https://en.wikipedia.org/wiki/Representational_state_transfer#Relationship_between_URL_and_HTTP_methods>
   * Complete list of "the rest": <http://www.iana.org/assignments/http-methods/http-methods.xhtml>

# Sparkjava

* A growing collection of resources here: <https://ucsb-cs56-pconrad.github.io/topics/spark_java/>
* Many of those were written by the M18 CS56 mentors

# A Maven tip

In your `pom.xml` file, you can define user defined properties in the `<properties>` section, and then use them later in the file.

This can make it easier to find the things you need to frequently edit, and keep your `pom.xml` DRY (Don't Repeat Yourself) for values that may need to appear in more than one place (e.g. `MainClass`).


```xml
 <!-- what version of Java should we use and what encoding for files? -->
  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>                                                                
    <userDefMainClass>edu.ucsb.cs56.pconrad.SparkDemo01</userDefMainClass>                                            
    <userDefHerokuApp>sparkjava-mongodb-mlab-m18</userDefHerokuApp>
  </properties>
```

Then, to use the property, use the syntax `${userDefMainClass}` or `${userDefHerokuApp}`, like this:

```xml
 <manifest>
    <mainClass>${userDefMainClass}</mainClass>
 </manifest>
```
or
```xml
 <appName>${userDefHerokuApp}</appName>
```

Note that the prefix `userDef` here is my own personal choice; it stands for "user defined" and helps me distinguish these properties&mdash;things I just "made up" for my own use&mdash;from things that have special meaning to Maven and it's various plugins.


# Let's focus first on JSON, then MongoDB/MLab today

* You'll need a way to store data
* JSON is a convenient representation
* MongoDB is a NoSQL database: think of it as a "Dictionary/Hashtable in the Cloud"  (i.e. a key/value store).
* MongoDB is much easier to learn and understand quicky vs. SQL databases

# Two repos as the basis of today's lecture:

| Topic | Description | Github Repo |
|-|-|-|
| RESTful APIs, JSON, Lombok | [spark_java_restful_apis](/topics/spark_java_restful_apis/) | [sparkjava-lombok-jackson-example](https://github.com/ucsb-cs56-pconrad/sparkjava-lombok-jackson-example)|
| MongoDB, MLab | [spark_java_mongodb](https://ucsb-cs56-pconrad.github.io/topics/spark_java_mongodb/) |  [sparkjava-mongodb-mlab-tutorial](https://github.com/ucsb-cs56-m18/sparkjava-mongodb-mlab-tutorial) |

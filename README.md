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

# We may have to defer the mlab stuff...

As of an hour before lecture, the mlab status page (<https://status.mlab.com/>) was reporting some outages.

# Project Lombok... and a word or two about Java 9, 10, 11

Writing boiler plate code is boring.

Project Lombok <https://projectlombok.org/> gives you a way to avoid writing the boring setters, getters, toString, hashCode, etc.

This is a feature that in later version of Java (10, 11, etc.) but until Java 11 has "long-term support" (which is coming in just a few weeks, but is still "in the future") you won't find many organizations using it.

Indeed, a lot of the code examples we are finding to solve various problems *do not run on Java 10*.

You are strongy encouraged, for at least the duration of CS56, to stick with Java 8.

If you installed a later version, you may find your life will be easier if you either:
* Do all your work on CSIL, or
* Downgrade your Java installation to Java 8 (I just did so this morning on my own Mac)


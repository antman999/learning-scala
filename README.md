# learning-scala

![scalaLogo](https://www.openprogrammer.info/wp-content/uploads/2018/08/scala-lang-card.png)

## What is scala? 
>Scala combines object-oriented and functional programming in one concise, high-level language. Scala's static types help avoid bugs in complex applications, and its JVM and JavaScript runtimes let you build high-performance systems with easy access to huge ecosystems of libraries.

## Why scala?
1. Compatible - with java code. Scala programs compile to JVM bytecodes. The run time is almost the same as java. 
2. Concise - Scala code is very small compared to java code. A lot of the boilerplate code from java is optional.  
3. High-level - it lets manage complexity by letting you raise the level of abstraction.

##  val vs. var? 
* A **val**  in scala is similar to **const** in JS, Once you declare it you cant change its value 
```
input -> val me = "Anthony"

output -> me: String = "Anthony"

If you try to change the contents you will get a reassignment error.

```

* A **var** in scala is similar to a **let or var** in JS where you can can change its contents

```
input -> var me = "Anthony"

output -> me: String = "Anthony"

me = "Kem"
// mutated me
val res1: String = Kem

```

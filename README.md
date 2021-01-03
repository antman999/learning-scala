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

println(me)
Anthony

me = "Kem"
// mutated me
println(me)
Kem

```

##  Functions
```
def: Starts a function "Defines"
min: This is the name of the function (can be anything)
(): Next go the parameters what the function takes in. 
num1,num2: Are both parameters required by the function followed by a : which then has what the parameters are such as (Int, String...)
:In ={} : This is what the function results type needs to be followed by the body of the function

def min( num1:Int, num2:Int): Int = {
  if(num1 > num2) num2
  else num1 
}

```

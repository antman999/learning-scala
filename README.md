# learning-scala

![scalaLogo](https://www.openprogrammer.info/wp-content/uploads/2018/08/scala-lang-card.png)

## What is scala? 
>Scala combines object-oriented and functional programming in one concise, high-level language. Scala's static types help avoid bugs in complex applications, and its JVM and JavaScript runtimes let you build high-performance systems with easy access to huge ecosystems of libraries.

## Why scala?
1. Compatible - with java code. Scala programs compile to JVM bytecodes. The run time is almost the same as java. 
2. Concise - Scala code is very small compared to java code. A lot of the boilerplate code from java is optional.  
3. High-level - it lets manage complexity by letting you raise the level of abstraction.

## Small things to know
* All operations in scala are method calls. 
```
doing 1 + 2 -> 3 
is actually doing this under the hood 
(1). + (2) -> 3 
```
* Arrays in scala are accessed via parentheses unlike javascript where you can do [] and accessing an array is also a method call.
```
names[0] - javascript
names(0) - scala

```
* If you have an array that was initialized with **val** you can still change the contents of the array. 

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
1: Starts a function "Defines"

2: This is the name of the function (can be anything)

3: Next go the parameters what the function takes in. 

4: Are both parameters required by the function followed by a : which then has what the parameters are such as (Int, String...).

5: This is what the function results type needs to be

6: Function body

 1   2  3          4            5   6
def min( num1:Int, num2:Int): Int = {
  if(num1 > num2) num2
  else num1 
}

```

## Loops
> loops in scala are similar to JS loops

## Arrays
> Arrays in scala are method calls

1. To initialize an array you can do one of 2 ways (From what I have seen )
```
val names = new Array[String](3)
   1         2   3     4      5
1. variable name
2. New instance 
3. What the instance is 
4. What our array will contain 
5. Allocated size

BUT THERE IS A BETTER WAY TO DO IT 

val names = Array("0", "1", "2") //best way

under the hood we are doing a .apply like so

val names = Array.apply("0", "1", "2")

```
2. Another thing to keep in mind is once init you cannot change an arrays length. You could change the type of array(Int, String...). 

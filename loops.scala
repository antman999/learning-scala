//Q loop over array of strings

val greetStrings = new Array[String](3)
//There is a better way to declare a var that I will have a section for. This is the early stages of the book im reading. 

greetStrings(0) = "Hello"
greetStrings(1) = ","
greetStrings(2) = " World"

for(i <- 0 to greetStrings.length - 1)
  print(greetStrings(i))

var i = 0

while( i < greetStrings.length){
  print(greetStrings(i))
  i += 1
}

//The under the hood way to do this can also be done like so 

for(i <- 0.to(2))
 print(greetStrings.apply(i))
//Since everything is a method call in an object we could do this much harder way :(




// Answer -> 'Hello world'

var name = "ANTHONY"

for (i <- 0 until name.length){
  println(name(i))
}

//Result
//A
//N
//T
//H
//O
//N
//Y





// var i = 0 
// while(i < args.length){
//   println(args(i))
//   i+=1
// }

// var y = 0
// while( y < args.length){
//   if( i !=  0){
//     print(" ")
//   }
//   print(args(y))
//   y +=1
// }


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
// Answer -> 'Hello world'





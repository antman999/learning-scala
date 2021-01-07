def max( num1:Int, num2:Int): Int = {
  if(num1 > num2) num1 
  else num2  
}

def name( myName:String): Unit ={
   println ("My name is " + myName)
}

def bio(name:String, age:Int): Unit ={
  println ("My name is " + myName + "and i am " + age + " years old")
}

def greet() = println("hello world")
//this function takes no parameters  OR  static

// Q - Format a userinput into a phone number 
def formatNum(num:String): Unit ={
  var formattedNum = "("
  var check = ""
  var i = 0 
  while( i < num.length){
    if(num.isNumeric)
  }
  //Work in progress 
}

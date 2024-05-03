fun main(){


val pass= greet("hukum", 23)
println(pass)


}
fun greet(name : String, age : Int) : String{

val birthdayGreet= "Happy birthday , $name "
val ageGreet= " for $age years old"
return "$birthdayGreet\n $ageGreet"

}

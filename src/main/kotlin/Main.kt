fun main() {
place()
    val z = sentence("Diana", 20)
    println(z)
    length()
    location()
}
fun place(){
    val place = "akirachix"
    println(place[0])
    println(place[2])
    println(place[3])
}
fun sentence(name:String,age:Int):String{
    val sentence = "Hi,i am $name and i am $age years old"
    return(sentence)

}
fun length(){
    val name = "Metres"
    return(println( "The length of the string is" + name.length))

}
fun location(){
    val name = ("Margaret")
    if( name == "Margaret"){
        println("Thats me.")}
        else if (name !="Margaret"){
            println("Thats not me")
        }

}
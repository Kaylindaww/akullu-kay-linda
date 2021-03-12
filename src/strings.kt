fun main(){
name()
    kay("linda",20)
    println(food("ugali"))
    println(get("kay linda","that is me!"))
}
fun name(){
    var name ="AkiraChix"
    print(name[0])
    print(name[2])
    println(name[3])
}
fun kay(name:String,age:Int){
    
    var x="linda"
    var y=20
    print("Hii my name is $name and i am $age years")

}
fun food(name:String):Int{
    var foodlength=name.length
    return foodlength
}
fun get(name:String,Output:String){
    if (name=="kay linda")
        println(Output)
}

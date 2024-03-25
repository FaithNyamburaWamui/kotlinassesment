fun main() {
isStatement("Barnice bakes brown bagels and buns")
isValues( 20,30,40)
    calculate(3.14159)
    isPalindrome("madam")
}
fun isStatement(text:String){
   var text = sequenceOf(text)
   println(text)
}


fun isValues(num1:Int,num2:Int,num3:Int){
    var array = arrayOf(20,30,40)
    var sum =num1+num2+num3
    var average = sum/3
    array.count()
    println(sum)
    println(average)
    println(array.contentToString())
}


fun calculate(num:Double){
    var volume = 4/3*22/7*3.14159*3.14159*3.14159
    println(volume)

}


fun isPalindrome(word:String):Boolean{
    var palindrome = "to read the same foward and backwards"
    if(palindrome=="to read the same foward and backwards"){
        return true}
    else{return false}
    }

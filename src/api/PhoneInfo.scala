package api

class PhoneInfo(private var name: String, private var num: String, private var birth: String) {
  def this(name: String, num: String) = this(name, num, null)
  
  def showPhoneInfo() = {
    println(s"name : $name")
    println(s"num : $num")
    if(birth != null) println(s"birth : $birth")
    println()
  }
}
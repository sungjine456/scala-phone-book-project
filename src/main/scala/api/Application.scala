package api

import scala.io.StdIn._
import api.phoneBook._

object Application {
  
  val manager = new Manager
  
  def main(args: Array[String]) {
    var choice: String = ""
    var progress: Boolean = true
    while(progress) {
      showMenu
      choice = readLine()
      choice match {
        case "1" => inputData
        case "2" => searchData
        case "3" => deleteData
        case "4" => updateData
        case "5" => progress = false
        case _ => print("잘못된 입력입니다.\n다시 ")
      }
    }
  }
  
  def showMenu() = {
    println("선택하세요.\n1. 데이터 입력\n2. 데이터 검색\n3. 데이터 삭제\n4. 데이터 수정\n5. 프로그램 종료\n선택 : ")
  }
  
  def inputData() {
    println("이름 : ")
    val name = readLine()
    println("전화번호 : ")
    val num = readLine()
    println("생일 : ")
    val birth = readLine()
    
    val phoneInfo = if(!birth.isEmpty()) new PhoneInfo(name, num, birth) else new PhoneInfo(name, num)
    manager.inputDate(phoneInfo)
    println("\n입력된 정보 출력\n" + phoneInfo)
  }
  
  def searchData() {
    println("\n이름 : ")
    val name = readLine()
    val phoneInfo = manager.searchDate(name)
    val str = if(phoneInfo!=null) phoneInfo else "없는 데이터입니다."
    println(str)
  }
  
  def deleteData() {
    println("\n이름 : ")
    val name = readLine()
    manager.deleteDate(name)
    println("삭제 성공")
  }
  
  def updateData() {
    println("이름 : ")
    val name = readLine()
    println("전화번호 : ")
    val num = readLine()
    println("생일 : ")
    val birth = readLine()
    
    val phoneInfo = if(!birth.isEmpty()) new PhoneInfo(name, num, birth) else new PhoneInfo(name, num)
    val bool = manager.updateDate(phoneInfo);
    if(bool) println("수정 성공")
    else println("수정 실패")
  }
}
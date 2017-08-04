package api

import scala.io.StdIn.readLine

object Application {
  def main(args: Array[String]) {
    var choice: String = null
    var progress: Boolean = true
    while(progress) {
      showMenu
      choice = readLine()
      choice match {
        case "1" => readDate
        case "2" => progress = false
      }
    }
  }
  
  def showMenu() = {
    print("선택하세요.\n1. 데이터 입력\n2. 프로그램 종료\n선택 : ")
  }
  
  def readDate() = {
    print("이름 : ")
    val name = readLine()
    print("전화번호 : ")
    val num = readLine()
    print("생일 : ")
    val birth = readLine()
    
    val phoneInfo = new PhoneInfo(name, num, birth)
    println("\n입력된 정보 출력")
    phoneInfo.showPhoneInfo()
  }
}
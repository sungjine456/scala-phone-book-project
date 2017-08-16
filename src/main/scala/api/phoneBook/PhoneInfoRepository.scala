package api.phoneBook

import scala.collection.mutable.Map

object PhoneInfoRepository {
  private val data: Map[String, PhoneInfo] = Map()
  
  def search(name: String): PhoneInfo = {
    if(isExistData(name)) data(name)
    else null
  }
  
  def saveData(phoneInfo: PhoneInfo) {
    data += (phoneInfo.name -> phoneInfo)
  }
  
  def deleteData(name: String) {
    data -= name
  }
  
  def isExistData(name: String): Boolean = {
    if(data.contains(name)) true
    else false
  }
}
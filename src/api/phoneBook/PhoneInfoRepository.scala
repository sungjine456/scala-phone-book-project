package api.phoneBook

import scala.collection.mutable.Map

object PhoneInfoRepository {
  private val data: Map[String, PhoneInfo] = Map()
  
  def search(name: String): PhoneInfo = {
    if(!data.contains(name)) null
    else data(name)
  }
  
  def saveData(phoneInfo: PhoneInfo) {
    data += (phoneInfo.name -> phoneInfo)
  }
  
  def deleteData(name: String) {
    data -= name
  }
}
package api.phoneBook

class Manager {
  private val phoneInfoRepository = PhoneInfoRepository
  
  def searchDate(name: String): PhoneInfo = {
    phoneInfoRepository.search(name)
  }
  
  def inputDate(phoneInfo: PhoneInfo) {
    phoneInfoRepository.saveData(phoneInfo);
  }
  
  def deleteDate(name: String): Boolean = {
    if(phoneInfoRepository.isExistData(name)){
      phoneInfoRepository.deleteData(name)
      true
    }
    false
  }
  
  def updateDate(phoneInfo: PhoneInfo): Boolean = {
    if(phoneInfoRepository.isExistData(phoneInfo.name)){
      phoneInfoRepository.saveData(phoneInfo);
      true
    }
    false
  }
}
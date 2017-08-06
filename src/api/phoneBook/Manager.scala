package api.phoneBook

class Manager {
  private val phoneInfoRepository = PhoneInfoRepository
  
  def searchDate(name: String): PhoneInfo = {
    phoneInfoRepository.search(name)
  }
  
  def inputDate(phoneInfo: PhoneInfo) {
    phoneInfoRepository.saveData(phoneInfo);
  }
  
  def deleteDate(name: String) {
    phoneInfoRepository.deleteData(name)
  }
}
package api.phoneBook

class PhoneInfo(private var _name: String, private var _num: String, private var _birth: String) {
  def this(_name: String, _num: String) = this(_name, _num, null)
  
  def name = _name
	def num = _num
	def birth = _birth
	
	def name_(setName: String) = { _name = setName }
  def num_(setNum: String) = { _num = setNum }
  def birth_(setBirth: String) = { _birth = setBirth }
  
  override def toString = s"name : $name, num : $num" + (if(_birth != null) s", birth : $birth\n" else "\n")
}
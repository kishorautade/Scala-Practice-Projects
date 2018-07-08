object OptionDemo extends  App{
  def toInt(str: String): Option[Int] = {
    try {
      Some(str.toInt)
    } catch {
      case e: Exception => None
    }
  }

  val list = List("4", "6", "2", "hi", "32")
  val newList = list.flatMap(toInt)
  println(newList)
  println(newList.sum)

}

class HigherOrderFunctions {

  def halfMaker(value: Int): Double = value.toDouble / 2

  def addFive(value: Int): Int = value + 5

  def processData(value: Int, processor: Int => AnyVal): Unit = {
    println(processor(value))
  }

  def getMeFunctionToWork(op: String)= {
    op match {
      case "+" => (val1: Int, val2: Int) => println(val1 + val2)
      case "*" => (val1: Int, val2: Int) => println(val1 * val2)

    }
  }
}

object HigherOrderFunctions extends App {
  val higherOrderFunctionDemo = new HigherOrderFunctions
  //pass function as parameter
  higherOrderFunctionDemo.processData(5, higherOrderFunctionDemo.halfMaker)
  higherOrderFunctionDemo.processData(5, higherOrderFunctionDemo.addFive)
  //anonymous function
  higherOrderFunctionDemo.processData(5, t => t * 2)
  //function returning function
  val fun = higherOrderFunctionDemo.getMeFunctionToWork("+")
  fun(6, 7)
}

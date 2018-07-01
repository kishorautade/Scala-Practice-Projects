import Colour.Colour

class PatternMatching {

  def matchCharacter(ch: Char): Unit = {
    ch match {
      case '+' => println("plus")
      case '-' => println("minus")
      case '*' => println("multiply")
      case _ => println("others")
    }
  }

  def matchEnum(color: Colour): Unit = {

    color match {
      case Colour.RED => println("its red")
      case Colour.GREEN => println("its green")
      case _ => println("other colour")
    }
  }

  def matchMultipleAlternatives(country: String): Unit = {
    country.toUpperCase match {
      case "INDIA" | "CHINA" | "SINGAPORE" => println("Asia")
      case "USA" | "CANADA"  => println("North America")
      case _ => println("Not on earth")
    }
  }

  def matchWithGuard(ch:Char): Unit ={
    ch match {
      case _ if Character.isDigit(ch) => Character.digit(ch,10)
      case _ => println(ch)
    }
  }

  def matchWithType(any:Any): Unit ={
    any match {
      case x:Int => println("Int")
      case y:Char => println("Char")
      case z:PatternMatching => println("Pattern Matching object")
      case k:String => println("String")
      case m: Map[_,_] => println("map "+m)
    }
  }

  def matchArray(array:Array[_]): Unit ={
    array match {
      case Array(0,1) => println("two ints")
      case Array(param1,param2)=> println("two params array")
      case Array(_,_,_) => println("3")
    }
  }

  def matchTuples(tuple:Any): Unit ={
    tuple match {
      case (1,'c',str) => println("tuple")
      case _ =>
    }
  }

  def mapMatch(map:Map[String,String]): Unit ={
    val mapVal1=map.get("key1")
    mapVal1 match {
      case Some(value1) => println(value1)
      case None => println("None")
    }

    println(mapVal1.getOrElse(""))
  }

  def identifyTrafficLight(colour :TrafficLightColour): Unit ={
    colour match {
      case Red => println("Stop")
      case Green => println("Go")
    }

  }
}

object Colour extends Enumeration {
  type Colour = Value
  val RED, YELLOW, GREEN = Value
}

object PatternMatching {
  def apply: PatternMatching = new PatternMatching()
}

sealed abstract class TrafficLightColour
case object Red extends  TrafficLightColour
case object Green extends  TrafficLightColour
case object Yello extends  TrafficLightColour

object PatterTester extends App {
  val patternMatcher = new PatternMatching()

  patternMatcher.matchCharacter('+')
  patternMatcher.matchCharacter('%')

  patternMatcher.matchEnum(Colour.GREEN)

  patternMatcher.matchMultipleAlternatives("India")
  patternMatcher.matchWithGuard(99)
  patternMatcher.matchWithGuard('w')

  patternMatcher.matchWithType('q')
  patternMatcher.matchWithType(1)
  patternMatcher.matchWithType(patternMatcher)
  patternMatcher.matchWithType(Map("key1" -> "val1"))

  patternMatcher.matchArray(Array("12","23"))
  patternMatcher.matchArray(Array(0,1))
  patternMatcher.matchTuples((1,'c',"str"))

  patternMatcher.mapMatch(Map("key1"->"val1"))

  val trafficColour=Red
  patternMatcher.identifyTrafficLight(trafficColour)
}
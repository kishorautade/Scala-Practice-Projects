object Collections extends App {

  //duplicate allowed, maintain order, are mutable
  val array = Array(1, 3, 5, 2, 5, 2, 7)
  println(array(2))

  //can contain duplicates, maintain order, are immutable
  val list = List(2, 3, 5, 2, 3, 2, 6, 2)
  println(list)

  //no duplicates, no order
  val set = Set(2, 3, 5, 6, 1, 7, 2, 4, 3)
  println(set)

  val tuple = ("Kishor", 29)
  println(tuple)

  val map = Map("key1" -> "val1", "key2" -> "val2")
  println(map)

  val val3 = map.get("key3")

  println(map("key1"))
  println(val3.getOrElse("not found"))
  val3 match {
    case None => println("not found")
    case Some(s) => println(s)
  }
  /*
  Functional Combinators
   */

  //Evaluates a function over each element in the list, returning a list with the same number of elements.
  val list2 = list.map(t => t * 2)
  val list3 = list.map(_ * 2)
  println(list2)

  //foreach is like map but returns nothing. foreach is intended for side-effects only
  println()
  list.foreach(i => print(i + 5) + " ")
  println()

  //removes any elements where the function you pass in evaluates to false.
  // Functions that return a Boolean are often called predicate functions.
  val filterredList = list.filter(t => t % 2 == 0)
  println(filterredList)

  //partition splits a list based on where it falls with respect to a predicate function
  val partitionedResult = list.partition(_ % 2 == 0)
  println(partitionedResult)

  //find returns the first element of a collection that matches a predicate function
  val found = list.find(_ > 3)
  println(found)

  //drop dropWhile zip.
  //drop drops the first i elements
  //dropWhile removes the first element that match a predicate function
  //foldLeft foldRight

  val folded = list.foldLeft(0) { (m: Int, n: Int) => println(m + n); m + n }
  println(folded)

  val listOfLists = List(List(1, 2), List(3, 4))
  //flatten
  val flattenedList = listOfLists.flatten
  println(filterredList)

  //val flatMapApplied = listOfLists.flatMap()

}

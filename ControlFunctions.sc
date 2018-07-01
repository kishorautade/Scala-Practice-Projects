object ControlFunctions{
  val x=10
  val s = if(x>0) 1 else -1 //expression has value
  val s1 = if(x>0) "positive" else -1 //Any supertype of both
  val s2 = if(x<0) -1 //void is Unit
  if(x>0){
    1
  } else{
       -1
  }
  val y=20; val x0=2; val y0=3
  val distance={val dx=x-x0;val dy=y-y0;scala.math.sqrt(dx*dx+dy*dy)}
  //m = n = 1
  print("Answer")
  println(42)
  println("Answer: "+42)
  printf("distance is %f",distance) //like c. %n %s %d
  print(f"Distance is $distance adding 2 to it ${distance +2 }")
  val name="Henry"
  println(s"$name travelled $distance distance")
  //scala.io.StdIn.readLine() readInt()
  /*while(x>1){
    x*2
    x-=1
  }*/

}
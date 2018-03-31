class Point(val xc:Int,val yc:Int) {
  var x:Int=xc
  var y:Int=yc

  def move(xd:Int,yd:Int){
      x=x+xd;
      y=y+yd;
      println("x: "+x)
      println("y: "+y)
  }
}
object Demo{
    def main(args: Array[String]): Unit ={
      val pointObj=new Point(12,20)
      pointObj.move(3,5)
    }
}

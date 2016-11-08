class ScalaPdtFactory(x: Int, y: Int) {
var instanceVar :String = "I can change you know"
val result = x *y //I am a readonly guy!   You can't change me!

def this(x: Int) = this(x,1)


def supplyPdt() : Int = result

}

object ScalaClass {

  def mulitply (x: Int, y: Int): Int = {
    x * y
  }
}

object  ScalaRunna {

def main( args:Array[String] ): Unit = {

println("Scala runs on JVM!")

val sc = new ScalaClass()

println("Scala simple Class" + sc.mulitply(2,3))


  }
}

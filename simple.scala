object Main {
  def main(args: Array[String]) {
        for {i <- 1 to10} 
          println(i) 

  }
}

object Main {
  def main(args: Array[String]) {
        for {
           a <- 1 to 10 
             b <- 1 to 10
        } 
        println(a* b) 

  }
}

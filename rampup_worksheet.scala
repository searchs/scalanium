object obj {

  val nums = List.range(1, 10)

  val odds = nums.filter(_ % 2 != 0)
  println(odds)


  //  val m = Map(1 -> "uno", 2 -> "dos")

  val mySet = Set(-1, 0, 1)


  //Collections: Seq, Map, Set

  "SMACK".foreach(print)


  //  Transforming map

  val smack = Vector("spark", "mesos", "akka", "cassandra", "kafka")

  val cap = smack.map(_.capitalize)
  //smack.map(s => s.capitalize)

  val lens = smack.map(_.size)

  val elem = smack.map(smack => <li>
    {smack}
  </li>)

  val names = List("jack", "ola", "ozil", "alexis")
  val y = for (s <- names) yield s.capitalize
  y

  //flatten list

  val couples = List(List("Rachel", "Ross"), List("Monica", "Chandler"))
  val friends = couples.flatten

  val tvfriends = couples.flatten.map(_.toUpperCase).sorted


  val biggo = Vector("spark", "mesos", "akka", "cassandra", "kafka")
  val lgth = biggo.map(_.size)


  val v = (-50 to 50).view

  val f = v.force


  //  Sorting in Ascending or Descending order
  List(10, 1, 8, 3, 5).sortWith(_ < _)
  List(10, 1, 8, 3, 5).sortWith(_ > _)
  val l = List(23, 56, 34, 77, 88, 1, 705)
  //  l.sorted


  0 to 15 by 3

  val li = 0 until 8


}



object Q8 {
def main(args:Array[String]) : Unit ={   
  def permutationGen(lst:List[Int]):List[List[Int]] = 
 lst match {
  case Nil => List(List())
  case head::tail => {
    val len = lst.length
    val tps = (0 to len-1).map(lst.splitAt(_)).toList.filter(tp => !tp._1.contains(tp._2.head))
    tps.map(tp => permutationGen(tp._1:::tp._2.tail).map(tp._2.head :: _)).flatten
  }
  
}

}

}

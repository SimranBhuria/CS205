

object Q3 {
def main(args: Array[String]) : Unit = {
  def sortInsert(lst:List[Int],x:Int) : List[Int] = 
    lst match{
    case Nil => List(x)
    case hd::rest if x<=hd => x::lst
    case hd::rest if x>hd => hd::sortInsert(rest,x)
      
    }
 
  }

}

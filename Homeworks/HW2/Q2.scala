

object Q2 {
def main(args:Array[String]): Unit = {
 
  def Split(lst:List[Int]): (List[Int],List[Int]) = { 
      
    lst match{ 
    case Nil => (List(),List()) 
    case hd::rest if lst.length>1 => (hd::Split(rest.init)._1 , Split(rest.init)._2:::List(lst.last))
    case hd::rest if lst.length==1 => (List(hd), Nil) 
    }     
  }


}  
}

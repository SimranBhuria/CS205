

object Q6 {
 def main(args:Array[String]): Unit = { 
  def pivotSort(lst:List[Int],x:Int): List[Int] = 
     lst match{
     case Nil => List(x)
     case hd::rest if hd<=x => hd::pivotSort(rest,x)
     case hd::rest if hd>x => pivotSort(rest,x):::List(hd)
   }
  def quickSort(l:List[Int]):List[Int] =
    l match{
    case Nil => l
    case hd::rest => pivotSort(quickSort(l.filterNot(elm=>elm==l.max)),l.max)
                    
    
  }
 
  
}
}

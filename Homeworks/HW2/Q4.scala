

object Q4 {
 def main(args:Array[String]) : Unit = {
   
   def sortInsert(lst:List[Int],x:Int) : List[Int] = 
    lst match{
    case Nil => List(x)
    case hd::rest if x<=hd => x::lst
    case hd::rest if x>hd => hd::sortInsert(rest,x)
   }
   def InsertionSort(l:List[Int]): List[Int] = 
     l match{
     case Nil=> l
     case hd::rest => sortInsert(InsertionSort(rest), hd)
   }

 }

}

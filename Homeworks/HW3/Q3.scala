

object Q3V2 {
  def main(args:Array[String]) : Unit = {
    def add(lst:List[Int]) {  //function to add the list of numbers
      Console.println(" Enter the no. of threads\n")
      val n : Int = readInt()  // storing the value provided by the user
      val e = lst.length/n  // portion of the list each thread would handle
      var tot_sum=0     //stores the final sum
      var curr: List[List[Int]] = List(List())  //stores the portions of list that
                                               //we will give to each thread
      var c= 0                //stores the starting point when partitioning the list
      for (i <- ( 0 to n-1) ){   //loop partitions the list into n sublists for each thread
        val t = lst.slice(c,c+e)
        curr = curr:::(List(t))   //slicing the list appropriately and adding to the curr list defined earlier
        c=c+e
        
      }
      val t = lst.length
      if(t%n!=0) {   //case for when the number of threads required do not divide the length of the list
      val p = curr(1):::lst.takeRight(t%n)  //adding the leftover elements to the first element of curr
      curr = curr++List(p)
      
      }
      curr=curr.drop(2)  //dropping the first two elements to avoid repetition/ empty lists
      Console.println(curr)
      var tp : List[Thread] = List()  //to store the threads to be created later
      for ( j <- (0 to n-1)) {   // loop to create n threads 
        val t = new Thread(new Runnable {
   override def run() {
        val sum = curr(j).fold(0)((x,y) => x+y)  //each thread summing up the elements of its list
   tot_sum+=sum     
   Console.println(sum)
   }
   
   
   })
      tp = tp:::List(t)   //adding the thread to the list
      }
 for(q <- tp){
   q.start()    //executing the threads
 }
    
 
    
    } 

  }
}

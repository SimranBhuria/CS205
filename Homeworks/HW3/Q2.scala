object Q2 {
  def main(args:Array[String]): Unit =
  {
    //method to split a list 
    def split[A](lst:List[A],lst1:List[A],lst2:List[A]): (List[A],List[A]) = {
     
       
       lst match{
         case Nil => (lst1,lst2)  //case where the list is empty
         case hd::Nil => (hd::lst1, lst2)  //case where there is only one element in the list
         case hd::tail => var curr = lst  //storing the value of the list for modificaton
                          var l1 = lst1  //initialising two lists with Nil
                          var l2 = lst2  //for the purpose of adding to them to get the split lists
                          while(curr.length>2) { //if the length reaches two or below, curr.tail.init will throw an exception
                          l1 =l1:+curr.head   //adding the head of the list to first sub list
                          
                          l2=curr.last::l2  // adding the tail to the second sub list
                          curr=curr.tail.init //getting the middle part of the list
                          
                         
         } 
         if(curr.length==2){ //if the length of the middle part becomes two
                             //then the list can be evenly split
          l2=curr.last::l2  //adding the second element to the second sublist
         }
          l1 = l1:+curr.head  //if the middle part has only one element
                             //the list is not evenly split, we add the element to the first sublist
                             //this has to be done in the even case as well because we have added only the second
                             //of the two elements
         (l1,l2)       //returning the split lists
       }
       
       
    }
   
Console.println(split(List(1,2,3,4,5,6,7,8,9),Nil,Nil))    
  }
  

}

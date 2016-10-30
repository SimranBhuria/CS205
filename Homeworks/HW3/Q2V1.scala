//splitting the lists with the help of a stack though it is not necessary to use a stack

import scala.collection.mutable.Stack  //importing the Stack collection
object Q2V1 {
  def main(args:Array[String]): Unit =
  {
    def split[A](lst:List[A],lst1:List[A],lst2:List[A]): (List[A],List[A]) = {
       //method to split a list 
       
       lst match{
         case Nil => (lst1,lst2) //case where the list is empty
         case hd::Nil => (hd::lst1,lst2)  //case where there is only one element in the list
         case hd::tail => var cont = Stack[List[A]]() //declaring a new variable of Stack type
                          
                          var curr = lst  //copying the original list into curr for modification
                          
                          while(curr.length>0) { //loop runs until there are elements in curr
                           
                          if(curr.length==2){ // if curr has two elements
                                           // then the middle part would result in an error
                            
                            cont.push(curr) //so, we push the value as it is on the stack
                            curr = Nil  //emptying curr so that the loop stops
                          }
                          else if(curr.length==1){  //if curr has one element
                                               //then there is no middle part again
                            cont.push(List(curr.head)) //hence, repeat as above
                            curr=Nil
                          }
                          else {
                           val head = curr.head   //when curr has more than 2 elements
                           val last = curr.last  //we keep pushing the head and last pairs to the stack
                           cont.push(List(head,last)) //while we keep slicing the list
                           curr = curr.tail.init   //this gives the middle section
                           
                          }
         }  
         var l1=lst1
         var l2 =lst2
         
       //Once, we have the elements of the list in the stack, we need to access them
       //in order to split the list, so we loop over the stack
       for( i <- (0 to cont.size-1)){
           val c = cont.top   //gives the top element on the stack
           
           if(c.length==1){   //if the top has only one element, we add it to the first sublist and
                               // delete it from the stack
             l1 = c(0)::l1   
             cont.pop
           }
           else{
             l1 = c(0)::l1  //else, we add the first element in the list that is at the top of the stack
             l2 = l2:+c(1)  // to the first sublist and the other one to the second sublist
             cont.pop    //then delete that top element from the stack
           }
           
         }
         
         (l1,l2)   //returning the list
       }
    }     
Console.println(split(List(1,2,3),Nil,Nil))
  }
}

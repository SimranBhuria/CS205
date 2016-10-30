class Queue(){
	var queue: List[Any]=Nil     //variable list to implement a queue
	def equals(that: Queue): Boolean={  //overriding defn of equals methods
		(this.queue, that.queue) match{
			case (Nil, Nil) => true       //case where both the queues are empty
			case (x::y, a::b) => (x.equals(a)) && (y.equals(b))  //case where none of the queues are empty
			                                          //We compare the queues by their comparing their heads and the rest of the bodies
			case _ => false          //in all other cases, the queues would not be equal                        
		}
	}
	override def hashCode(): Int={  //overriding defn of hashCode
		var sum: Int=0            //adding the hashcodes of all the elements in the current queue
		this.queue.foreach{
			sum+=_.hashCode()
		}
		sum
	}
	
	def Dequeue(): Unit={     //function to remove an element from the queue
		this.queue match{       //matching the current queue
			case Nil => this.queue=Nil   //case where  the queue is empty 
			case hd::tail => this.queue=tail //case where the queue is non-empty
			                                 //so, we remove the first element
		}
	}
	
	def Enqueue(n: Any): Unit={  //function to add an element to the queue
		this.queue=this.queue:::List(n)  //adding an element to the end of the queue
	}
}

public class Queue<T> {
	SList<T> list = new SList<T>();

	Queue() {
	}

	void enqueue(T element) {
	//Exercise 1a	 
	}

	T dequeue() {
	//Exercise 1b	 
	}

	T queuefront() {
      //Exercise 1c
	}

	T queuerear() {
	  //Exercise 1d
	}
     boolean isEmpty() {
		return list.isEmpty(); 
	}

     // Copy this Queue (itself) to another Queue
	Queue<T> copyQueue() 
	{
		//Exercise 2
           return null; //replace this line of code with yours
	}

	// Check if this Queue(itself) has the same content as Q2 
	boolean isIdentical(Queue<T> Q2) 
	{
		//Exercise 3
          return false; //replace this line of code with yours
	}


	void printHorizontal() {
		Node<T> walker = list.first;
		for (int i = 0; i < list.size; i++) {
			System.out.print(walker.element + " ");
			walker = walker.next;
		}
		System.out.println();
	}

}
public class Queue<T> {
	SList<T> list = new SList<T>();

	Queue() {
	}

	void enqueue(T element) {
	//Exercise 1a
		list.addLast(element);
	}

	T dequeue() {
	//Exercise 1b
		return list.removeFirst();
	}

	T queuefront() {
      //Exercise 1c
		return list.first.element;
	}

	T queuerear() {
	  //Exercise 1d
		return list.last.element;
	}
     boolean isEmpty() {
		return list.isEmpty(); 
	}

     // Copy this Queue (itself) to another Queue
	Queue<T> copyQueue() 
	{
		//Exercise 2
		Node<T> walker = list.first;
		Queue<T> tmp = new Queue<T>();
		
		while (walker != null)
		{
			tmp.enqueue(walker.element);
			walker = walker.next;
		}
			
           return tmp; //replce this line of code with yours
	}

	// Check if this Queue(itself) has the same content as Q2 
	boolean isIdentical(Queue<T> Q2) 
	{
		//Exercise 3
		Node<T> tmp1 = this.list.first;
		Node<T> tmp2 = Q2.list.first;
		
		while (tmp1 != null || tmp2 != null)
		{
			if (tmp1 == null || tmp2 == null || tmp1.element != tmp2.element)
			{
				return false;
			}
			tmp1 = tmp1.next;
			tmp2 = tmp2.next;
		}
          return true; //replace this line of code with yours
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
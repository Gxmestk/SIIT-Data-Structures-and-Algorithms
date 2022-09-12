public class SList<T> {
	// Class properties
	int size;
	Node<T> first;
	Node<T> last;

	// Class constructor
	SList() {
		size = 0;
		first = null;
		last = null;
	}

	/*----------------------------------------------------*/

	// Class methods

	void addFirst(T element) {
		Node<T> newNode = new Node<T>(element);
		newNode.next = first;
		first = newNode;
		size++;
		if (last == null)
			last = first;
	}

	void addLast(T element) {
		// Ex.1 complete the program
		if (size == 0 || first == null || last == null)
		{
			addFirst(element);
		}
		else
		{
			Node<T> newNode = new Node<T>(element);
			last.next = newNode;
			last = newNode;
			size++;
		}
		/*
		 Node<T> newNode = new Node<T>(element);
		if (last == null) {
			last = first = newNode;
		} else {
			last.next = newNode;
			last = newNode;
		}
		size++;
		*/
	}
	void addAtIndex_BO(int index, T element)
	{
		int	i;
		Node<T>	newNode = new Node<T>(element);
		Node<T> walker; 
		
		i = 0;
		walker = first;
		while (i < index - 1)
		{
			walker = walker.next;
			i++;
		}
		newNode.next = walker.next;
		walker.next = newNode;
		size++;
	}
	void addAtIndex(int index, T element) {
		// Ex.2 complete the program
		if (index == 0)
		{
			addFirst(element);
		}
		else if (index == size)
		{
			addLast(element);
		}
		else if (index > 0 && index < size)
		{
			addAtIndex_BO(index, element);
		}
	}
	/*void addAtIndex(int index, T element) {
		if (index == 0)
			addFirst(element);
		else if (index == size)
			addLast(element);
		else {
			Node<T> current = first;
			for (int i = 1; i < index; i++)
				current = current.next;

			Node<T> newNode = new Node<T>(element);
			newNode.next = current.next;
			current.next = newNode;
			size++;
		}
	}*/

	T removeFirst() {
		if (size == 0)
			return null;
		else {
			Node<T> tmp = first;
			first = first.next;
			size--;
			if (first == null)
				last = null; //OR last = first
			return tmp.element;
		}

	}

	T removeLast() {
		if (size < 2)
		{
			return removeFirst();
		}
		else
		{
			Node<T> tmp = last;
			Node<T>	walker = first;
			
			while (walker.next != last)
			{
				walker = walker.next;
			}
			walker.next = null;
			last = walker;
			size--;
			return tmp.element;
		}
		// Ex.3 replace this line with your code
			
	 
	}

	T removeAtIndex_BO(int index)
	{
		int	i;
		Node<T> walker;
		Node<T> tmp;
		
		i = 0;
		walker = first;
		while (i < index - 1)
		{
			walker = walker.next;
			i++;
		}
		tmp = walker.next;
		walker.next = walker.next.next;
		size--;
		return tmp.element; 
	}
	T removeAtIndex(int index) {
		 
		if (index == 0)
		{
			return removeFirst();
		}
		else if (index == size - 1)
		{
			return removeLast();
		}
		else if (index > 0 && index < size - 1)
		{
			return removeAtIndex_BO(index);
		}
		return null; // Ex.4 replace this line with your code
	}

	int search(T item) {
		
		int	i;
		Node<T> walker;
		
		i = 0;
		walker = first;
		while (walker != null && walker.element != item) //swap
		{
			i++;
			walker = walker.next;
		}
		
		if (walker == null)
		{
			return -1;
		}
		return i; // Ex.5 replace this line with your code
	}

	boolean isEmpty() {
		if (size == 0)
			return true;
		else
			return false;
	}

	int getSize() {
		return size;
	}

	void printHorizontal() {
		Node<T> walker = first;
		for (int i = 0; i < size; i++) {
			System.out.print(walker.element);
			System.out.print(" ");
			walker = walker.next;
		}
		/*while (walker != null)
		{
			System.out.print(walker.element);
			System.out.print(" ");
			walker = walker.next;
		}*/
		System.out.println("\n-----");
	}
}
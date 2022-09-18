//New Version of Singly LinkedList
public class SList<T> {
	int size;
	Node<T> first;
	Node<T> last;
	
	SList() {
		size = 0;
		first = null;
		last = null;
	}

	// methods
	void addFirst(T element) {
		Node<T> newNode = new Node<T>(element);
		newNode.next = first;
		first = newNode;
		size++;
		if (last == null)
			last = first;
	}

	void addLast(T element) {
		Node<T> newNode = new Node<T>(element);
		if (last == null) {
			last = first = newNode;
		} else {
			last.next = newNode;
			last = newNode;
		}
		size++;
	}

	void addAtIndex(int index, T element) {
		if (index == 0)
			addFirst(element);
		else if (index == size)
			addLast(element);
		else {
			Node<T> current = first;
			for (int i = 0; i < index - 1; i++)
				current = current.next;

			Node<T> newNode = new Node<T>(element);
			newNode.next = current.next;
			current.next = newNode;
			size++;
		}
	}

	T removeFirst() {
		if (size == 0)
			return null;
		else {
			Node<T> tmp = first;
			first = first.next;
			size--;
			if (first == null)
				last = null;
			return tmp.element;
		}
	}

	T removeLast() {
		if (size == 0)
			return null;
		else if (size == 1) {
			Node<T> tmp = first;
			first = last = null;
			size = 0;
			return tmp.element;
		} else {
			Node<T> current = first;
			for (int i = 0; i < size - 2; i++)
				current = current.next;
			Node<T> tmp = last;
			last = current;
			last.next = null;
			size--;
			return tmp.element;
		}
	}

	T removeAtIndex(int index) {
		if (index < 0 || index >= size)
			return null;
		else if (index == 0)
			return removeFirst();
		else if (index == size - 1)
			return removeLast();
		else {
			Node<T> current = first;
			for (int i = 0; i < index - 1; i++) {
				current = current.next;
			}
			Node<T> tmp = current.next;
			current.next = tmp.next;
			size--;
			return tmp.element;
		}
	}

	T getElementAtIndex(int index) {
		Node<T> current = first;
		for (int i = 0; i < index; i++)
			current = current.next;

		return current.element;
	}

	int search(T item) {
		Node<T> current = first;
		for (int i = 0; current != null; i++) {
			if (current.element.equals(item))
				return i;
			current = current.next;
		}
		return -1;
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

	void printVertical() {
		Node<T> walker = first;
		for (int i = 0; i < size; i++) {
			System.out.println(walker.element);
			walker = walker.next;
		}
		System.out.println("-----");
	}

	void printHorizontal() {
		Node<T> walker = first;
		for (int i = 0; i < size; i++) {
			System.out.print(walker.element);
			System.out.print(" ");
			walker = walker.next;
		}
		System.out.println("\n-----");
	}

	void clear() {
		size = 0;
		first = last = null;
	}

	boolean contains(T element) {
		Node<T> current = first;
		for (int i = 0; i < size; i++) {
			if (current.element.equals(element))
				return true;
			current = current.next;
		}
		return false;
	}

	T get(int index) {
		if (index < 0 || index > size - 1)
			return null;
		Node<T> current = first;
		for (int i = 0; i < index; i++)
			current = current.next;
		return current.element;
	}

	int indexOf(T element) {
		Node<T> current = first;
		for (int i = 0; i < size; i++) {
			if (current.element.equals(element))
				return i;
			current = current.next;
		}
		return -1;
	}

	void union(SList<T> otherList) {
		for (int i = 0; i < otherList.size; i++) {
			if (contains((T) otherList.first.element) == false) {
				addLast((T) otherList.first.element);
			}
			otherList.first = otherList.first.next;
		}
	}
}
class TestList {
	public static void main(String[] args) {

		SList<Integer> ilist = new SList<Integer>();
		if (ilist.isEmpty() == true)
			System.out.println("You have successfully create your list and it's empty now");
		else
			System.out.println("Your list is not empty");

		// ============ Ex.1================================================
		// continue on from the previous code

		System.out.println("\n Test addFirst and addLast");
		System.out.println("add 5, 7, 2, 9 and 1 to first, first, last, first, and last, respectively ");

		ilist.addFirst(5);
		ilist.addFirst(7);
		ilist.addLast(2);
		ilist.addFirst(9);
		ilist.addLast(1);
		System.out.print("Your result is : ");
		ilist.printHorizontal();
		System.out.println("The result should be : 9 7 5 2 1");

		// ============ Ex.2================================================
		// continue on from the previous exercise
		// Uncomment this part of code to test Ex. 2

		/*System.out.println("\n Test addAtIndex");
		System.out.println("add 6, 8, and 4 to index 0, 5, and 4, respectively ");
		ilist.addAtIndex(0, 6);
		ilist.addAtIndex(5, 8);
		ilist.addAtIndex(4, 4);
		System.out.print("Your result is : ");
		ilist.printHorizontal();
		System.out.println("The result should be : 6 9 7 5 4 2 8 1");*/

		// ============ Ex.3 ================================================
		// continue on from the previous exercise
		// Uncomment this part of code to test Ex. 3

		/*System.out.println("\n Test removeFirst and removeLast");
		System.out.println("remove the first and the last element");
		ilist.removeFirst();
		ilist.removeLast();
		System.out.print("Your result is : ");
		ilist.printHorizontal();
		System.out.println("The result should be : 9 7 5 4 2 8");*/

		// ============================ Ex.4 ================================
		// continue on from the previous exercise
		// Uncomment this part of code to test Ex. 4

		/*System.out.println("\n Test removeAtIndex");
		System.out.println("remove element at Index 3");
		ilist.removeAtIndex(3);
		System.out.print("Your result is : ");
		ilist.printHorizontal();
		System.out.println("The result should be : 9 7 5 2 8");*/

		// ============================ Ex.5 ================================
		// continue on from the previous exercise
		// Uncomment this part of code to test Ex. 5

		/*System.out.println("\n Test search");
		int item = 5;
		System.out.println("search for " + item);
		if (ilist.search(item) != -1)
			System.out.println(item + " is found at index "
					+ ilist.search(item));
		else
			System.out.println(item + " is found at index "
					+ ilist.search(item));
		System.out.print("The result should be :");
		System.out.println(item + " is found at index 2");

		item = 3;
		System.out.println("search for " + item);
		if (ilist.search(item) != -1)
			System.out.println(item + " is found at index "
					+ ilist.search(item));
		else
			System.out.println(item + " is not found");
		System.out.print("The result should be :");
		System.out.println(item + " is not found");*/

	}
}
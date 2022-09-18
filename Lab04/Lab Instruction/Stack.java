class Stack < T > {

    private SList < T > list = new SList < T > ();

    Stack() {}

    void push(T element) {
        //Ex1a
        
    }

    T pop() {
        return null; //Ex1b replace this with your code
        
    }

    T peek() {
        return null; //Ex1c replace this with your code

        
    }

    boolean isEmpty() {
        return list.isEmpty();
    }



    Stack < T > copyStack() {
        Stack < T > rvStack = reverseStack();
        return rvStack.reverseStack();
    }

    void printVertical() {
        list.printVertical();
    }

    
   static void binaryConversion(int x) {

        Stack < Integer > answer = new Stack < Integer > ();
        //Ex2: write your code here
        
        
        answer.printVertical();
    }

     Stack < T > reverseStack() { 
    	    return null; //Ex3 replace this line with your code
       
        
    }
    static boolean isPalindrome(String word) { 
    	//Ex4 : write your code here
        
        return true; //Ex.4 replace this line with your code
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;  
    }

    public static int evalPostfix(String[] input) {
        Stack < Integer > S = new Stack < Integer > ();
        //Ex5 : write your code here
        
        return 0; // replace this line with your code
    }
}
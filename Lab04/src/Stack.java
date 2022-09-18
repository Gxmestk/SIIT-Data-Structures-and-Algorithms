class Stack < T > {

    private SList < T > list = new SList < T > ();

    Stack() {}

    void push(T element) {
        //Ex1a
        list.addFirst(element);
    }

    T pop() {
    	
        return list.removeFirst(); //Ex1b replace this with your code
        
    }

    T peek() {
        return list.first.element; //Ex1c replace this with your code

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
        if (x == 0)
        {
        	answer.push(0);
        }
        while (x > 0)
        {
        	answer.push(x % 2);
            x /= 2;
        }
        answer.printVertical();
    }

     Stack < T > reverseStack() { 
    	 
    	 Node<T> walker = list.first;
    	 Stack<T> rvs = new Stack<T>();
    	 
    	 while (walker != null)
    	 {
    		 rvs.push(walker.element);
    		 walker = walker.next;
    	 }
    	    return rvs; //Ex3 replace this line with your code
    }
    static boolean isPalindrome(String word) { 
    	//Ex4 : write your code here
    	Stack <Character> B = new Stack<Character>();
   	 	Stack <Character> C = new Stack<Character>();
   	 	int	i;
   	 	
   	 	i = 0;
   	 	while (i < word.length())
   	 	{
   	 		B.push(word.charAt(i));
   	 		i++;
   	 	}
	   	 C=B.reverseStack();
	   	 while (!B.isEmpty())
	   	 {
	   		 if (B.pop()!= C.pop())
	   		 {
	   			 return false;
	   		 }
	   	 }
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
        int i;
        
        i = 0;
        while (i < input.length)
        {
        	String x = input[i];
        	if (isInteger(x))
        	{
        		S.push(Integer.parseInt(x));
        	}
        	else if (S.list.size < 2)
        	{
        		return -1; //Error 
        	}
        	else 
        	{
        		int i1 = S.pop();
        		int i2 = S.pop();
        		if (x == "+")
        		{
        			S.push(i2+i1);
        		}
        		else if (x == "-")
        		{
        			S.push(i2-i1);
        		}
        		else if (x == "*")
        		{
        			S.push(i2*i1);
        		}
        		else if (x == "/")
        		{
        			S.push(i2/i1);
        		}
        		else if (x == "%")
        		{
        			S.push(i2%i1);
        		}
        	}
        	i++;
        }
        return S.pop(); // replace this line with your code
    }
}
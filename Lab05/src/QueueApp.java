public class QueueApp {
	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	static String evalPrefixString(String x, String y, String z) {
		
		if (x.equals("+"))
			return "" + (Integer.parseInt(y) + Integer.parseInt(z));
		else if (x.equals("-"))
			return "" + (Integer.parseInt(y) - Integer.parseInt(z));
		else if (x.equals("*"))
			return "" + Integer.parseInt(y) * Integer.parseInt(z);
		else if (x.equals("/"))
			return "" + Integer.parseInt(y) / Integer.parseInt(z);
		else if (x.equals("%"))
			return "" + Integer.parseInt(y) % Integer.parseInt(z);
		else
		{	
			
			return "can't be evaluated";
		}
	}

	static boolean isPrefix(String x, String y, String z) {
		if (!isInteger(x) && isInteger(y) && isInteger(z))
			return true;
		else
			return false;

	}

	public static void checkPrefix(Queue<String> Q,String x,String y,String z)
	{
		System.out.print(x + " " + y + " " + z + "   ");
		
		Node<String> walker = Q.list.first;
		while (walker != null)
		{
			System.out.print(" " + walker.element);
			walker = walker.next;
		}
		System.out.println();
	}
	
	static String prefixEval(String[] input) {
		// Exercise 4
				// Replace the following line with your codes
		Queue<String> Q = new Queue<String>();
		for (int i = 0; i < input.length; i++) {
			Q.enqueue(input[i]);
		}	
		String x = Q.dequeue();
		String y = Q.dequeue();
		String z = null ;
		
		while (!Q.isEmpty())
		{	
			
			z = Q.dequeue();
			//checkPrefix(Q,x,y,z);
			if (isPrefix(x, y, z))
			{			
				if (evalPrefixString(x, y, z) == "can't be evaluated")
					return "can't be evaluated";
				Q.enqueue(evalPrefixString(x, y, z)); 
				x = Q.dequeue();
				y = Q.dequeue();	
			}
			else 
			{
				Q.enqueue(x);
				x = y;
				y = z;
			}
		}
		//checkPrefix(Q,x,y,z);
		return x;
	}
    
    //Exercise 5 
    static void makeRoundRobin(Queue<Integer> Q, Queue<String> P, int limit, int resourceAmt)
  {  
     printRoundRobin(Q, P, resourceAmt);

     while(! Q.isEmpty() && resourceAmt!=0)
     {    int temp =Q.dequeue();
          String name = P.dequeue();
          if( limit<=resourceAmt)
          {  
        	  if(temp > limit)
        	  {  //add your codes here
	        	  Q.enqueue(temp - limit);
	        	  P.enqueue(name); 
	        	  resourceAmt -= limit;
        	  }
        	  else
        	  {
        		  resourceAmt -= temp;
        	  }
        	  
        	  printRoundRobin(Q, P, resourceAmt);
          }
          else
          {  
        	  	if(temp > resourceAmt)
        	  	{   //add your code here
        	  		
        	  		Q.enqueue(temp - resourceAmt);
        	  		P.enqueue(name);
        	  		resourceAmt = 0;
        	  	}
        	  	else
        	  	{
        	  		resourceAmt -= temp;
        	  	}
        	  	printRoundRobin(Q, P, resourceAmt);
          } //end if
     }//end while
     
  }
  static void printRoundRobin(Queue<Integer> Q, Queue<String> N, int remain)
  {   System.out.print(remain +": ");
      for(int i =0; i<Q.list.size; i++)
     { String name = N.dequeue();
       Integer need = Q.dequeue();
       System.out.print(name+"-"+need +" ");
       N.enqueue(name);
       Q.enqueue(need);
     }
     System.out.println();
  }

}
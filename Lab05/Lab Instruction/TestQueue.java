public class TestQueue {
    public static void main(String[] args) {
        // Exercise 1.a  
	/*System.out.println("Testing Queue basic operations");
        System.out.println("After enqueue 0 1 2 3 4 to the queue");
	Queue<Integer> Q = new Queue<Integer>();
	for (int i = 0; i < 5; i++){
            Q.enqueue(i);
	}
	System.out.print("Your Q content is :");
	Q.printHorizontal();
	System.out.println("The result should be: 0 1 2 3 4 ");*/
		
	// Exercise 1.b  
	/*System.out.println("\nAfter dequeue this Q");
	Q.dequeue();
	System.out.print("Your Q content is :");
	Q.printHorizontal();
	System.out.println("The result should be: 1 2 3 4 ");*/

	// Exercise 1.c  
	/*System.out.println("\nTesting queuefront of this Q");
	System.out.println("The front of the Q is: " + Q.queuefront());
	System.out.println("The result should be: 1");
	System.out.println("\ncheck queuerear of this Q");
	System.out.println("The front of the Q is: " + Q.queuerear());
	System.out.println("The result should be: 4");*/
		
	// Exercise 2  
	/*Queue<Integer> Q2 = Q.copyQueue();
	System.out.println("\nTesting copyQueue");
	System.out.print("Your result is: ");
	Q2.printHorizontal();
	System.out.println("The result should be: 1 2 3 4 ");*/
	 
		
	// Exercise 3  
	/*System.out.println("\nTesting isIdentical");
	Q2 = new Queue<Integer>();
	Q2.enqueue(1);
	Q2.enqueue(2);
	Q2.enqueue(3);
	Queue<Integer> Q3 = new Queue<Integer>();
	Q3.enqueue(1);
	Q3.enqueue(2);
	Q3.enqueue(3);
	Q3.enqueue(4);
	System.out.print("Q2: ");
	Q2.printHorizontal();
	System.out.print("Q3: ");
	Q3.printHorizontal();
	boolean result = Q2.isIdentical(Q3);
	System.out.print("Q2 and Q3 are ");
	if(result==true){
            System.out.println("identical.");
	}else{
            System.out.println("not identical.");
	}
	System.out.println("The result should be: Q2 and Q3 is not identical.");
		
		
	System.out.println("\nTesting copyQueue and isIdentical");
	Q2 = new Queue<Integer>();
	Q2.enqueue(1);
	Q2.enqueue(2);
	Q2.enqueue(3);
	System.out.print("Q1: ");
	Q3 = Q2.copyQueue();
	Q2.printHorizontal();
	System.out.print("Q2: ");
	Q3.printHorizontal();
	result = Q2.isIdentical(Q3);
	System.out.print("Q2 and Q3 are ");
        if(result){
            System.out.println("identical.");
	}else{
            System.out.println("not identical.");
	}
	System.out.println("The result should be: Q2 and Q3 is identical.");
		
		
	System.out.println("\nTesting isIdentical");
	System.out.print("Q1: ");
	Q2 = new Queue<Integer>();
	Q2.enqueue(3);
	Q2.enqueue(5);
	Q2.enqueue(6);
	Q3 = new Queue<Integer>();
	Q3.enqueue(3);
	Q3.enqueue(4);
	Q3.enqueue(5);
	Q2.printHorizontal();
	System.out.print("Q2: ");
	Q3.printHorizontal();
	result = Q2.isIdentical(Q3);
	System.out.print("Q2 and Q3 are ");
	if(result==true){
            System.out.println("identical.");
	}else{
            System.out.println("not identical.");
	}
	System.out.println("The result should be: Q1 and Q2 is not identical.");*/
		

	// Exercise 4.a 		
        /*System.out.println("\nTesting isPrefix");
        System.out.println("Expression: + 2 3");
        if (QueueApp.isPrefix("+", "2", "3")==true)
            System.out.println("Your result is + 2 3 is a prefix expression");
        else
            System.out.println("Your result is + 2 3 is not a prefix expression");
        System.out.println("The result should be: + 2 3 is a prefix expression");

	System.out.println("\nExpression: 2 + 3");
        if (QueueApp.isPrefix("2", "+", "3")==true)
            System.out.println("Your result is : 2 + 3 is a prefix expression");
        else
            System.out.println("Your result is : 2 + 3 is not a prefix expression");
	System.out.println("The result should be: 2 + 3 is not a prefix expression");

	System.out.println("\nExpression: 2 3 +");
	if (QueueApp.isPrefix("2", "3", "+")==true)
            System.out.println("Your result is : 2 3 + is a prefix expression");
	else
            System.out.println("Your result is : 2 3 + is not a prefix expression");
	System.out.println("The result should be:2 3 + is not a prefix expression");*/

	// Exercise 4.b 		
        /*System.out.println("\nTesting prefixEval");
	String[] input1 = { "+", "2", "3"};
	System.out.println("Your Result is " + QueueApp.prefixEval(input1));
	System.out.println("The result should be 5");
	System.out.println();

	String[] input2 = { "*", "+", "2", "3", "+", "1", "7" };
	System.out.println("Your Result is " + QueueApp.prefixEval(input2));
	System.out.println("The result should be 40");
	System.out.println();

	String[] input3 = { "/", "+", "-", "3", "1", "2", "4" };
	System.out.println("Your result is " + QueueApp.prefixEval(input3));
	System.out.println("The result should be 1"); 
*/

//Exercise 5
/*  Queue<Integer> RRB = new Queue<Integer>();
     RRB.enqueue(6);
     RRB.enqueue(12);
     RRB.enqueue(4);
     RRB.enqueue(5);
     RRB.enqueue(7);
     RRB.enqueue(9);
     Queue<String> P = new Queue<String>();
     P.enqueue("P1");
     P.enqueue("P2");
     P.enqueue("P3");
     P.enqueue("P4");
     P.enqueue("P5");
     P.enqueue("P6");
     int amount = 40;
     int quota = 3;
     System.out.println("Your result is ");
     QueueApp.makeRoundRobin(RRB, P, quota, amount );
     
     System.out.println("The correct result should be ");
     System.out.println(
    "40: P1-6 P2-12 P3-4 P4-5 P5-7 P6-9 \n" +
    "37: P2-12 P3-4 P4-5 P5-7 P6-9 P1-3 \n" +
    "34: P3-4 P4-5 P5-7 P6-9 P1-3 P2-9 \n" +
    "31: P4-5 P5-7 P6-9 P1-3 P2-9 P3-1 \n" +
    "28: P5-7 P6-9 P1-3 P2-9 P3-1 P4-2 \n" +
    "25: P6-9 P1-3 P2-9 P3-1 P4-2 P5-4 \n" +
    "22: P1-3 P2-9 P3-1 P4-2 P5-4 P6-6 \n" +
    "19: P2-9 P3-1 P4-2 P5-4 P6-6 \n" +
    "16: P3-1 P4-2 P5-4 P6-6 P2-6 \n" +
    "15: P4-2 P5-4 P6-6 P2-6 \n" +
    "13: P5-4 P6-6 P2-6 \n" +
    "10: P6-6 P2-6 P5-1 \n" +
    "7: P2-6 P5-1 P6-3 \n" +
    "4: P5-1 P6-3 P2-3 \n" +
    "3: P6-3 P2-3 \n" +
    "0: P2-3 ");  

*/
 }
 

}
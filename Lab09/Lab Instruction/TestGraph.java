public class TestGraph {

    public static void main(String[] args) {
        Graph<String> G = new Graph<String>();

        // Exercise 1 (Testing insertVertex)
       
        System.out.println("Testing insertVertex()");
        G.insertVertex("A");
        G.insertVertex("B");
        G.insertVertex("C");
        G.insertVertex("D");
        G.insertVertex("E");
        G.print();

        System.out.println("The correct answer is\nA  \nB  \nC \nD \nE \nThe graph consists of 5 vertices and 0 edges.\n");
       
         
        // Exercise 2 and 3 (Testing insertEdge)
        /*System.out.println("Testing insertEdge()"); 
        G.insertEdge("A","B",1);
        G.insertEdge("A","C",3);
        G.insertEdge("A","D",8);
        G.insertEdge("A","E",7);
        G.insertEdge("D","C",6);
        G.insertEdge("E","A",2);
        G.insertEdge("D", "A",1);
        G.insertEdge("B","C",5);
        G.insertEdge("B","A",4);
        G.insertEdge("B","D",9);
        G.print();

        System.out.println("The correct answer is ");
         System.out.println("A-->E,7-->D,8-->C,3-->B,1\nB-->D,9-->A,4-->C,5\nC\nD-->A,1-->C,6\nE-->A,2\nThe graph consists of 5 vertices and 10 edges.");*/
              
       // Exercise 4 (Testing DeleteEdge)
        /*System.out.println("\nTesting delete edge AE");
        G.deleteEdge("A","E");
        G.print();
        System.out.println("The correct answer is ");
        System.out.println("A-->D,8-->C,3-->B,1\nB-->D,9-->A,4-->C,5\nC\nD-->A,1-->C,6\nE-->A,2\nThe graph consists of 5 vertices and 9 edges."); 
        
        System.out.println("\nTesting delete edge DC");
        G.deleteEdge("D","C");
        G.print();
        System.out.println("The correct answer is ");
        System.out.println("A-->D,8-->C,3-->B,1\nB-->D,9-->A,4-->C,5\nC\nD-->A,1\nE-->A,2\nThe graph consists of 5 vertices and 8 edges.");
        
        System.out.println("\nTesting delete edge AC");
        G.deleteEdge("A","C");
        G.print();
        System.out.println("The correct answer is ");
        System.out.println("A-->D,8-->B,1\nB-->D,9-->A,4-->C,5\nC\nD-->A,1\nE-->A,2\nThe graph consists of 5 vertices and 7 edges.");*/
        
        
        // Exercise 5 (Testing delete vertex)
        /*System.out.println("\nTesting delete vertex E");
        G.deleteVertex("E" );
        G.print();
        System.out.println("The correct answer is ");
        System.out.println("A-->D,8-->B,1\nB-->D,9-->A,4-->C,5\nC\nD-->A,1\nThe graph consists of 4 vertices and 6 edges.");
        
        System.out.println("\nTesting delete vertex B");
        G.deleteVertex("B" );
        G.print();
        System.out.println("The correct answer is ");
        System.out.println("A-->D,8\nC\nD-->A,1\nThe graph consists of 3 vertices and 2 edges.");
        
        System.out.println("\nTesting delete vertex A");
        G.deleteVertex("A" );
        G.print();
        System.out.println("The correct answer is ");
        System.out.println("C\nD\nThe graph consists of 2 vertices and 0 edges.");*/
 
    }

}
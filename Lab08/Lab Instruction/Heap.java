public class Heap {
    int load=0;
    int [] hArray = new int[100]; 

    Heap() { }
    // Exercise 1 a)  
    void reheapUp(int currentIndex) {
       //  add your code here 
    }
        
    // Exercise  2 b) 
    void insert(int data) {
    //add your code here
 
        
    }
    
    // Exercise  3  
    void reheapDown(int currentIndex) {
    // add your code here 

	 
    }
    // Exercise  4  delete the root and return the value of the deleted root 
    int deleteRoot() {
       
        return -1;  // replace this line with your code  
    }
 

    void makeHeapSort() {
	// add your code here 
        
	}
    
    //swap in the array A the values at ind1 and ind2
    void swap(int [] A, int ind1, int ind2) {
	int temp = A[ind1];
	A[ind1] = A[ind2];
	A[ind2] = temp;
    }
        
    //print the heap Array
    void printHeapArray() {
	for (int i = 0; i < load; i++)
	    System.out.print(hArray[i] + " ");
	    System.out.println();
	}
    
    
    int findLevel(int nodeindex) {
	int parent = (nodeindex - 1) / 2;
	int level = 0;

	if (parent > 0)
	    level++;

	while (parent > 0) {
	    parent = (parent - 1) / 2;
	    level++;
	}
	return level;
	}
   
}

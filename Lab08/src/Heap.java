public class Heap {
    int load=0;
    int [] hArray = new int[100]; 

    Heap() { }
    // Exercise 1 a)  
    void reheapUp(int currentIndex) 
    {
       //  add your code here 
    	int ParentIndex = (currentIndex - 1) / 2;
    		
		if (hArray[currentIndex] > hArray[ParentIndex])
		{
			swap(hArray, currentIndex, ParentIndex);
		    reheapUp(ParentIndex);
		}
    }
        
    // Exercise  2 b) 
    void insert(int data) 
    {
    //add your code here
    	hArray[load] = data;
    	reheapUp(load);
    	load++;
    }
    
    // Exercise  3  
    void reheapDown(int ParentIndex) {
    // add your code here 
    	int ChildLeft = 2 * ParentIndex + 1;
    	int ChildRight = 2 * ParentIndex + 2;
   
    	if (ChildLeft >= load || ChildRight >= load)
    		return ;
    	if (hArray[ChildRight] > hArray[ChildLeft])
    	{
    		if (hArray[ParentIndex] < hArray[ChildRight])
    		{
    			swap(hArray, ParentIndex, ChildRight);
    			reheapDown(ChildRight);
    		}
    	}
    	else
    	{
    		if (hArray[ParentIndex] < hArray[ChildLeft])
    		{
    			swap(hArray, ParentIndex, ChildLeft);
    			reheapDown(ChildLeft);
    		}
    	}
   	}

    // Exercise  4  delete the root and return the value of the deleted root 
    int deleteRoot() 
    {
         // replace this line with your code
    	int tmp = hArray[0];
    	hArray[0] = hArray[load - 1];
    	hArray[load - 1] = 0;
    	load--;
    	reheapDown(0);
    	return tmp;
    }
 

    void makeHeapSort() 
    {
	// add your code here 
    	while (load != 0)
    	{
    		System.out.print(deleteRoot() + " ");
    	}
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
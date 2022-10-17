public class BT<T> {

	int size;
	BTNode<T> root = null;

	BT() {
		root = null;
		size = 0;
	}

	BT(T data) {
		this(new BTNode<T>(data));
	}

	BT(BTNode<T> root) {
		this.root = root;
		size = 1;
	}

	BT(BTNode<T> root, BT<T> Lsubtree, BT<T> Rsubtree) {
		this.root = root;
		root.left = Lsubtree.root;
		root.right = Rsubtree.root;
		size = Lsubtree.size + Rsubtree.size + 1;
	}

	int findHeight() {
		return findHeight(root);
	}

	int findHeight(BTNode<T> root) {
		if (root == null)
			return 0;	
		return 1 + Math.max(findHeight(root.left),findHeight(root.right));
	}

	boolean isLeaf(BTNode<T> root) {
	 if (root != null && root.left == null && 
           root.right == null) {
			return true;
		} else {
			return false;
		}
	}

	boolean isBalanced() {
		return isBalanced(root);
	}

	boolean isBalanced(BTNode<T> root) {
		if (root == null) {
			return true;
		}
		int LH = findHeight(root.left);
		int RH = findHeight(root.right);
		int B = Math.abs(LH - RH);
		if (B <= 1) {
			return (isBalanced(root.left) && isBalanced(root.right));
		} else {
			return false;
		}
	}

	/* Inorder traversal from the root */
	public void inorder() {
		inorder(root);
	}

	/* Inorder traversal from a subtree */
	protected void inorder(BTNode<T> root) {
		// Exercise 2 (a) Complete this method
		if (root == null)
			return ;
		inorder(root.left);
		System.out.print(root.element + " ");
		inorder(root.right);
	}

	/* Postorder traversal from the root */
	public void postorder() {
		postorder(root);
	}

	/* Postorder traversal from a subtree */
	protected void postorder(BTNode<T> root) {
		// Exercise 2 (b) Complete this method
		if (root == null)
			return ;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.element + " ");
	}

	/* Preorder traversal from the root */
	public void preorder() {
		preorder(root);
	}

	/* Preorder traversal from a subtree */
	protected void preorder(BTNode<T> root) {
	    if (root != null) {
	       if (isLeaf(root)) {
		     System.out.print(root.element + " ");
	        } else {
		     System.out.print(root.element + " ");
		     preorder(root.left);
		     preorder(root.right);
	       }
	    }
	}

	void PrintDFT() {
		Stack<BTNode<T>> S = new Stack<BTNode<T>>();
		BTNode<T> curr = null;

		S.push(root);
		while (!S.isEmpty())
		{
			curr = S.pop();
			System.out.print(curr.element + " ");
			if (curr.getRight() != null)
				S.push(curr.getRight());
			if (curr.getLeft() != null)
				S.push(curr.getLeft());
		}
	}

	void PrintBFT() {
		Queue<BTNode<T>> Q = new Queue<BTNode<T>>();
		BTNode<T> curr = null;

		Q.enqueue(root);
		while (!Q.isEmpty())
		{
			curr = Q.dequeue();
			System.out.print(curr.element + " ");
			if (curr.getLeft() != null)
				Q.enqueue(curr.getLeft());
			if (curr.getRight() != null)
				Q.enqueue(curr.getRight());
		}
	}

	static boolean hasHigherPriority(String sign1, String sign2) {
		if (sign2.equals("("))
			return true;
		else if (sign1.equals("*") && sign2.equals("+"))
			return true;
		else if (sign1.equals("*") && sign2.equals("-"))
			return true;
		else if (sign1.equals("/") && sign2.equals("+"))
			return true;
		else if (sign1.equals("/") && sign2.equals("-"))
			return true;
		else if (sign1.equals("%") && sign2.equals("+"))
			return true;
		else if (sign1.equals("%") && sign2.equals("-"))
			return true;
		else
			return false;

	}

public static boolean isOperator(String item)
{ if (item.equals("+") || item.equals("-") || item.equals("*") || item.equals("/") || item.equals("%"))

     return true;
  else
     return false;

}
 
    public static BT<String> makeExpressionTree(String [] infixArr)
    {   Stack<BT<String>> BTStack = new Stack<BT<String>>();
        Stack<BTNode<String>> opt = new Stack<BTNode<String>>(); //for keeping opt nodes
        String item;
        int i=0;
        while(i!=infixArr.length)
        { 
        	item = infixArr[i]; //read item from array 
	  // Case 1: if item it is an open opthesis
        	if (item.equals("(")) 
        	{
            //add your code here
        		BTNode<String> tmp = new BTNode<String>(item);
        		opt.push(tmp);
        	} 
        // Case 2: if item is an operator
        	else if (isOperator(item))
        	{
        		BTNode<String> tmp = new BTNode<String>(item);
	            if (opt.isEmpty()) // stack is empty
	            {
	            	// add your code here
	            	opt.push(tmp);
	            }
	            else // stack is not empty
	            {  
	            	if(hasHigherPriority(item, opt.peek().element))
	            	{
	            		opt.push(tmp);
	            	}
	            	else 
	            	{
		        		BT<String> R = BTStack.pop();
		        		BT<String> L = BTStack.pop();
		        		BTStack.push(new BT<String>(opt.pop(), L, R));
		        		opt.push(tmp);
	            	}
	            }
        	}
       // Case3: if item is a close opthesis  
        	else if (item.equals(")")) 
        	{
        		while (opt.peek().element.equals("(") == false) 
        		{
	        		BT<String> R = BTStack.pop();
	        		BT<String> L = BTStack.pop();
	        		BTStack.push(new BT<String>(opt.pop(), L, R));
        		}
        		opt.pop();
        	} 
        	else // Case 4: it is not an operator
        	{
           // add your code here
        		BTStack.push(new BT<String>(item));
        	}
        	i++;
        }
        while (!opt.isEmpty()) 
        {
			 BT<String> R = BTStack.pop();
			 BT<String> L = BTStack.pop();
			 BTStack.push(new BT<String>(opt.pop(), L, R));
        }
        return BTStack.pop();
    }
}
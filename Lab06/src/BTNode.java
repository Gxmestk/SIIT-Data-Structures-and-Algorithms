public class BTNode<T>
{
	T element;
	BTNode<T> left = null;
	BTNode<T> right = null;
	String data;

	public BTNode(T e)
	{
		element = e;
	}
	
	public BTNode(String data, BTNode<T> left, BTNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
        
    }
 
    public String getData() {
        return this.data;
    }
 
    public BTNode<T> getLeft() {
        return this.left;
    }
 
    public BTNode<T> getRight() {
        return this.right;
    }
}
package binarytree;



public class BinaryTree<T extends Comparable<T>> 
{
	
	 Node<T> root;

	 
	    public void insert(T data) {
	        root = insertRec(root, data);
	    }

	    private Node<T> insertRec(Node<T> root, T data) {
	        if (root == null) {
	            root = new Node<T>(data);
	            return root;
	        }
	     


	        if (data.compareTo(root.data)<0) {
	        	root.left = insertRec(root.left, data);
	        }
	            
	        else if (data.compareTo(root.data) > 0)
	            root.right = insertRec(root.right, data);

	        return root;
	    }
	   public void inOrder() {
	    	inOrder( root);
	    }
	 void inOrder(Node<T> root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.println(root.data +" ");
			inOrder(root.right);
		}
	}
	 public void preOrder() {
	    	preOrder( root);
	    }
	 void preOrder(Node<T> root) {
		if(root!=null) {
			System.out.println(root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	 public void postOrder() {
	    	postOrder(root);
	    }
	 void postOrder(Node<T> root) {
		if(root!=null) {
			
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.data);
		}
	}
	
	 
	

}

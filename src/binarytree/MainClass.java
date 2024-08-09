package binarytree;

public class MainClass {

	public static void main(String[] args) {
		BinaryTree t =new BinaryTree();
		
		t.insert(20);
		t.insert(30);
		t.insert(-10);
		t.insert(60);
		t.insert(-20);
		t.insert(50);
		t.insert(50);
		System.out.println("traverse the tree using InOrder");
		t.inOrder();
		System.out.println("traverse the tree using PreOrder");
		t.preOrder();
		System.out.println("traverse the tree using PostOrder");
		t.postOrder();
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	Node roo=null;
//	roo=new Node(10);
//	roo.lef=new Node(20);
//	roo.righ=new Node(30);
//	roo.lef.lef=new Node(40);
//	roo.righ.lef=new Node(50);
//	roo.righ.righ=new Node(60);
}

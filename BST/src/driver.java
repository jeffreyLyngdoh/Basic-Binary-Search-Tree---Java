
public class driver {

	public static void main(String[] args) {
			
		System.out.println("Testing out Binary Search Tree");
		
		BinaryST tree = new BinaryST(34);
		
			tree.insert(4);
			tree.insert(1);
	    	tree.insert(5);
	        tree.insert(9);
	        tree.insert(0);
	        tree.insert(11);
	        tree.insert(8);
	        tree.insert(12);
	        tree.insert(22);
	        tree.insert(6);
	        tree.insert(7);

	        
	        System.out.println(tree.largest());
	        System.out.println(tree.smallest());

	        
	        tree.inOrder();
	        System.out.println("");

	        
	        tree.removeEntry(4);
	        tree.removeEntry(11);
	        tree.removeEntry(0);
	        tree.removeEntry(34);
	        tree.removeEntry(823);


	        tree.inOrder();

	}

}

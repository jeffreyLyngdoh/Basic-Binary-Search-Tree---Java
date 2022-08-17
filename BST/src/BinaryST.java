
public class BinaryST {
	
	
	Node head;
	
	class Node
	{
		int data;
		Node left;
		Node right;
		
		public Node(int value)
		{
			data = value;
			left = null;
			right = null;
		}
		
		
	}
	
	public BinaryST()
	{
		head = null;
	}
	
	public BinaryST(int value)
	{
		head = new Node(value);
	}
	
	void insert(int value)
    {
        head = insertNode(head, value);
    }

    Node insertNode(Node curr, int value)
    {
        if (curr == null)
        {
            Node node = new Node(value);
            return node;
        }
        else if (curr.data < value)
        {
        	curr.right = insertNode(curr.right, value);
        }
        else if (curr.data > value)
        {
        	curr.left = insertNode(curr.left, value);
        }


       
        return curr;
    }
  
    
    
    
    int largest()
    {
        return findLargest(head).data;
    }
    
    int smallest()
    {
    	return findSmallest(head).data;
    }
    
    Node findLargest(Node entry)
    {
        Node curr = entry;
        Node prev = null;

        while (curr != null)
        {
            prev = curr;
            curr = curr.right;
        }

        return prev;
        
    }
    
    
    Node findSmallest(Node entry)
    {
    	 Node curr = entry;
         Node prev = null;

         while (curr != null)
         {
             prev = curr;
             curr = curr.left;
         }

         return prev;
    }
    
    
    
    void removeEntry(int value)
    {

    	remove(head,value);
    }
    
    
    Node remove(Node curr, int value)
    {
    	if (curr != null)
    	{
    		if (curr.data < value)
    		{
    			curr.right = remove(curr.right, value);
    		}
    		else if (curr.data > value)
    		{
    			curr.left = remove(curr.left, value);
    		}
    		else
    		{
    			if(curr.right != null)
    			{
    				curr.data = findSmallest(curr.right).data;
    				
    				curr.right = remove(curr.right, curr.data);
    				
    			}
    			else if (curr.left != null)
    			{
    				curr.data = findLargest(curr.left).data;
    				
    				curr.left = remove(curr.left, curr.data);
    				
    			}
    			else 
    			{
    				curr = null;
    			}
    			
    		}
    		
    		
    	}
    		
    	return curr;
    }
    	
   
    
    
    void inOrder()
    {
        inorderPrint(head);
    }

    void inorderPrint(Node curr)
    {
        if (curr != null)
        {
            inorderPrint(curr.left);
            System.out.print(curr.data + " ");
            inorderPrint(curr.right);

        }
        
    }
	
	
	
	
}

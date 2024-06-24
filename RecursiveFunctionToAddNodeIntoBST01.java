
public class RecursiveFunctionToAddNodeIntoBST {

	class Node{
		int val;
		Node left,right;
		
		public Node(int item) {
			val = item;
			left=right=null;
		}
	}
	
	public class BinarySearchTree {
		Node root;
		public BinarySearchTree()
		{
			root=null;
		}
		
		void insert(int key) {
			root = insertRec(root,key);
		}
	
	
	//Recursive Function to insert a new key in BST
	Node insertRec(Node root,int key) {
		if(root==null) {
			root= new Node(key);
			return root;
		}
		
		if(key<root.val) {
			root.left=insertRec(root.left, key);
		}else if(key>root.val) {
			root.right=insertRec(root.right, key);
		}
		return root;
	}
	
	void inorder()
	{
		inorderRec(root);
	}
	}
	
	/// Driver method
	void inorderRec(Node root) {
		if(root!=null) {
			inorderRec(root.left);
			System.out.println(root.val+" ");
			inorderRec(root.right);
		}
	}
	
	
	
	public static void main(String[] args) {
		
		RecursiveFunctionToAddNodeIntoBST outer = new RecursiveFunctionToAddNodeIntoBST();
		BinarySearchTree tree = outer.new BinarySearchTree();
				
		tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // print inorder traversal of the BST
        tree.inorder();
	}

}

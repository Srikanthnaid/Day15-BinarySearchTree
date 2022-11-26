package binarySearch;

public class BinaryTree {

	// created new node
	public Node createNewNode(int k) {
		Node bst = new Node();
		bst.data = k;
		bst.left = null;
		bst.right = null;
		return bst;
	}

	// insert data to node
	public Node insert(Node root, int val) {

		if (root == null) {// 56 == null condition get false
			return createNewNode(val);// it will go to node create method and create new node with data 56.

		}
		if (val < root.data) { // 30<56 condition is true.
			root.left = insert(root.left, val);//// 30 will come left side to root node

		} else if (val > root.data) {// 70>56 condition is true
			root.right = insert(root.right, val);// 70 will goes to right of root node.
		}
		return root;
	}

	/** In-Order traversal :- root , left , right **/
	public void print(Node root) {
		if (root == null) {
			return;
		}

		print(root.left);
		System.out.println(root.data + " ");
		print(root.right);

	}


	public static void main(String[] args) {
		System.out.println("welcome to BTS program");
		BinaryTree bst = new BinaryTree();
		Node root = null;
		root = bst.insert(root, 56);
		root = bst.insert(root, 30);
		root = bst.insert(root, 70);
		root = bst.insert(root, 22);
		root = bst.insert(root, 40);
		root = bst.insert(root, 60);
		root = bst.insert(root, 95);
		root = bst.insert(root, 11);
		root = bst.insert(root, 65);
		root = bst.insert(root, 3);
		root = bst.insert(root, 6);
		root = bst.insert(root, 16);
		root = bst.insert(root, 63);
		root = bst.insert(root, 67);
		bst.print(root);

	}

}
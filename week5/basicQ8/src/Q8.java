
public class Q8 {

	public static void main(String [] args) {
		BSTree tree = new BSTree();

		tree.insert(2);tree.insert(7);tree.insert(9);tree.insert(4);tree.insert(1);
		tree.insert(5);tree.insert(3);tree.insert(6);tree.insert(0);tree.insert(8);

		System.out.println("BST - size: " + tree.size() + " height: " + tree.height());
		tree.inorder();


	}

}
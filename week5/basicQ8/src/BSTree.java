

class BNode {
	int data;
	BNode left;
	BNode right;

	public BNode(int d) {
		data = d;
		left = right = null;
	}
	public int getData() {
		return data;
	}
} // class BNode

public class BSTree {
	private BNode root;

	public BSTree() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public BNode search(BNode t, int x) {
		if (t == null)
			return null;
		if (x < t.data)
			return search(t.left, x);
		else if (x > t.data)
				return search(t.right, x);
			 else
				return t;
	}

	public void insert(int d) {
		root = insertSubtree(root, d);
	}

	private BNode insertSubtree(BNode t, int d) {
		if (t == null)
			t = new BNode(d);
		else if (d < t.data)
			t.left = insertSubtree(t.left, d);
		else if (d > t.data)
			t.right = insertSubtree(t.right, d);
		return t;
	}

	private void visit(BNode t) {

		System.out.print(t.data + " ");
	}

	public void preorder() {
		preorderSubtree(root);
		System.out.println();
	}

	private void preorderSubtree(BNode t) {
		if (t == null) return;
		visit(t);
		preorderSubtree(t.left);
		preorderSubtree(t.right);
	}

	public void inorder() {
		inorderSubtree(root);
		System.out.println();
	}

	private void inorderSubtree(BNode t) {
		if (t == null) return;
		inorderSubtree(t.left);
		visit(t);
		inorderSubtree(t.right);
	}

	public void postorder() {
		postorderSubtree(root);
		System.out.println();
	}

	private void postorderSubtree(BNode t) {
		if (t == null) return;
		postorderSubtree(t.left);
		postorderSubtree(t.right);
		visit(t);
	}

	private BNode findMin(BNode t) {
		if (t == null)
			return null;
		else if (t.left == null)
				return t;
			 else
				return findMin(t.left);
	}

	public void delete(int x) {
		root = deleteSubtree(root, x);
	}

	private BNode deleteSubtree(BNode t, int x) {
		BNode temp, child;

		if (t == null) return null;
		if (x < t.data)
			t.left = deleteSubtree(t.left, x);
		else if (x > t.data)
			t.right = deleteSubtree(t.right, x);
		else if (t.left != null && t.right != null) {
			/* has 2 leaves */
			t.data = findMin(t.right).data;
			t.right = deleteSubtree(t.right, t.data);
		}
		else
			t = (t.left != null) ? t.left : t.right;

		return t;
	}

	public int size() {
		return sizeSubtree(root);
	}

	private int sizeSubtree(BNode t) {
		if (t == null) return 0;
		return sizeSubtree(t.left) + sizeSubtree(t.right) + 1;
	}

	public int height() {
		return heightSubtree(root);
	}

	private int heightSubtree(BNode t) {
		if (t == null) return -1;
		int h = heightSubtree(t.left);
		int k = heightSubtree(t.right);
		return h > k ? h + 1 : k + 1;
	}

} // class BSTree
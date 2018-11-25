
public class Q10 {

    public static void main(String[] args) {
        int data = 0;
        BSTree tree = new BSTree();

        for (int k = 1; k <= 10; k++) {
            data = (int) (Math.random() * 100);
            System.out.print(data + " ");
            tree.insert(data);
        }
        System.out.println();

        System.out.println("BST - size: " + tree.size() + " height: " + tree.height());
        tree.inorder();

        if (!tree.isEmpty()) {
            System.out.println("Deleteing the last inserted: " + data);
            tree.delete(data); // delete the last inserted
        }

        System.out.println("BST - size: " + tree.size() + " height: " + tree.height());
        tree.inorder();
    }

}

public class TestLinkedList {
	public static void main (String args[]) {
		LinkedList s = new LinkedList();
		System.out.println(s);
		s.addToTail (new Integer(40));
		System.out.println(s);
		s.addToTail (new Character('n'));
		System.out.println(s);
		s.addToTail (new String("hello"));
		System.out.println(s);
		while (!s.isEmpty()) {
			System.out.println("removed:" + s.removeFromHead());
			System.out.println(s);
		}
		s.addToHead (new Integer(40));
		System.out.println(s);
		s.addToHead (new Character('n'));
		System.out.println(s);
		s.addToHead (new String("hello"));
		System.out.println(s);
		while (!s.isEmpty()) {
			System.out.println("removed:" + s.removeFromTail());
			System.out.println(s);
		}
	}
}
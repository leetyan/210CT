class ListNode {

	private Object data;
	private ListNode next;

	public ListNode(Object o) { data = o; next = null; }
	public ListNode(Object o, ListNode nextNode)
		{ data = o; next = nextNode; }

	public Object getData() { return data; }
	public void setData(Object o) { data = o; }

	public ListNode getNext() { return next; }
	public void setNext(ListNode next) { this.next = next; }

}

class EmptyListException extends RuntimeException {
	public EmptyListException ()
		{ super("List is empty"); }
}

public class LinkedList {

	private ListNode head;
	private ListNode tail;

	private int length;

	public LinkedList() {
		head = tail = null;
		length = 0;
	}

	public boolean isEmpty() { return head == null; }

	public void addToHead(Object item) {
		if (isEmpty())
			head = tail = new ListNode(item);
		else
			head = new ListNode(item, head);
		length++;
	}

	public void addToTail(Object item) {
		if (isEmpty())
			head = tail = new ListNode(item);
		else {
			tail.setNext(new ListNode(item));
			tail = tail.getNext();
		}
		length++;
	}

	public Object removeFromHead() throws EmptyListException {
		Object item = null;
		if (isEmpty())
			throw new EmptyListException();
		item = head.getData();
		if (head == tail)
			head = tail = null;
		else
			head = head.getNext();
		length--;
		return item;
	}

	public Object removeFromTail() throws EmptyListException {
		Object item = null;
		if (isEmpty())
			throw new EmptyListException();
		item = tail.getData();
		if (head == tail)
			head = tail = null;
		else {
			ListNode current = head;
			while (current.getNext() != tail)
				current = current.getNext();
			tail = current;
			current.setNext(null);
		}
		length--;
		return item;
	}

	public String toString() {
		String str = "[ ";
		ListNode current = head;
		while (current != null) {
			str = str + current.getData() + " ";
			current = current.getNext();
		}
		return str + " ]";
	}

	public int count() {
		return length;
	}

	public Object remove(int n) {
		Object item = null;
		if (n <= length) {
			if (n == 1) return removeFromHead();
			if (n == length) return removeFromTail();
			ListNode current = head;
			ListNode previous = null;
			for (int i = 1; i < n; i++) {
				previous = current;
				current = current.getNext();
			}
			item = current.getData();
			previous.setNext(current.getNext());
		}
		length--;
		return item;
	}

	public void add(int n, Object item) {
		if (n == 1) {
			addToHead(item);
			return;
		}
		if (n > length) {
			addToTail(item);
			return;
		}
		ListNode current = head;
		for (int i = 1; i < n-1; i++)
			current = current.getNext();
		current.setNext(new ListNode(item, current.getNext()));
		length++;
	}

	public Object get(int n) {
		if (length < n) return null;
		ListNode current = head;
		for (int i = 1; i < n; i++)
			current = current.getNext();
		return current.getData();
	}

}

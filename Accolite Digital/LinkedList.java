public class LinkedList {

	static ListNode node;

	public static void main(String args[]) {

		LinkedList node1 = new LinkedList();
		node1.push(7); // [7]
		node1.push(8); // [8] -> [7]
		node1.push(1); // [1] ->  [8] -> [7]
		node1.push(2); // [2] -> [1] -> [8] -> [7]
		node1.push(3); // [3] -> [2] -> [1] ->  [8] -> [7]
		
		System.out.println("Middle Node: "+ node1.middleNode(node).val);
		
	}

	public ListNode middleNode(ListNode head) {
		int count = 0;
		ListNode tempNode = head;
		while (tempNode != null) {
			count++;
			tempNode = tempNode.next;
		}
		int temp = (count / 2);
		tempNode = head;

		while (temp > 0) {
			tempNode = tempNode.next;
			temp--;
		}
		return tempNode;
	}

	public void push(int newData) {
		ListNode newNode = new ListNode(newData);
		newNode.next = node;
		this.node = newNode;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
			next = null;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}

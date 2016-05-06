package 判断一个链表是否有环;

public class Solution {

	public boolean isLoop(Node head){
		Node fast = head;
		Node slow = head;
		if (fast == null) {
			return false;
		}
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow){
				return true;
			}
		}
		return !(fast == null || fast.next == null);
	}
}

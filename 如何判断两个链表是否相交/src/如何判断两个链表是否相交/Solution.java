package 如何判断两个链表是否相交;

public class Solution {

	public boolean isIntersect(Node h1,Node h2){
		if(h1 == null || h2 == null){
			return false;
		}
		Node tail1 = h1;
		while (tail1.next != null) {
			tail1 = tail1.next;
		}
		Node tail2 = h2;
		while (tail2.next != null) {
			tail2 = tail2.next;
		}
		return tail1 == tail2;
	}
}

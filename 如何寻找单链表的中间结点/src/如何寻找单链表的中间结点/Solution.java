package 如何寻找单链表的中间结点;

public class Solution {

	public Node SearchMid(Node head){
		Node p = head;
		Node q = head;
		while (p != null && p.next != null && p.next.next != null) {
			p = p.next.next;
			q = q.next;
		}
		return q;
	}
}

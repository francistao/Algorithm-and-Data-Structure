package 单链表的倒数第k个元素;

public class Solution {

	public Node findElem(Node head,int k){
		if(k<1 || head == null)
		{
			return null;
		}
		Node p1 = head;
		Node p2 = head;
		for (int i = 0; i < k - 1; i++) { //前移k-1步
			if(p1.next != null){
				p1 = p1.next;
			}else {
				return null;
			}
			
		}
		while (p1 != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
	}
}

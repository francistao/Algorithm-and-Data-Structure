package 从链表中删除重复的元素;

public class Solution2 {

	
	public void deleteDuplecate(Node head){
		Node p = head;
		while (p!=null) {
			Node q = p;
			while (q.next != null) {
				if(p.data == q.next.data){
					q.next = q.next.next;
				}else {
					q = q.next;
				}
			}
		}
		p = p.next;
	}
}

/**
 * 两种方式实现单链表的反转
 * @author dream
 *
 */
public class ReverseSingleList {

	/**
	 * 递归，在反转当前结点之前先反转后续结点
	 * @param node
	 * @return
	 */
	public static Node reverse(Node head){
		if(head == null || head.getNextNode() == null){
			return head;
		}
		Node reversedHead = reverse(head.getNextNode());
		head.getNextNode().setNextNode(head);
		head.setNextNode(null);
		return reversedHead;
	}
	
	/**
	 * 遍历，将当前结点的下一个结点缓存后更改当前结点
	 */
	public static Node reverse2(Node head){
		if(head == null){
			return head;
		}
		Node pre = head;
		Node cur = head.getNextNode();
		Node next;
		while (cur != null) {
			next = cur.getNextNode();
			cur.setNextNode(pre);
			pre = cur;
			cur = next;
		}
		//将原链表的头结点的下一个结点置为null，再将反转后的头结点赋给head
		head.setNextNode(null);
		head = pre;
		return head;
	}
}

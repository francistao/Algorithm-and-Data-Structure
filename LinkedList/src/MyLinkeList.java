/**
 * 链表的基本操作
 * @author dream
 *
 */
public class MyLinkeList {

	Node head = null;   //链表头的引用
	
	/**
	 * 向链表中插入数据
	 * @param d：插入数据的内容
	 */
	public void addNode(int d){
		Node newNode = new Node(d); 
		if(head == null){
			head = newNode;
			return;
		}
		Node tmp = head;
		while (tmp.next != null) {
			tmp = tmp.next;
		}
		//add node to end
		tmp.next = newNode;
	}
	
	/**
	 * 
	 * @param index:删除第index个结点
	 * @return：成功返回true，失败返回false
	 */
	public Boolean deleteNode(int index){
		if(index < 1 || index > length()){
			return false;
		}
		//删除链表第一个元素
		if(index == 1){
			head = head.next;
			return true;
		}
		int i = 1;
		Node preNode = head;
		Node curNode = preNode.next;
		while (curNode != null) {
			if(i == index){
				preNode.next = curNode.next;
				return true;
			}
			preNode = curNode;
			curNode = preNode.next;
			i++;
		}
		return true;
	}

	
	/**
	 * 
	 * @return 返回结点的长度
	 */
	public int length(){
		int length = 0;
		Node tmp = head;
		while (tmp != null) {
			length++;
			tmp = tmp.next;
		}
		return length;
	}
	
	/**
	 * 对链表进行排序
	 * @return  返回排序后的头结点
	 */
	public Node orderList(){
		Node nextNode = null;
		int temp = 0;
		Node curNode = head;
		while (curNode.next != null) {
			nextNode = curNode.next;
			while (nextNode != null) {
				if(curNode.data > nextNode.data){
					temp = curNode.data;
					curNode.data = nextNode.data;
					nextNode.data = temp;
				}
				nextNode = nextNode.next;
			}
			curNode = curNode.next;
		}
		return head;
	}
	
	/**
	 * 打印结点值
	 */
	public void printList(){
		Node tmp = head;
		while (tmp != null) {
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
	}
	
	
	public static void main(String[] args) {
		MyLinkeList list = new MyLinkeList();
		list.addNode(5);
		list.addNode(3);
		list.addNode(1);
		list.addNode(3);
		System.out.println("listLen=" + list.length());
		System.out.println("before order:");
		list.printList();
		list.orderList();
		System.out.println("after order:");
		list.printList();
	}
}

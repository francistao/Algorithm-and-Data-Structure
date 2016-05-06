package 在不知道头指针的情况下删除指定结点;

public class Solution {

	public boolean deleteNode(Node n){
		if(n == null || n.next == null){
			return false;
		}
		int tmp = n.data;
		n.data = n.next.data;
		n.next.data = tmp;
		n.next = n.next.next;
		return true;
	}
}

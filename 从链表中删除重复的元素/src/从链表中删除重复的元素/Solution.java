package 从链表中删除重复的元素;

import java.util.Hashtable;

public class Solution {

	 public void deleteDuplecate(Node head){
		 Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
		 Node tmp = head;
		 Node pre = null;
		 while (tmp != null) {
			if(table.containsKey(tmp.data)){
				pre.next = tmp.next;
			}else {
				table.put(tmp.data, 1);
				pre = tmp;
			}
			tmp = tmp.next;
		}
	 }
}

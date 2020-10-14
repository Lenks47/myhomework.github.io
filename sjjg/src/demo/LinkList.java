package demo;

public class LinkList { // 单链表类的定义
	Node head; // Node是结点类型 , 表头
	int length; // 表长

	// 构造方法
	public LinkList() {// 创建空表
		head = new Node(null,null); // head记住表头
		length = 0;//初始化表长
	}

	public void  add(Object x) {// 默认头插法
		Node  node = new Node(x, null);
		node.next = head.next;
		head.next = node;
		length++;
	}
	public void  add(int i, Object x) {//指定位置插入
		if(i<=0 || i>length+1) System.out.println("插入位置不合法");
		else {
			Node  p = search(i-1);
			Node  node = new Node(x, null);
			node.next = p.next;
			p.next = node;
			length++;
		}
	}
	public Node delete(int i) { // 删除指定位置的结点
		if(i<=0 || i>length) {
			System.out.println("删除位置不合法");
			return null;
		}
		else {
			Node   p = search(i-1);
			Node   del=p.next;
			p.next=del.next;
			return del;
			
		}
	}
	public  Node search(int j) { // 遍历指定次数的表
		if(j<0 || j>length) { 
			System.out.println("j值不合法");
			return null;
		}
		else {
			int  k=0;
			if(j==k) return head;
			
			Node  p =head.next;
			while(p!=null) {
				k++;
				if(k==j) break;
				else 
					p=p.next;
			}
			return p;
		}
	}
	public Object get(int i) { // 获取表的数据
 		if(i<0 || i>length) { 
			System.out.println("i值不合法");
			return null;
		} 
		Node pNode=head.next;
		int k=0;
		while(pNode!=null) { 
			if(k==i) break;
			pNode=pNode.next; 
			k++;
		}
			return pNode.data; 
	}
}
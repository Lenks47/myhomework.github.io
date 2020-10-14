package demo;

public class LinkList { // ��������Ķ���
	Node head; // Node�ǽ������ , ��ͷ
	int length; // ��

	// ���췽��
	public LinkList() {// �����ձ�
		head = new Node(null,null); // head��ס��ͷ
		length = 0;//��ʼ����
	}

	public void  add(Object x) {// Ĭ��ͷ�巨
		Node  node = new Node(x, null);
		node.next = head.next;
		head.next = node;
		length++;
	}
	public void  add(int i, Object x) {//ָ��λ�ò���
		if(i<=0 || i>length+1) System.out.println("����λ�ò��Ϸ�");
		else {
			Node  p = search(i-1);
			Node  node = new Node(x, null);
			node.next = p.next;
			p.next = node;
			length++;
		}
	}
	public Node delete(int i) { // ɾ��ָ��λ�õĽ��
		if(i<=0 || i>length) {
			System.out.println("ɾ��λ�ò��Ϸ�");
			return null;
		}
		else {
			Node   p = search(i-1);
			Node   del=p.next;
			p.next=del.next;
			return del;
			
		}
	}
	public  Node search(int j) { // ����ָ�������ı�
		if(j<0 || j>length) { 
			System.out.println("jֵ���Ϸ�");
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
	public Object get(int i) { // ��ȡ�������
 		if(i<0 || i>length) { 
			System.out.println("iֵ���Ϸ�");
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
public class Node{

	int key;
	
	Node(int k){
		key=k;
	}
	
	public int compareTo(Node node) {
		if(this.key<node.key)
			return -1;
		else if(this.key==node.key)
			return 0;
		else
			return 1;
	}

	public void setkey(int t) {
		this.key=t;
	}
	
}
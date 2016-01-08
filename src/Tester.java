
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node[] arr={new Node(10),new Node(9),new Node(8),new Node(7),new Node(6),new Node(5),new Node(4),new Node(3),new Node(2),new Node(1)};
		MinHeap p=new MinHeap(arr);
		p.print();
		p.decrease_key(4, -1);
		p.print();
		p.insert(new Node(0));
		p.print();
		
		for(int i=0;i<5;i++){
			System.out.print(p.extract_min().key+" ");
		}
	}

}
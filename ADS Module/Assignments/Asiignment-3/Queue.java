class Queue{
	
	int size =5;
	int q[]=new int[size];
	int front,rear;
	
	Queue(){
		front=-1;
		rear=-1;
		
	}
	
	boolean isEmpty(){
		return (front==-1);
	}
	
	boolean isFull(){
		return (rear == size-1);
	}
	
	void enqueue(int n){
		if(isFull()){
			System.out.println("Queue is full");
		}else{
			if(front==-1){
				front=0;
			}
			rear++;
			q[rear]=n;
			System.out.println(n+" Inserted");
		}
	}
	
	int dequeue(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return -1;
		}else{
			int n = q[front];
			System.out.println(n+ " Deleted");
			if(front>rear){
				front=-1;
				rear=-1;
			}else{
				front++;
			}
			return n;
		}
	}
	void display(){
		if(isEmpty()){
			System.out.println("Empty Queue");
		}else{
			System.out.println("Queue elements");
			for(int i=front;i<=rear;i++){
				System.out.print(q[i]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String args[]){
		Queue q1 = new Queue();
		q1.enqueue(5);
		q1.enqueue(10);
		q1.display();
		q1.dequeue();
		q1.display();

		Queue q2 = new Queue();
		q2.enqueue(1);
		q2.enqueue(2);
		q2.enqueue(3);
		q2.display();
		q2.dequeue();
		q2.dequeue();
		q2.display();
	}
}
		
		
	
package queue;

public class Queue {

	int front, rear, size, capacity;
	int arr[];

	public Queue(int capacity) {
		this.capacity = capacity;
		this.front = this.size = 0;
		this.rear = this.capacity - 1;
		arr = new int[this.capacity];
	}

	private boolean isFull(Queue queue) {
		return (queue.size == queue.capacity);
	}

	private boolean isEmpty(Queue queue) {
		return queue.size == 0;
	}

	private void enqueue(int item) {
		if (isFull(this)) {
			return;
		}

		this.rear = (this.rear + 1) % this.capacity;
		this.arr[this.rear] = item;
		this.size++;

		System.out.println("Item enqueued is " + item);
	}

	private int dequeue() {
		if (isEmpty(this)) {
			return 0;
		}

		int item = this.arr[this.front];

		this.front = (this.front + 1) % this.capacity;
		this.size--;

		System.out.println("Item dequeued is " + item);

		return item;
	}
	
	private int rear() {
		return this.arr[this.rear];
	}

	private int front() {
		return this.arr[this.front];
	}

	public static void main(String[] args) {

		Queue queue = new Queue(5);

		System.out.println("---------------Enqueue Starts---------------");

		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		
		System.out.println("---------------Enqueue Ends---------------");
		System.out.println("---------------Deuqeue Starts---------------");

		queue.dequeue();
		queue.dequeue();
		
		System.out.println("---------------Deuqeue Ended---------------");

		System.out.println("Front is "+queue.front());
		System.out.println("Rear is "+queue.rear());


	}


}

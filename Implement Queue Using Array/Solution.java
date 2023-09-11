// Implement the Queue class
class Queue {
	
	int [] arr;
	int front;
	int rear;
	int count;
	int capacity;	
	
	Queue (int capacity) {

		arr = new int [capacity];
		front = 0;
		rear = -1;
		this.capacity = capacity;
	}

	boolean isEmpty() {
		
		if(count == 0){

			return true;			
		}else{
			
			return false;
		}
	}
	
	int size() {

		return count;		
	}
	
	int front() {

		if(count == 0){

			return -1;			
		}else{
			
			return arr[front];
		}		
	}
	
	int back() {
		
		if(count == 0){
			
			return -1;			
		}else{
			
			return arr[rear];
		}
	}
	
	void push(int element) {
		
		if(count == capacity){			
			
		}else{
			
			rear = (rear + 1) % capacity;
			arr[rear] = element;
			count++;
		}

	}
	
	void pop() {
		
		if(count == 0){			
			
		}else{
			
			front = (front + 1) % capacity;
			count--;
		}
	}
}

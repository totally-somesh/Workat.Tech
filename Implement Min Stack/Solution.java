// Implement the below class
class MinStack {
	
	class Node{

		int val;
		int min;
		
		public Node(int val, int min){
			
			this.val = val;
			this.min = min;	
		}		
	}
	
	Stack<Node> stck;
	int min;
	
	public MinStack(){
		
		stck = new Stack<>();
		min = 2147483647;		
	}
	
    void push(int x) {
		
		if(stck.isEmpty()){

			min = x;		
		}else{
			
			min = Math.min(stck.peek().min, x);
		}
		
		stck.push(new Node(x, min));		
    }
	
    void pop() {
		
		stck.pop();	    
    }
	
    int top() {
		
		return stck.peek().val;	    
    }
	
    int getMin() {
		
		return stck.peek().min;	    
    }
}

/*
	// MinStack class and its object will be used as given below:
	MinStack minStack = new MinStack();
	minStack.push(42);
	int top = minStack.top();
	int min = minStack.getMin();
	minStack.pop();
*/

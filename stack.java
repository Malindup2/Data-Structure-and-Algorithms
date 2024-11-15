package stack;

public class stack {
	int size ;
	int[] stackarr ;
	int top;
	
	public stack(int s) {
		
		size=s;
		int[] stackarr=new int[size];
		top=-1;
		
	}
	
	public void push(int v) {
		
		if(top-1==size) {
			System.out.println("stack is full");
		}else {
			stackarr[top++]=v;
		}
		
	}
	
	public int pop() {
		if(top==-1) {
			return -99;
			
		}else {
			return stackarr[top--];
		}
	}
	
	public int peek() {
		if(top==-1) {
			return -99;
		}else {
			return stackarr[top];
		}
	}
	
	
	
	

}

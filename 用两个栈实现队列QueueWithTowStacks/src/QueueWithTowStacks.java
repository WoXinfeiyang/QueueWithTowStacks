import java.util.Stack;

/**
 * 文件名称：《剑指Offer：名企面试官精讲典型编程题(纪念版)》面试题7：用两个栈实现队列
 * 时间：2016-8-12 12:02
 * 时间：1、题目：用两个栈实现队列。
 * */
public class QueueWithTowStacks {
    
	static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();
    
    public static void push(int node) {
        stack1.push(node);
        
    }
    
    public static int pop() {
    	if(stack2.size()<=0){
        	while(stack1.size()>0){
        		Integer node=stack1.peek();
        		stack1.pop();
        		stack2.push(node);
        	}	
    	}

    	if(stack2.size()==0){
    		try {
				throw new Exception("队列为空!");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	return stack2.pop();
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push(1);
		push(2);
		push(3);
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		push(4);
		push(5);
		System.out.println(pop());
		System.out.println(pop());
	}

}

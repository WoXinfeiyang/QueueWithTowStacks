import java.util.Stack;

/**
 * �ļ����ƣ�����ָOffer���������Թپ������ͱ����(�����)��������7��������ջʵ�ֶ���
 * ʱ�䣺2016-8-12 12:02
 * ʱ�䣺1����Ŀ��������ջʵ�ֶ��С�
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
				throw new Exception("����Ϊ��!");
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

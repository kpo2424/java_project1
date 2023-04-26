package Practice3;
import java.util.Stack; 
public class Stack2 { //LIFO

	public static void main(String[] args) { //FILO
		// TODO Auto-generated method stub

		Stack<String> stack = new Stack<String>();
		stack.add("kim");
		System.out.println(stack);
		stack.add("lee");
		System.out.println(stack);
		System.out.println(stack.pop());//아웃 시킬거 출력 lee. 나중에 들어간게 먼저 나옴 
		System.out.println(stack); // 남은거 출력 
	}

}

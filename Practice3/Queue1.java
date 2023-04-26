package Practice3;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class Queue1 { //들어간 순서대로 나옴 FIFO/ LILO

	public static void main(String[] args) {

		Queue<String> name = new LinkedList<String>();
		name.offer("kim");
		System.out.println(name);
		name.offer("lee");//offer: Queue가 가득차 있지 않은 경우 새로운 요소 추가/차있으면 false반환 
		System.out.println(name);
		System.out.println(name.poll());//먼저 들어간 kim 반환 
		System.out.println(name.poll()); // 요소 하나 꺼내서 출력 
		System.out.println(name);
		
	}
}

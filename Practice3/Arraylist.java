package Practice3;
import java.util.Collections;
import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> name = new ArrayList<String>();
		name.add("kim");
		name.add("lee");
		name.add("john");
		
		System.out.println(name);
		System.out.println(name.size()); //갯수3
		System.out.println(name.get(2)); //2번째 배열 
		
		name.remove(1);//1번쨰 배열 제외
		System.out.println(name); 
		
		name.set(1, "park"); //1번째에 park넣기 
		System.out.println(name);
		System.out.println(name.size());
		
		name.add("lee");
		System.out.println(name);
		
		Collections.sort(name); //오름차순 정렬 
		System.out.println(name);
		
		Collections.reverse(name); //역순 
		System.out.println(name);
		
	}

}

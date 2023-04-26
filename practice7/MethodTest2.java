package practice7;

public class MethodTest2 {

	static int iStatic; //정적(static) 변수 iStatic을 선언
	
	public static void add(int i) { //static은 객체생성 없이 사용 가능함
		iStatic++; //1+1
		i++; //1+1
		System.out.printf("add메소드에서->iStatic=[%d]\n",iStatic); //2출력
		System.out.printf("add메소드에서->i=[%d]\n",i); //2출력
	}
	
	public static int add2(int i) {
		iStatic++;//2+1
		i++;//1+1
		System.out.printf("add메소드에서->iStatic=[%d]\n",iStatic);//3출력
		System.out.printf("add메소드에서->i=[%d]\n",i);//2출력
		return i;//2
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int iMain;
		
		iMain = 1;
		iStatic = 1;
		
		System.out.printf("*********************************\n");
		System.out.printf("메소드호출전 메인에서->iSatic=[%d]\n",iStatic);//1
		System.out.printf("메소드호출전 메인에서->iMain=[%d]\n",iMain);//1
		System.out.printf("*********************************\n");
		
		add(iMain); //iMain 객체(1)을 매개변수로 전달하여 add메소드 호출
		
		System.out.printf("*********************************\n");
		System.out.printf("메소드호출후 메인에서->iSatic=[%d]\n",iStatic); //2
		System.out.printf("메소드호출후 메인에서->i=[%d]\n",iMain); //1
		System.out.printf("*********************************\n");
		
		iMain = add2(iMain);//iMain 객체(1)을 매개변수로 전달하여 add2메소드 호출
		//return값 i=2로 받아서 저장 
		
		System.out.printf("*********************************\n");
		System.out.printf("메소드 add2호출후 메인에서->iSatic=[%d]\n",iStatic);//3
		System.out.printf("메소드 add2호출후 메인에서->iMain=[%d]\n",iMain);//2
		System.out.printf("*********************************\n");
	}

}

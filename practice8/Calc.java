package practice8;

public class Calc implements Calculator{
	public static final double PI = 3.14; //저장 위치의 차이.은행 이자율 광범위하게 씀
	private int memory;
	
	public int add(int a, int b) {
		int sum= a+b;
		this.memory = sum;
		return sum;
	}
	
	public static double getCircleLength(double r) { //
		return 2 * Calc.PI * r;
	}
	
	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

}

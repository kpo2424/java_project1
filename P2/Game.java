package P2;

public class Game {
	//매개 변수 선언 
	String name; 
	int age;
	float offensePower;
	float defensePower;
	
	public Game() { //초기값 
		this("None", 0, 0, 0);
	}
	
	//생성자 만들기(를 통한 초기화) 
	public Game(String name, int age, float offensePower, float defensePower) { 
		this.name = name;
		this.age = age;
		this.offensePower = offensePower;
		this.defensePower = defensePower;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public float getOffensePower() {
		return offensePower;
	}
	public void setOffensePower(float offensePower) {
		this.offensePower = offensePower;
	}

	public float getDefensePower() {
		return defensePower;
	}
	public void setDefensePower(float defensePower) {
		this.defensePower = defensePower;
	}
	

    public void showIntroduction() {
    	System.out.println(this.name + "/" + this.age + "/" + this.offensePower + "/" + this.defensePower);
    }
	

}

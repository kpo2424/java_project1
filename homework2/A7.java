package homework2;
import java.util.Scanner;
public class A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("과목수를 입력하세요.");
		int numOfSub = scanner.nextInt();
		
		int totalUnit = 0; //총 단위 
		double totalGradePoint = 0.0; //총점 
		
		
		for (int i = 0; i < numOfSub; i++) {// 과목수만큼 입력받기 
			System.out.println("과목별 단위를 입력하세요.");
		    int unitOfSub = scanner.nextInt(); 
		    scanner.nextLine();
		    
		    System.out.println("과목별 등급을 입력하세요");
		    String gradeOfSub = scanner.nextLine();
			
		    totalUnit += unitOfSub; // 총 단위 구하기 
			double gradePoint = calculateGrade(gradeOfSub); // 등급 점수로 바꾸기 
			//System.out.println(gradePoint);
			
			double subGradePoint = gradePoint * unitOfSub;//과목별 점수 
			totalGradePoint += subGradePoint; // 총 점수 
			//System.out.println(subGradePoint);
		}
		
		double avg = totalGradePoint / totalUnit;
		System.out.println(avg);
		
	 }	
	
	
	
	// 등급을 받아서 해당하는 학점을 반환하는 함수
	public static double calculateGrade(String gradeOfSub) {
	        
	    double gradePoint = 0.0;
		
		switch (gradeOfSub) {
        case "A+":
            gradePoint = 4.5;
            break;
        case "A0":
            gradePoint = 4.0;
            break;
        case "B+":
            gradePoint = 3.5;
            break;
        case "B0":
            gradePoint = 3.0;
            break;
        case "C+":
            gradePoint = 2.5;
            break;
        case "C0":
            gradePoint = 2.0;
            break;
        case "D+":
            gradePoint = 1.5;
            break;
        case "D0":
            gradePoint = 1.0;
            break;
        case "F":
        	gradePoint = 0.0;
            break;
        default:
            gradePoint = 0.0;
            break;
		}
		return gradePoint;
  
	}

	
}

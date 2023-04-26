package Homework3;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//4행 3열 
		String[] students = {"Jeong", "Pyo", "Choi", "Mike"};
		String[] subjects = {"Korean", "English", "Math"};
		
		int [][] scores = {{70,80,100}, {60,70,86}, {54,100,82}, {87,95,79}};
		
		// 학생 이름에 따른 과목별 점수 출력
		System.out.println("Name\tKorean\tEnglish\tMath");
		for (int i = 0; i < students.length; i++) {
			 System.out.print(students[i] + "\t");
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.println();
		} 
		System.out.println("-----------------------------");
		
		//과목 별 출력(3개)
		for (int i = 0; i < subjects.length; i++) {
			System.out.println(subjects[i]); //과목 출력 
			int scoreSum = 0;
			int avg = 0;
			int min = Integer.MAX_VALUE; //최대값 초기화
		    int max = Integer.MIN_VALUE;
			for (int j = 0; j < students.length; j++) {
				scoreSum += scores[j][i];
				avg =  scoreSum / students.length;
				if (scores[j][i] < min) {
					min = scores[j][i];
				}
				if (scores[j][i] > max) {
		            max = scores[j][i];
		        }
			}
			System.out.println("Summation: " + scoreSum);
			System.out.println("Average: " + avg);
			System.out.println("Minimum: " + min);
			System.out.println("Maximum : " + max);
			System.out.println();
		} 
		
		
		//학생 별 출력(4개)
		System.out.println("-----------");
		for (int i = 0; i < students.length; i++) {
			 System.out.println(students[i]);
			 int stdSum = 0; 
			 int avg = 0;
			 int min = Integer.MAX_VALUE; //최대값 초기화
			    int max = Integer.MIN_VALUE;
			 for (int j = 0; j < scores[i].length; j++) {
				 stdSum += scores[i][j];
				 avg = stdSum / subjects.length;
				 if (scores[i][j] < min) {
						min = scores[i][j];
					}
					if (scores[i][j] > max) {
			            max = scores[i][j];
			        }
			 }
			 System.out.println("Summation: " + stdSum);
			 System.out.println("Average: " + avg);
			 System.out.println("Minimum: " + min);
			 System.out.println("Maximum : " + max);
			 System.out.println();
		}
		
	}

}

package practice08;

public class number {

	public static void main(String[] args) {

		int k24_iNumVal = 210000000; // k24_iNumVal 정수형 변수 선언 후 값 초기화(10억백3만4천5백6십7원)
		String k24_sNumVal = String.valueOf(k24_iNumVal);// 숫자를 문자로 형변환
		String k24_sNumVoice = "";// 변환된 한글 음절을 더해 나가는 과정에서 초기 값의 영향을 받지 않도록 하는 것
		System.out.printf("==> %s [%d자리]\n", k24_sNumVal, k24_sNumVal.length());

		int k24_i, k24_j;

		// 크기가 10인 문자열 k24_units을 선언하고, 값 저장
		String[] k24_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
		// 크기가 10인 문자열 k24_unitx을 선언하고, 값 저장
		String[] k24_unitx = { "", "십", "백", "천", "만", "십", "백", "천", "억", "십" };// 일의자리는 단위 읽지 않아서 빈칸

		k24_i = 0; // 변수 k24_i 0으로 초기화
		k24_j = k24_sNumVal.length() - 1; // 숫자의 길이에 1뺀 값으로 저장

		while (true) {
			if (k24_i >= k24_sNumVal.length()) { // k24_i가 숫자의 길이보다 크면
				break; // 반복문 탈출
			}
			System.out.printf("%s[%s]", k24_sNumVal.substring(k24_i, k24_i + 1), // 문자열의 k24_i부터 k24_i+1 자릿수 전까지의 문자열을  출력
					k24_units[Integer.parseInt(k24_sNumVal.substring(k24_i, k24_i + 1))]);// k24_sNumVal에서 k24_i부터 하나의 문자 가져와 units배열의 값 출력

			// int형으로 변환한 k24_sNumVal 값을 k24_units의 인덱스 값으로 넣어줌 (0입력시 영 읽히게)
	         if (k24_iNumVal == 0 && k24_sNumVal.length() == 1) { //숫자가 0이고 문자열의 길이가 1(즉, 한자리면)
	            k24_sNumVoice = k24_units[0]; //숫자가 0일때 읽히지 않게 ""공백으로 만들어줌 
	            break; //맞으면 탈출 
	         }
	         
			if (k24_sNumVal.substring(k24_i, k24_i + 1).equals("0")) {// 만약 숫자가 0이면 읽히지 않게 ""만들어줘야 함 
				if (k24_unitx[k24_j].equals("만") || k24_unitx[k24_j].equals("억")) { // 만약 현재 자릿수-1가 만이나 억이면
					if (k24_i > 2 && k24_sNumVal.substring(k24_i - 3, k24_i).equals("000")) {//2|00,0|00,000 ||사이값이 0이면 
						//앞에 세자리 이상이어야 -3 가능 
						k24_sNumVoice = k24_sNumVoice + ""; // ""을 누적 //2억이면 뒤에 만 안나오게 함
					} else { //2억1백만이면  k24_unitx[k24_j]써서 만 나오게 함
						k24_sNumVoice = k24_sNumVoice + "" + k24_unitx[k24_j];// k24_unitx[k24_j] 값을 k24_sNumVoice 변수에 추가
					} 
				} else {//아무것도 안함 

				}
			} else {// 0이 아닌 숫자가 있으면
				k24_sNumVoice = k24_sNumVoice // 0인숫자 건너뛰기
						+ k24_units[Integer.parseInt(k24_sNumVal.substring(k24_i, k24_i + 1))]// 해당 숫자 출력
						+ k24_unitx[k24_j]; // 자릿수 출력
			}
			k24_i++; // 다음 자리로 이동
			k24_j--; // k24_unitx 자릿수 읽기 위해 -1
		}
		System.out.printf("\n %s[%s]\n", k24_sNumVal, k24_sNumVoice);// 숫자, 읽는법 출력

	}

}

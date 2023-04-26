package practice08;
import java.text.DecimalFormat; //DecimalFormat 사용하기 위한 import
public class tap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String k24_item = "사과"; //문자형 변수 k24_item 선언 후 사과 저장
		int k24_unit_price = 5000; //정수형 변수 k24_unit_price 선언 후 5000저장
		int k24_num = 500; //정수형 변수 k24_num 선언 후 500저장
		int k24_total = 0; //정수형 변수 k24_total 선언 후 0저장
		
		//k24_df 객체 생성 후 형식 지정 패천 설정 
		DecimalFormat k24_df = new DecimalFormat( "###,###,###,###,###" );
		
		System.out.printf("==========================================================\n");//출력
		//%20.20s : 20자리 중 20번째 자리까지 문자열 출력 
		//한글은 2s인데 한글자를 1s로 인식해서 -1s해줘야 함 
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n", "품목", "단가", "수량", "합계");
		System.out.printf("==========================================================\n");//출력
		
		//숫자도 1s. DecimalFormat사용해서 ,출력
		System.out.printf("%20.20s%10.10s%10.10s%10.10s\n",
				k24_item,k24_df.format(k24_unit_price),k24_df.format(k24_num),k24_df.format(k24_unit_price*k24_num));
		System.out.printf("==========================================================\n");
	}
}

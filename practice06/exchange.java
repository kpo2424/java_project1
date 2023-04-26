package practice06;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class exchange {

	public static void main(String[] args) {

		int kopo24_MyWon = 1000000; //변수 kopo24_MyWon(내돈) 선언 후 100만원 저장
		double kopo24_MoneyEx = 1238.21; //변수 kopo24_MoneyEx(달러환율) 선언 후 1238.21 저장 
		double kopo24_commission = 0.003; //변수 kopo24_commission(환전수수료) 선언 후 0.003 저장
		
		int kopo24_usd = (int) (kopo24_MyWon/kopo24_MoneyEx); //변수 kopo24_usd(달러)선언 후 내돈/환율을 계산하여 정수형 저장
		int kopo24_remain = (int) (kopo24_MyWon - kopo24_usd * kopo24_MoneyEx); //변수 kopo24_remain(잔돈)선언 후 내돈-(달러*환율)값 정수형 저장
		
		System.out.printf("************************************************************\n");//출력
		System.out.printf("*                      수수료 미포함 계산                  *\n");//출력
		System.out.printf("총 한화 환전 금액: %d원 => 미화: %d달러, 잔돈: %d원\n", kopo24_MyWon, kopo24_usd, kopo24_remain);//정수형 출력
		System.out.printf("************************************************************\n");//출력
		
		
		//수수료 계산 
		double kopo24_ComPerOne = kopo24_MoneyEx * kopo24_commission;//변수 kopo24_ComPerOne(1달러당 수수료)선언 후 (환율*환전 수수료) 값을 저장 
		
		double kopo24_totalcom = kopo24_usd * kopo24_ComPerOne;//변수 kopo24_totalcom (총 수수료)실수형 선언 후  (달러*1달러당 수수료) 값을 저장
		System.out.printf("********************************************************************\n");//출력
		System.out.printf("*                             수수료 계산                          *\n");//출력
		System.out.printf("총 수수료: %f원 => 미화: %d달러, 달러당 수수료: %f원\n", kopo24_totalcom, kopo24_usd, kopo24_ComPerOne);//포맷팅 후 출력
		System.out.printf("********************************************************************\n");//출력
	
		//수수료 적용 환전 계산
		int kopo24_i_totalcom; //총 수수료 정수형 선언
		
		if (kopo24_totalcom != (double)((int)kopo24_totalcom)) //총 수수료의 소수점이 나누어 떨어지지 않으면 
			kopo24_i_totalcom = (int) kopo24_totalcom + 1; //일의 자리에서 올림. 은행은 무조건 올림해서 받아야함(고객은 내림) 
		else //소수점이 나누어 떨어지면 
			kopo24_i_totalcom = (int) kopo24_totalcom; //정수형으로 바뀐 값으로 그대로 저장
		System.out.printf("***********************************************************************************\n");//출력
		System.out.printf("*                                   수수료 적용 환전                              *\n");//출력
		System.out.printf("총 수수료: %d원 => 미화: %d달러, 달러당 수수료: %f원\n", kopo24_i_totalcom, kopo24_usd, kopo24_ComPerOne);//포맷팅 후 출력
		
		//잔돈 변수에 (내돈-달러*환율-총 수수료) 저장
		kopo24_remain = (int) (kopo24_MyWon - kopo24_usd * kopo24_MoneyEx - kopo24_i_totalcom);//807달러를 환전하려면 2233원을 더 내야함 
		System.out.printf("총 한화 환전 금액: %d원 => 미화: %d달러, 수수료 징구: %d원, 잔돈: %d원\n", kopo24_MyWon, kopo24_usd, kopo24_i_totalcom, kopo24_remain);
		System.out.printf("***********************************************************************************\n");//포맷팅 후 출력
		
		//수수료를 떼고 환전해줄 수 있게 계산
		kopo24_usd = (int) (kopo24_MyWon/(kopo24_MoneyEx + kopo24_ComPerOne));//달러당 수수료를 환율에 포함시켜 환전달러 계산
		kopo24_totalcom = kopo24_usd * kopo24_ComPerOne;//총 수수료는 환전달러*달러당 수수료
		
		if (kopo24_totalcom != (double) ((int)kopo24_totalcom)) //총 수수료가 소수점으로 나누어 떨어지지 않으면 
				kopo24_i_totalcom = (int)kopo24_totalcom + 1; //1월을 더해 정수형으로 계산
		else //소수점 이하가 0이면 
			kopo24_i_totalcom = (int)kopo24_totalcom; //그대도 정수형 출력 
		
		System.out.printf("***********************************************************************************\n");//출력
		System.out.printf("*                               최종 수수료 적용 환전                             *\n");//출력
	 
		System.out.printf("총 수수료: %d원 => 미화: %d달러, 달러당 수수료: %f원\n", kopo24_i_totalcom, kopo24_usd, kopo24_ComPerOne);//포맷팅후 출력 
		
		kopo24_remain = (int) (kopo24_MyWon - kopo24_usd * kopo24_MoneyEx - kopo24_i_totalcom);//잔돈=내돈-달러*환율-최종수수료
		System.out.printf("총 한화 환전 금액: %d원 => 미화: %d달러, 수수료 징구: %d원, 잔돈: %d원\n", kopo24_MyWon, kopo24_usd, kopo24_i_totalcom, kopo24_remain);
		System.out.printf("***********************************************************************************\n");//포맷팅후 출력 
		
		
		//콤마 찍기
		DecimalFormat kopo24_df = new DecimalFormat ("###,###,###,###");//원화 단위로 ,찍기 
		System.out.printf("********************************************************************************************\n");//출력
		System.out.printf("*                                      콤마 찍기, 날짜 적용                                *\n");//출력
		//콤마 찍을 변수에 .format써줌
		System.out.printf("총 수수료: %s원 => 미화: %s달러, 달러당 수수료: %f원\n",//포맷팅후 출력 
				kopo24_df.format(kopo24_i_totalcom),
				kopo24_df.format(kopo24_usd),
				kopo24_ComPerOne);
		kopo24_remain = (int) (kopo24_MyWon*kopo24_MoneyEx - kopo24_i_totalcom);//잔돈=(내돈*환율-최종 수수료) 정수형으로 저장
		System.out.printf("총 한화 환전 금액: %s원 => 미화: %s달러, 수수료징구: %s원, 잔돈: %s원\n", //포맷팅후 출력 
				kopo24_df.format(kopo24_MyWon), kopo24_df.format(kopo24_usd), kopo24_df.format(kopo24_i_totalcom), kopo24_df.format(kopo24_remain));
		
		//현재 날짜, 시간 불러오기
		Calendar kopo24_calt = Calendar.getInstance(); //Calendar클래스로 현재 시간 불러옴 
		SimpleDateFormat kopo24_sdt = new SimpleDateFormat ("YYYY/MM/dd: HH:mm:ss"); //SimpleDateFormat클래스로 출력형식을 지정
		System.out.printf("최종 실행 시간: %s\n", kopo24_sdt.format(kopo24_calt.getTime()));//kopo24_calt변수로 시간 가져옴 
		System.out.printf("********************************************************************************************\n");//출력
	}
}

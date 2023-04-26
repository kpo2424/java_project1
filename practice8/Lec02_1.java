package practice8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lec02_1 {

	public static void main(String[] args) throws IOException{
		// �ش� ���� ��� �����Ͽ� File ��ü ����
		File f_k24 = new File("C:\\Users\\�̿���\\eclipse-workspace\\���� ����������� ����.txt");
		//����� �����͸� ���ۿ� �׾Ƶξ��ٰ�, �ѹ��� ���
		BufferedReader br_k24 = new BufferedReader(new FileReader(f_k24));
		
		String readtxt_k24;//���ڿ� ������ ����
		
		if((readtxt_k24 = br_k24.readLine()) == null){//���� ���� ������ null�� �ƴҶ����� �ݺ�
			System.out.println("�� �����Դϴ�\n");//���
			return;
		}
		String[] field_name_k24 = readtxt_k24.split("\t");//���� �������� ������ ù��° �ٿ��� �� �ʵ� �̸� ����
		
		double lat_k24 = 37.3860521;//���ձ���� ����
		double lng_k24 = 127.1214038;//���ձ���� �浵
		
		int LineCnt_k24 = 0; //�� �� �ʱ�ȭ �� ����
		while((readtxt_k24 = br_k24.readLine())!=null) { //���� ������ ���پ� �о���� null�� �ƴ� ������ �ݺ�
			String[] field_k24 = readtxt_k24.split("\t"); //���� �������� ������ ù��° �ٿ��� �� �ʵ� ���� ����
			System.out.printf("**[%d��° �׸�]*********\n", LineCnt_k24+1);//�׸� ��ȣ ���
			System.out.printf("%s : %s\n", field_name_k24[9], field_k24[9]);//9�� : �����ּ�
			System.out.printf("%s : %s\n", field_name_k24[13], field_k24[13]);//14�� : �����ּ�
			System.out.printf("%s : %s\n", field_name_k24[14], field_k24[14]);//15�� : �浵�ּ�
			//��Ÿ��� �������� �Ÿ� ���
			double dist_k24 = Math.sqrt(Math.pow(Double.parseDouble(field_k24[13])-lat_k24,2) //���������� ���� �ּҿ��� ���ձ������ ������ �� ���� ����
					+Math.pow(Double.parseDouble(field_k24[14])-lng_k24,2)); //���������� ���� �ּҿ��� ���ձ������ �浵�� �� ���� �����ؼ� ���Ѱ� ������
			System.out.printf("���������� �Ÿ� : %f\n", dist_k24);//�Ÿ� ���
			System.out.printf("***************************\n");//���
			
			LineCnt_k24++;//���� �� ���
		}
		br_k24.close();//���� �ݱ�
	}

}

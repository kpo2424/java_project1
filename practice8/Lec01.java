package practice8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lec01 {

	public static void main(String[] args) throws IOException {
		// �ش� ���� ��� �����Ͽ� File ��ü ����
		File f_k24 = new File("C:\\Users\\�̿���\\eclipse-workspace\\���� ����������� ����.txt");
		// ����� �����͸� ���ۿ� �׾Ƶξ��ٰ�, �ѹ��� ���
		BufferedReader br_k24 = new BufferedReader(new FileReader(f_k24));

		String readtxt_k24;// ���ڿ� ������ ����

		if ((readtxt_k24 = br_k24.readLine()) == null) {// ���� ���� ������ null�� �ƴҶ����� �ݺ�
			System.out.println("�� �����Դϴ�\n"); // ���
			return;
		}
		String[] field_name_k24 = readtxt_k24.split("\t");// ���� �������� ������ ù��° �ٿ��� �� �ʵ� �̸� ����

		int LineCnt_k24 = 0;//�� �� �ʱ�ȭ �� ����
		while ((readtxt_k24 = br_k24.readLine()) != null) {//���� ������ ���پ� �о���� null�� �ƴ� ������ �ݺ�
			String[] field_k24 = readtxt_k24.split("\t"); //���� �������� ������ ù��° �ٿ��� �� �ʵ� ���� ����
			System.out.printf("**[%d��° �׸�]*********\n", LineCnt_k24);//�׸� ��ȣ ���
			for (int j_k24 = 0; j_k24 < field_name_k24.length; j_k24++) {//��� �׸� ���
				System.out.printf(" %s : %s\n", field_name_k24[j_k24], field_k24[j_k24]);
			}
			System.out.printf("*****************\n");
			if (LineCnt_k24 == 100) //100�� ���� ���
				break;
			LineCnt_k24++;
		}
		br_k24.close();//���� �ݱ�
	}
}

package practice8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lec02_2 {

	public static void main(String[] args) throws IOException {
		// �ش� ���� ��� �����Ͽ� File ��ü ����
		File f_k24 = new File("C:\\Users\\�̿���\\eclipse-workspace\\���� ����������� ����.txt");
		// ����� �����͸� ���ۿ� �׾Ƶξ��ٰ�, �ѹ��� ���
		BufferedReader br_k24 = new BufferedReader(new FileReader(f_k24));

		String readtxt_k24;// ���ڿ� ������ ����

		if ((readtxt_k24 = br_k24.readLine()) == null) {// ���� ���� ������ null�� �ƴҶ����� �ݺ�
			System.out.println("�� �����Դϴ�\n");// ���
			br_k24.close();// ���� �ݱ�
			return;
		}
		String[] field_name_k24 = readtxt_k24.split("\t");// ���� �������� ������ ù��° �ٿ��� �� �ʵ� �̸� ����

		double lat_k24 = 37.3860521;// ���ձ���� ����
		double lng_k24 = 127.1214038;// ���ձ���� �浵

		double minDist_k24 = Double.MAX_VALUE; // �ִܰŸ��� ū ������ �ʱ�ȭ
		double maxDist_k24 = Double.MIN_VALUE; // ����Ÿ��� ���� ������ �ʱ�ȭ
		String[] closestInfo_k24 = null; // �ִܰŸ��� ���� ������ ������ �迭
		String[] farthestInfo_k24 = null; // ����Ÿ��� ���� ������ ������ �迭

		// ���� ������ ���پ� �о���� null�� �ƴ� ������ �ݺ�
		while ((readtxt_k24 = br_k24.readLine()) != null) {
			String[] field_k24 = readtxt_k24.split("\t");// ���� �������� ������ ù��° �ٿ��� �� �ʵ� ���� ����
			// �Ǵٰ�� �������� �Ÿ��� ���
			double dist_k24 = Math.sqrt(Math.pow(Double.parseDouble(field_k24[13]) - lat_k24, 2)
					+ Math.pow(Double.parseDouble(field_k24[14]) - lng_k24, 2));
			if (dist_k24 < minDist_k24) { // �ִܰŸ� ����
				minDist_k24 = dist_k24;
				closestInfo_k24 = field_k24; // �ִܰŸ��� ���� ������ ����
			}
			if (dist_k24 > maxDist_k24) { // ����Ÿ� ����
				maxDist_k24 = dist_k24;
				farthestInfo_k24 = field_k24; // ����Ÿ��� ���� ������ ����
			}
		}

		System.out.println("******�ִ� �Ÿ� ����******");
		System.out.printf("%s : %s\n", field_name_k24[10], closestInfo_k24[10]); // �����ּ�
		System.out.printf("%s : %s\n", field_name_k24[13], closestInfo_k24[13]); // ����
		System.out.printf("%s : %s\n", field_name_k24[14], closestInfo_k24[14]); // �浵
		System.out.printf("���������� �Ÿ� : %f\n", minDist_k24);// �Ÿ� ���
		System.out.println("******���� �Ÿ� ����******");
		System.out.printf("%s : %s\n", field_name_k24[10], farthestInfo_k24[10]); // �����ּ�
		System.out.printf("%s : %s\n", field_name_k24[13], farthestInfo_k24[13]); // ����
		System.out.printf("%s : %s\n", field_name_k24[14], farthestInfo_k24[14]); // �浵
		System.out.printf("���������� �Ÿ� : %f\n", maxDist_k24);// �Ÿ� ���

	}

}

package practice06;

public class Taxcalc {

	//tkopo24_val, kopo24_rate�� ���������� ��ȯ�ϴ� taxcal �Լ� ���� 
	public static int taxcal(int kopo24_val, int kopo24_rate) {
		int kopo24_ret; // �Լ� ���� �� ����� ���� kopo24_ret�� ����Ǿ� ��ȯ

		//�Ǽ������� ��������� ������ ��������(�Ҽ������� 0�̸�) ������ ����̶� ���� ����� 
		if (((double) kopo24_val * (double) kopo24_rate / 100.0) == kopo24_val * kopo24_rate / 100) 
			kopo24_ret = kopo24_val * kopo24_rate / 100;
		else//������ �������� ������
			kopo24_ret = kopo24_val * kopo24_rate / 100 + 1;//���� �ڸ� �ݿø� (+1)

		return kopo24_ret; //���� �� ��ȯ 
	}

	public static void main(String[] args) {

		int kopo24_val = 271; //���� ���� ���� ���� �� 271 ����
		int kopo24_rate = 3; //���� ���� ���� �� 3 ���� 

		int kopo24_tax = taxcal(kopo24_val, kopo24_rate); //taxcal�Լ� ȣ���Ͽ� kopo24_ret �� ���� ������ ���� 

		System.out.printf("**************************************\n");//���
		System.out.printf("*            �ܼ� ���� ���          *\n");//���
		System.out.printf("���� ���� ���: %f\n", kopo24_val * kopo24_rate / 100.0); //�Ǽ��� ��� 
		//�ø��Ͽ� ���� ���ݰ��� ���������� ���
		System.out.printf("��������: %d ����:%d ������ ����: %d\n", kopo24_val, kopo24_tax, kopo24_val+kopo24_tax);
		System.out.printf("**************************************\n");
		
	}
}
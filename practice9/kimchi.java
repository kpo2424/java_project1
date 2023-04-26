package practice9;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class kimchi {

	public static void main(String[] args) {

		DecimalFormat df_k24 = new DecimalFormat("###,###,###,###,###"); // �ݾ� ��½� ���� ����
		int kopo24_price = 33000;// �Һ��ڰ��� ������ ���� kopo24_price�� �����ϰ� �ʱⰪ 33000 ����

		LocalDateTime now_k24 = LocalDateTime.now(); // ����ð� �ҷ�����
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); // () ���·� ������

		// �Һ��ڰ�(���İ���) = �������� + ����
		// �������� = ���� / ����(0.1) = ���� * 10
		// �Һ��ڰ�(���İ���) = ���� * 11.0
		int kopo24_tax = (int) Math.ceil(kopo24_price / 11.0); // ���� = (���İ���/11.0)�� �ø��� ���� / �ΰ����� ������ �ø�
		int kopo24_netprice = kopo24_price - kopo24_tax; // ����������ǰ = ���İ��� - ����

		System.out.printf("�ſ���� \n" + "�ܸ��� : 2N68665898     ��ǥ��ȣ : 041218\n" + "������ : �Ѿ��ġ�\n"
				+ "��  �� : ��� ������ �д籸 Ȳ�����351���� 10, 1��\n" + "��ǥ�� : ��â��\n" + "����� : 752-53-0058        TEL : 7055695\n"
				+ "- - - - - - - - - - - - - - - - - - - - - \n"); // ���
		System.out.printf("��  ��%32s ��\n", df_k24.format(kopo24_netprice)); // (��������) �ݾ� ���
		System.out.printf("�ΰ���%32s ��\n", df_k24.format(kopo24_tax)); // �ΰ��� ���
		System.out.printf("��  ��%32s ��\n", df_k24.format(kopo24_price)); // (�Һ��ڻ�) �հ� ���
		System.out.printf(
				"- - - - - - - - - - - - - - - - - - - - - \n" + "�츮ī�� \n" + "ī���ȣ : 5387-20**-****-4613(S)  �Ͻú�\n"); // ���
		System.out.printf("�ŷ��Ͻ� : %s\n", now_k24.format(formatter)); // �����õ� ���� �ð� ���
		System.out.printf("���ι�ȣ : 70404427\n" + "�ŷ���ȣ : 357734873739\n" + "���� : ��ī���      ���� : 720068568\n"
				+ "�˸� : EDC����ǥ\n" + "���� : TEL)1544-4700\n" + "- - - - - - - - - - - - - - - - - - - - - \n"
				+ "            *�����մϴ�*\n" + "                       ǥ��V2.08_20200212");// ���
	}

}


package practice7;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class emartMethod {

	static DecimalFormat df_k24 = new DecimalFormat("###,###,###,###,###"); // �ݾ� ��� �� ������ ���Ŀ� ���缭 ���ڿ��� ��ȯ
	

	// ǰ�� ���� �迭 ���� �� �ʱ�ȭ
	static String[] itemname_k24 = { "�̸��� 10kg_����", "��귣�� ������κ�300g*2��", "�ĸӽ��� �������� 1.2kg/��", "��귣�� ������ ��Ƽ�� 100��",
			"[������] (1+1/��ȹ/�ִ� 50%) ���۹�/��/������ ������ ���Ϻ�ǰ������", "��귣�� ������ �ᳪ�� 300g", "��ȣ��(��)", "A)�ĸӽ��� �����(��)",
			"�α� ����/�ҽ���/�����ִ�1+1��", "[��������ȹ]ö�������10kg", "���ѱ� ����� �ſ�� 120g*5��", "�ȵ������ 130g*4��", "[CJ] �޹� (210g*12��)",
			"���߹���丶�� 750g/��", "��ī�ݶ����� 1.5LX2", "�ѿ� ä�� ���̿� 1��� (100g) (��)", "��ټ� 500ml", "(A)��(��)", "������ õ����� �ǰ��ϴ� 448g",
			"[Ǯ����] ������ �ᳪ�� 240g", "���ش뵿 ����(��)", "A)�Ϸ�񸶴�", "[��Ÿ����] ī��� 270ml", "[��귣��] ���� ���� �� (10��/20g)", "����(��)",
			"[���] �����90g", "���� Ȩ��������5���� 205g", "A)�Ϸ�ä�� ����", "[��귣��][�õ�] ���� �ٷα��� (1,000g)", "Ȩ����" };

	// ���� ���� �迭 ���� �� �ʱ�ȭ
	static int[] price_k24 = { 1250000, 350000, 103000, 2000, 5000, 2560, 1500, 2010, 6000, 35100, 5500, 6060, 15400,
			3020, 7770, 2000, 1010, 3000, 2550, 2350, 1110, 3020, 3540, 1500, 1020, 2500, 1550, 2000, 1500, 3330,
			1200 };

	// ���� ���� �迭 ���� �� �ʱ�ȭ
	static int[] amount_k24 = { 10, 90, 1, 1, 1, 70, 1, 2, 1, 1, 3, 2, 1, 2, 1, 2, 1, 1, 3, 1, 2, 1, 3, 1, 2, 2, 1, 1,
			2, 1, 5 };

	// �鼼��ǰ�� true�� ����
	static boolean[] taxfree_k24 = { false, false, true, false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false, false, false, false, false, false, false,
			false, false, false, false, true };

	//main �Լ� 
	public static void main(String[] args) {

		int itemCount_k24 = itemname_k24.length; // �׸� ����
		TitlePrint_k24(); // ������ �� �� Ÿ��Ʋ �μ�
		TimeStemp_k24(); // ��� �ð� �μ�
		HeaderPrint_k24(); // ���(��ǰ��, �ܰ�, ����, �ݾ�)�μ�

		for (int i_k24 = 0; i_k24 < itemCount_k24; i_k24++) { // �׸� ������ŭ �μ�
			ItemPrint_k24(i_k24);// (��ǰ��, �ܰ�, ����, �ݾ�) �μ�
		}
		TotalPrint_k24(); // �հ� ���� �� �μ�
	}
	
	// ������ �� �� Ÿ��Ʋ �μ�
	public static void TitlePrint_k24() {
		System.out.printf("emart         �̸�Ʈ ������ (031)888-1224\n" + "              206-86-50913 ����\n"
				+ "              ���� ������ ������� 552\n" + "������ �������� ��ȯ/ȯ�� �Ұ�\n�����ǰ�� ����, 30�� �̳�(�ż� 7��)\n"
				+ "���Ϻ� �귣����� ����(���� ����������)\n��ȯ/ȯ�� ���������� ����(����ī�� ����)\n\n"); // ���
		DateTimeFormatter date_k24 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"); // yyyy-MM-dd HH:mm���·� �������Ͽ� ����
		String time1 = TimeStemp_k24().format(date_k24); //���� �ð� �Լ� �ҷ�����
		System.out.printf("[�� ��]%s     POS:0011-9861\n", time1); // ���� �ð� ���
	}

	// ���� �ð� �Լ� 
	public static LocalDateTime TimeStemp_k24() {
		LocalDateTime now_k24 = LocalDateTime.now(); // ����ð� ���ϱ�
		return now_k24; // ����ð� ��ȯ
	}

	// ��� �μ�
	public static void HeaderPrint_k24() {
		System.out.printf("-----------------------------------------\n"); // ���
		System.out.printf(" �� ǰ ��          ��  ��   ����   ��  ��\n"); // ���
	}


	//��ǰ��, �ܰ�, ����, �ݾ� �μ�
	public static void ItemPrint_k24(int i_k24) {
		
		String cc_k24 = cutString(itemname_k24[i_k24], 14); // 20�ڸ����� ���ڿ� 14�� cc_k24�� ����
		
		if (i_k24 % 5 == 0) { // i ������ 5�� �������� 0�̸� (5������ ���м� ���)
			System.out.printf("-----------------------------------------\n"); // ���
		}
		if (taxfree_k24[i_k24]) { // taxfree_k24�� true�̸� (�鼼 ��ǰ * ǥ��)
			System.out.printf("* %s%11s%3s%11s\n", cc_k24, df_k24.format(price_k24[i_k24]), amount_k24[i_k24],
					df_k24.format(price_k24[i_k24] * amount_k24[i_k24])); // ��ǰ�� �� *ǥ�� �� �ܰ�, ���� �ݾ� ���
		} else { // taxfree_k24�� false�̸� (���� ��ǰ ���� ǥ��)
			System.out.printf("  %s%11s%3s%11s\n", cc_k24, df_k24.format(price_k24[i_k24]), amount_k24[i_k24],
					df_k24.format(price_k24[i_k24] * amount_k24[i_k24])); // ��ǰ�� �� ���� ǥ�� �� �ܰ�, ���� �ݾ� ���
		}

	}

	public static void TotalPrint_k24() {

		// �� ǰ�� ������ ǰ���� ���̷� ����
		int totalamount_k24 = itemname_k24.length;

		int taxfreeTotalprice_k24 = 0;// �鼼��ǰ �� ���� ���� �� �ʱ�ȭ
		int taxedTotalprice_k24 = 0;// ������ǰ �� ���� ���� �� �ʱ�ȭ
		for (int i = 0; i < itemname_k24.length; i++) { // ǰ�� ������ŭ �ݺ�
			if (taxfree_k24[i]) {// i������ true�϶�(�鼼��ǰ �� ��)
				taxfreeTotalprice_k24 += price_k24[i] * amount_k24[i];// �� ���� ���ϱ�
			} else { // ������ǰ�϶�
				taxedTotalprice_k24 += price_k24[i] * amount_k24[i];// �� ���� ���ϱ�
			}
		}

		int totalprice_k24 = taxfreeTotalprice_k24 + taxedTotalprice_k24; // (�� �ݾ�)�հ� = �鼼��ǰ + ���� ������ǰ

		// �Һ��ڰ�(���İ���) = �������� + ����
		// �������� = ���� / ����(0.1) = ���� * 10
		// �Һ��ڰ�(���İ���) = ���� * 11.0
		int vat_k24 = (int) Math.ceil(taxedTotalprice_k24 / 11.0); // ���� = (���İ���/11.0)�� �ø��� ���� / �ΰ����� ������ �ø�
		int netTaxprice_k24 = taxedTotalprice_k24 - vat_k24; // ����������ǰ = ���İ��� - ����

		System.out.printf("\n               �� ǰ�� ����%14.14s\n", df_k24.format(totalamount_k24)); // �� ǰ�� ���� ���
		System.out.printf("            (*)�� ��  �� ǰ%14.14s\n", df_k24.format(taxfreeTotalprice_k24)); // �鼼��ǰ �հ� ���
		System.out.printf("               �� ��  �� ǰ%14.14s\n", df_k24.format(netTaxprice_k24)); // ����������ǰ ���
		System.out.printf("               ��   ��   ��%14.14s\n", df_k24.format(vat_k24)); // ���İ�����ǰ�� �ΰ��� ���
		System.out.printf("               ��        ��%14.14s\n", df_k24.format(totalprice_k24)); // �� �Һ��ڰ� ���
		System.out.printf("�� �� �� �� �� ��%24.24s\n", df_k24.format(totalprice_k24)); // �� �Һ��ڰ� ���
		System.out.printf("-----------------------------------------\n"); // ���
		System.out.printf("0012 KEB �ϳ�       541707**0484/35860658\n"); // ���
		System.out.printf("ī�����(IC)          �Ͻú� /%11s\n", df_k24.format(totalprice_k24));
		System.out.printf("-----------------------------------------\n"); // ���
		System.out.printf("           [�ż�������Ʈ ����]            \n"); // ���
		System.out.printf("ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.\n"); // ���
		System.out.printf("��ȸ�߻�����Ʈ     9350**9995%12.12s\n", df_k24.format(totalprice_k24 / 1000)); // ����Ʈ�� ���űݾ��� 0.1% ����
		System.out.printf("����(����)����Ʈ%12.12s(      5,473)\n", df_k24.format(totalprice_k24 / 1000 + 5473));// (����) ����Ʈ�� ���� ����Ʈ
		System.out.printf("*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.\n"); // ���
		System.out.printf("-----------------------------------------\n"); // ���
		System.out.printf("    ���űݾױ��� ���������ð� �ڵ��ο�    \n"); // ���
		System.out.printf("������ȣ :                       24��****\n"); // ���
		
		DateTimeFormatter date2_k24 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");// yyyy-MM-dd HH:mm:ss ���·� �������Ͽ� ����
		LocalDateTime dateTime_k24 = TimeStemp_k24().minusHours(2);// ���� �ð����� 2�ð� ��
		String time2 = dateTime_k24.format(date2_k24); // �ð� �Լ����� ��¥ �ҷ��� 
		
		System.out.printf("�����ð� :            %s\n",time2);
		System.out.printf("-----------------------------------------\n"); // ���
		System.out.printf("ĳ��:084599 ��00                     1150\n"); // ���
		
		DateTimeFormatter date3_k24 = DateTimeFormatter.ofPattern("yyyyMMdd");// yyyyMMdd ���·� �������Ͽ� ����
		String time3 = TimeStemp_k24().format(date3_k24); // �ð� �Լ����� ��¥ �ҷ��� 
		
		System.out.printf("       %s/00119861/%s/31\n",time3,totalprice_k24); // ���ڵ� ���.
																									// ���ó�¥/POS��ȣ/���űݾ�/
		
	}

	// ����Ʈ�� 2�� �ѱ��� ���Ե� ���� �� �ڸ��� �Լ�
	public static String cutString(String str_k24, int len_k24) {

		byte[] by_k24 = str_k24.getBytes();// ���ڿ��� ����Ʈ�� ��ȯ

		if (by_k24.length <= 14) { // ��ǰ���� 14���� ������
			str_k24 = new String(by_k24, 0, by_k24.length);// ���� ���̸�ŭ ���ڿ��� ��ȯ
			// ��ǰ�� �ڿ� ���� �־��ֱ�
			for (int i_k24 = by_k24.length; i_k24 < 14; i_k24++) {// ���� ���̺��� (���� �ϳ� �߰��ϱ� ������)13���� �ݺ�
				str_k24 = str_k24 + " "; // ���� �����Ǿ� �����
			}
			return str_k24;// ���� �߰��� ǰ�� ��ȯ
		} else { // ��ǰ���� ������ ����(14)���� ��� ���� �߶��ֱ�
			int count_k24 = 0;// ī��Ʈ ������ ���� ���� �� 0 �ʱ�ȭ
			try {
				for (int i_k24 = 0; i_k24 < len_k24; i_k24++) {// byte_k24�� ����(len_k24)��ŭ �ݺ�
					if ((by_k24[i_k24] & 0x80) == 0x80)// ǰ���� ����Ʈ�� �ѱ��� ����Ʈ�� �Ǻ�
						count_k24++; // �ѱ��� ���ڰ� ������ +1 ����
				}
				// ������ �ڸ����� �ѱ��� ������ �ɸ��� ���� ó���ϱ�
				// ������ ����Ʈ�� �ѱ��� ���� ����Ʈ�̰� �ѱ��� ������ Ȧ����(�ѱ� 2����Ʈ�ϱ�)
				if ((by_k24[len_k24 - 1] & 0x80) == 0x80 && (count_k24 % 2) == 1) {
					len_k24--; // ������ ����� �ȵǰ� ���ڿ��� ���̸� 1����Ʈ ����
					String str1_k24 = new String(by_k24, 0, len_k24) + " "; // ����Ʈ ���� ���鿡 ��ĭ ���
					return str1_k24;// ���� ���ڿ� ��ȯ
				}
			} catch (java.lang.ArrayIndexOutOfBoundsException e_k24) {// ����Ʈ �迭�� ���̰� 0 �����̸� ���� ó��
				System.out.println(e_k24);// ���� �޽��� �����
				return ""; // ""��ȯ
			}
			String str2_k24 = new String(by_k24, 0, len_k24);// byte_k24 �迭�� ���̸�ŭ ���ڿ��� ����
			return str2_k24; // ���ڿ� ��ȯ
		}
	}
}
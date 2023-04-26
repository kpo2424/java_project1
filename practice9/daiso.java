package practice9;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.text.ParseException;
import java.text.DecimalFormat;

public class daiso {

	public static void main(String[] args) {

		LocalDateTime now_k24 = LocalDateTime.now(); // �ý��ۻ��� ���� �ð� ���ϱ�
		LocalDateTime refundDate_k24 = now_k24.plusDays(14); // ���� �ð����� 14���� ���� �ð��� ���ϱ�
		// refundDate ������ String Ÿ���̱� ������ add�޼ҵ� ��� �Ұ�. ��� plusDays �޼ҵ� ����ؾ� ��
		String refundDateStr_k24 = refundDate_k24.format(DateTimeFormatter.ofPattern("MM��dd��"));// ���糯¥ + 2�� ���� �� ����

		System.out.printf(
				"            \"���ΰ���, ���̼�\"\n" + "(��)�Ƽ����̼�_�д缭����\n" + "��ȭ:031-702-6016\n"
						+ "����:���� ������ ���μ�ȯ�� 2748 (���)\n" + "��ǥ:������,��ȣ�� 213-81-52063 \n"
						+ "����:��⵵ ������ �д籸 �д��53���� 11 (������)\n" + "=========================================\n"
						+ "       �Һ����߽ɰ濵(CCM) �������\n" + "     ISO 9001 ǰ���濵�ý��� �������\n"
						+ "=========================================\n" + "      ��ȯ/ȯ�� 14��(%s)�̳�,\n",
				String.format(refundDateStr_k24));// ���糯¥ + 2�� ���� �� ���

		System.out.printf("(����)������, ����ī�� ���� �� ���Ը��忡�� ����\n" + "   ����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�\n" + "     üũī�� ��� �� �ִ� 7�� �ҿ�\n"
				+ "=========================================\n" + "[POS 1058231]         ");// ���

		String formatTime_k24 = now_k24.format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));// ����ð� �ҷ�����
		System.out.printf(formatTime_k24 + "\n");// yyyy.MM.dd HH:mm:ss ���·� ���

		System.out.printf("=========================================\n");// ���

		// ǰ��� ���� �迭 ���� �� �ʱ�ȭ
		String[] itemname_k24 = { "ǻ��� �����ܿ븶��ũ(�ְ����)", "�����̵�ĸ���(������)(100ȣ)", "�������� ���׸�����ũ(�˷�̴�Ÿ��)" };
		// �ݾ� ���� �迭 ���� �� �ʱ�ȭ
		int[] price_k24 = { 3000, 1000, 1000 };
		// ���� ���� �迭 ������ �� �ʱ�ȭ
		int[] amount_k24 = { 1, 1, 1 };
		// ǰ�� �ڵ� ���� �迭 ���� �� �ʱ�ȭ
		String[] itemcode1_k24 = { "1031615", "1008152", "1020800" };

		int taxedTotalprice_k24 = 0; // (�Һ��ڰ�)�Ǹ��հ� ���� �� �ʱ�ȭ
		for (int i = 0; i < itemname_k24.length; i++) { // ǰ���� ���̸�ŭ �ݺ�
			taxedTotalprice_k24 += price_k24[i] * amount_k24[i];// (ǰ�� �� �Ǹ��հ� = ���� * ����)�� �����Ͽ� ��ü �Ǹ��հ� ���ϱ�
		}

		DecimalFormat df_k24 = new DecimalFormat("###,###,###,###,###"); // �ݾ� ��½� ���� ����

		// �Һ��ڰ�(���İ���) = �������� + ����
		// �������� = ���� / ����(0.1) = ���� * 10
		// �Һ��ڰ�(���İ���) = ���� * 11.0
		int vat_k24 = (int) Math.ceil(taxedTotalprice_k24 / 11.0); // ���� = (���İ���/11.0)�� �ø��� ���� / �ΰ����� ������ �ø�
		int netTaxprice_k24 = taxedTotalprice_k24 - vat_k24; // ����������ǰ = ���İ��� - ����

		for (int i_k24 = 0; i_k24 < itemname_k24.length; i_k24++) { // ǰ��� ������ŭ �ݺ��Ͽ� ���
			String cc_k24 = cutString(itemname_k24[i_k24], 21); // 20�ڸ����� ���ڿ� 21�� cc_k24�� ����
			byte[] bb_k24 = cc_k24.getBytes(); // ���ڿ��� ����Ʈ�� ����ȯ(�ѱ��� ����Ʈ �� �����ֱ� ����)
			System.out.printf("%s%8s%4s%8s\n", cc_k24, df_k24.format(price_k24[i_k24]), amount_k24[i_k24],
					df_k24.format(price_k24[i_k24] * amount_k24[i_k24])); // ������ ���̱����� ǰ���� �߷��� ����
			System.out.printf("[%s]\n", itemcode1_k24[i_k24]); // ǰ�� �ڵ� ���
		}

		System.out.printf("             �����հ� %19.19s\n", df_k24.format(netTaxprice_k24)); // (�����ݾ�) �����հ� ���
		System.out.printf("               �ΰ��� %19.19s\n", df_k24.format(vat_k24)); // (����) �ΰ��� ���
		System.out.printf("-----------------------------------------\n"); // ���
		System.out.printf("�Ǹ��հ�%33.33s\n", df_k24.format(netTaxprice_k24 + vat_k24)); // (�Һ��ڰ�) �Ǹ��հ� ���
		System.out.printf("=========================================\n");// ���
		System.out.printf("�ſ�ī��%33.33s\n", df_k24.format(netTaxprice_k24 + vat_k24));
		System.out.printf("-----------------------------------------\n");// ���
		System.out.printf("�츮ī��                 538720**********\n");// ���
		System.out.printf("���ι�ȣ 77982843(0)  ���αݾ� %10.10s\n", df_k24.format(netTaxprice_k24 + vat_k24));
		System.out.printf("=========================================\n");// ���
		System.out.printf("  ��    %10s �д缭����\n", formatTime_k24);// ���� �ð� ���
		System.out.printf("��ǰ �� ��Ÿ ���� : 1522-4400\n" + "����� �� �����̼� ���� ���� : 1599-2211\n");// ���
		System.out.printf("-----------------------------------------\n");// ���
		System.out.printf("�� ���̼� ����� �� �Ǵ� Ȩ�������� ����\n�ϼż� ȸ������ �� �پ��� ������ ����������! ��");// ���
	}

	// ����Ʈ�� 2�� �ѱ��� ���Ե� ���ڼ� �ڸ��� �Լ�
	public static String cutString(String str_kopo24, int len_k24) {

		byte[] byte_k24 = str_kopo24.getBytes(); // ���ڿ��� ����Ʈ�� ��ȯ

		if (byte_k24.length <= 21) { // ��ǰ�� ����Ʈ�� ���̰� 21�����϶� �ڿ� ���� �����
			str_kopo24 = new String(byte_k24, 0, byte_k24.length); // ���� ���̸�ŭ ���ڿ��� ��ȯ
			// ��ǰ�� �ڿ� ���� �־��ֱ�
			for (int i_k24 = byte_k24.length; i_k24 < 21; i_k24++) { // ���� ���̺��� (���� �ϳ� �߰��ϱ� ������)20���� �ݺ�
				str_kopo24 = str_kopo24 + " "; // ���� �����Ǿ� �� 21�ڸ� ���� �����
			}
			return str_kopo24; // ���� �߰��� ǰ�� ��ȯ
		} else { // ������ ����(21)���� ��� ���� �߶��ֱ�
			int count_k24 = 0; // ī��Ʈ ������ ���� ���� �� 0 �ʱ�ȭ
			try {
				for (int i_k24 = 0; i_k24 < len_k24; i_k24++) { // byte_k24�� ����(len_k24)��ŭ �ݺ�
					if ((byte_k24[i_k24] & 0x80) == 0x80) // ǰ���� ����Ʈ�� �ѱ��� ����Ʈ�� �Ǻ�
						count_k24++; // �ѱ��� ���ڰ� ������ +1 ����
				} // �ѱ��� ���� ����

				// ������ �ڸ����� �ѱ��� ������ �ɸ��� ���� ó���ϱ�
				// ������ ����Ʈ�� �ѱ��� ���� ����Ʈ�̰� �ѱ��� ������ Ȧ����(�ѱ� 2����Ʈ�ϱ�)
				if ((byte_k24[len_k24 - 1] & 0x80) == 0x80 && (count_k24 % 2) == 1) {
					len_k24--; // ������ ����� �ȵǰ� ���ڿ��� ���̸� 1����Ʈ ����
					String str1_k24 = new String(byte_k24, 0, len_k24) + " "; // ����Ʈ ���� ���鿡 ��ĭ ���
					return str1_k24;// ���� ���ڿ� ��ȯ
				}
			} catch (java.lang.ArrayIndexOutOfBoundsException e_k24) { // ����Ʈ �迭�� ���̰� 0 �����̸� ���� ó��
				System.out.println(e_k24);// ���� �޽��� �����
				return ""; // ""��ȯ
			}
			String str2_k24 = new String(byte_k24, 0, len_k24);// byte_k24 �迭�� ���̸�ŭ ���ڿ��� ����
			return str2_k24; // ���ڿ� ��ȯ
		}
	}

}
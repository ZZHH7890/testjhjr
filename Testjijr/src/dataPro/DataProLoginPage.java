package dataPro;

import org.testng.annotations.DataProvider;

public class DataProLoginPage {

	// ��������ҳԪ�ء��������á�
	@DataProvider(name = "forget")
	public static Object[][] forgetTitle() {
		return new Object[][] { { "��������" } };
	}

	// �û�ע��ҳ����
	@DataProvider(name = "enroll")
	public static Object[][] enrollTitle() {
		return new Object[][] { { "ע���û� - ���ν���" } };
	}

	@DataProvider(name = "login")
	public static Object[][] loginData() {
		return new Object[][] {			
				{ "13714672761", "4717141888", "�û������������" },//���������
				{ "13714672791", "4717141888", "�û������������" },//���˻������붼����
				{ "13714672761", "4717141", "���ã�����һ" } };//���Գɹ���¼
	}
}

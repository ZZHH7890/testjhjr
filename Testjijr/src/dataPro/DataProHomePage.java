package dataPro;

import org.testng.annotations.DataProvider;

public class DataProHomePage {

	// ��¼ҳ����
	@DataProvider(name = "login")
	public static Object[][] loginTitle() {
		return new Object[][] { { "�û���¼ - ���ν���" } };
	}

	// ע��ҳ����
	@DataProvider(name = "enroll")
	public static Object[][] enrollTitle() {
		return new Object[][] { { "ע���û� - ���ν���" } };
	}

	// ��������ҳ����
	@DataProvider(name = "help")
	public static Object[][] helpTitle() {
		return new Object[][] { { "��������" } };
	}

	// �ͷ��绰
	@DataProvider(name = "phone")
	public static Object[][] servicePhone() {
		return new Object[][] { { "400-133-8998" } };
	}

	// ��ȫ����ҳ����
	@DataProvider(name = "security")
	public static Object[][] securityTitle() {
		return new Object[][] { { "��ȫ����" } };
	}

	// ����ָ��ҳ����
	@DataProvider(name = "guideLines")
	public static Object[][] guideLinesTitle() {
		return new Object[][] { { "����ָ�� - ���ν���" } };
	}

	// ��Ƽ�����
	@DataProvider(name = "calculator")
	public static Object[][] calculatorTitle() {
		return new Object[][] { { "Ͷ���ٱ����ж������棬�������Ͷ�ʣ������װ�׬Ǯ - ��������� - ���ν���" } };
	}

	// ��ۼ�����
	@DataProvider(name = "valuecalculator")
	public static Object[][] valueCalculatorTitle() {
		return new Object[][] { { "�㲻��ƣ��Ʋ����㡣�Ҹ����м��ν����������ˣ�ֻҪ�����ƣ�10����ҵ���۽����ǵ��������ţ�����ʲô����Ҳ�������ν�����Ͷ����ưɣ� - ��ۼ����� - ���ν���" } };
	}

}

package dataPro;

import org.testng.annotations.DataProvider;

public class DataProLoginPage {

	// 忘记密码页元素“密码重置”
	@DataProvider(name = "forget")
	public static Object[][] forgetTitle() {
		return new Object[][] { { "密码重置" } };
	}

	// 用户注册页标题
	@DataProvider(name = "enroll")
	public static Object[][] enrollTitle() {
		return new Object[][] { { "注册用户 - 几何金融" } };
	}

	@DataProvider(name = "login")
	public static Object[][] loginData() {
		return new Object[][] {			
				{ "13714672761", "4717141888", "用户名或密码错误！" },//测密码错误
				{ "13714672791", "4717141888", "用户名或密码错误！" },//测账户和密码都错误
				{ "13714672761", "4717141", "您好，张六一" } };//测试成功登录
	}
}

package dataPro;

import org.testng.annotations.DataProvider;

public class DataProHomePage {

	// 登录页标题
	@DataProvider(name = "login")
	public static Object[][] loginTitle() {
		return new Object[][] { { "用户登录 - 几何金融" } };
	}

	// 注册页标题
	@DataProvider(name = "enroll")
	public static Object[][] enrollTitle() {
		return new Object[][] { { "注册用户 - 几何金融" } };
	}

	// 帮助中心页标题
	@DataProvider(name = "help")
	public static Object[][] helpTitle() {
		return new Object[][] { { "关于我们" } };
	}

	// 客服电话
	@DataProvider(name = "phone")
	public static Object[][] servicePhone() {
		return new Object[][] { { "400-133-8998" } };
	}

	// 安全保障页标题
	@DataProvider(name = "security")
	public static Object[][] securityTitle() {
		return new Object[][] { { "安全保障" } };
	}

	// 新手指引页标题
	@DataProvider(name = "guideLines")
	public static Object[][] guideLinesTitle() {
		return new Object[][] { { "新手指引 - 几何金融" } };
	}

	// 理财计算器
	@DataProvider(name = "calculator")
	public static Object[][] calculatorTitle() {
		return new Object[][] { { "投多少本金，有多少收益，清清楚楚投资，明明白白赚钱 - 收益计算器 - 几何金融" } };
	}

	// 身价计算器
	@DataProvider(name = "valuecalculator")
	public static Object[][] valueCalculatorTitle() {
		return new Object[][] { { "你不理财，财不理你。我刚在有几何金融网测试了，只要坚持理财，10年后我的身价将暴涨到不敢相信，还等什么，你也快来几何金融网投资理财吧！ - 身价计算器 - 几何金融" } };
	}

}

public class NumberAnalyzerTest {
	public static void main(String[] args) {
		//创建对象
		//Class名字 object名字 = new constructor名字（变量）
		NumberAnalyzer a = new NumberAnalyzer(75377775);
		//对象调用方法
		System.out.println(a.countDigit(7));
	}
}
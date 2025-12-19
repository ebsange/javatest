public class NumberAnalyzer {
	//变量variable
	private int value;

	//constructor构造器
	public NumberAnalyzer (int newValue) {
		value = newValue;
	}

	//method方法
	public int countDigit(int num) {
		int count = 0;
		for (int t = value; t > 0; t /= 10){
			if (t % 10 == num) {
				count++;
			}
		}
		return count;
	}
}
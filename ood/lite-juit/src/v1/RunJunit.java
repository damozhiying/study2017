package v1;
/**
 * @author Create by tery007
 * @date   2017��9��1��
 *
 */
public class RunJunit {

	public static void main(String[] args) {
		TestCase tc1=new CalculatorTest("test1"){
			protected void runTest(){
				test1();
			}
		};
		TestCase tc2=new CalculatorTest("test2"){
			protected void runTest(){
				test2();
			}
		};
//		tc1.run();
//		tc2.run();
	}
}

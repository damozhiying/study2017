package v001v;
/**
 * @author Create by tery007
 * @date   2017��9��1��
 *
 *�������ڲ���ķ�ʽ�����һ��runTest()�������Է����ĳ�ͻ
 */
public class RunJunit {

	public static void main(String[] args) {
		TestCase tc1=new CalculatorTest("test1"){//�����ڲ��࣬������Ǽ̳���CalculatorTest�ģ�ֻ��Ϊ�˲���Ҫ����дһ���࣬���Բ����������ķ�ʽ
			protected void runTest(){//runTest()�����Ǽ̳���TestCase��
				test1();
			}
		};
		TestCase tc2=new CalculatorTest("test2"){
			protected void runTest(){
				test2();
			}
		};
		tc1.run();
		tc2.run();
	}
}

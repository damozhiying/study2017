package v001v;
/**
 * @author Create by tery007
 * @date   2017��9��1��
 *	һ��������
 */
public class Calculator {

	private int result=0;
	public void add(int a){
		result+=a;
	}
	public void substract(int b){
		result-=b;
	}
	public int getResult(){
		return result;
	}
}

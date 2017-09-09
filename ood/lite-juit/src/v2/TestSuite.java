package v2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * @author Create by tery007
 * @date   2017��9��1��
 *Composite���ģʽ�������߲��ù���һ�����Ƕ��������������
 */
public class TestSuite implements Test{

	private List<Test> list=new ArrayList<>();
	private String name;
	public TestSuite(String name){
		this.name=name;
	}
	public TestSuite(final Class<?> theClass){
		//�������಻��public�ģ��򷵻�
		if(!Modifier.isPublic(theClass.getModifiers())){
			return;
		}
		//��ȡ���췽��
		this.name=theClass.getName();
		Constructor<?> constructor=null;
		try {
			constructor=getConstructor(theClass);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		//��ȡ���������з���,�������ǵ����Ʒ��ڼ�����
		Vector<String> names=new Vector<>();
		Method[] methods=theClass.getDeclaredMethods();
		for(Method m: methods){
			addTestMethod(m,names,constructor);
		}
	}
	
	//�����������������Ĳ��Է����Ĳ���ʵ��
	private void addTestMethod(Method m, Vector<String> names, Constructor<?> constructor) {
		String methodName=m.getName();
		if(names.contains(methodName)){
			return;
		}
		if(isPublicTestMethod(m)){
			names.addElement(methodName);
			Test t;
			try {
				//���˹������Ϳ��Դ�������Ϊname��ʵ����
				t = (Test) constructor.newInstance(new Object[]{m.getName()});
				list.add(t);
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}else{
			if(isTestMethod(m)){
				addTest(warning("the method isn't public"+m.getName()));
			}
		}
		
	}
	private Test warning(final String msg) {
		return new TestCase("warning"){
			public void doRun(){
				fail(msg);
			}
		};
	}
	private boolean isPublicTestMethod(Method m) {
		return isTestMethod(m)&&isPublicMethod(m);
	}
	
	private boolean isPublicMethod(Method m) {
		return Modifier.isPublic(m.getModifiers());
	}
	//�޲Ρ��޷���ֵ����test��ͷ�ķ���
	private boolean isTestMethod(Method m) {
		Class<?> returnType=m.getReturnType();
		Class<?>[] parameterTypes=m.getParameterTypes();
		return returnType.equals(Void.TYPE)&&parameterTypes.length==0&&m.getName().startsWith("test");
	}
	//��������к���һ��String���͵Ĳ���
	private Constructor<?> getConstructor(Class<?> theClass) throws NoSuchMethodException, SecurityException {
		Class<?>[] parameterTypes={String.class};//���캯���еĲ���������ΪString
		return theClass.getConstructor(parameterTypes);
	}

	public void addTestCase(Class<?> clz){
		addTest(new TestSuite(clz));
	}
	public void addTest(Test testSuite) {
		list.add(testSuite);
	}
	@Override
	public int countTestCases() {
		int count=0;
		Iterator<Test> iter=list.iterator();
		while(iter.hasNext()){
			Test t=iter.next();
			count+=t.countTestCases();
		}
		return count;
	}
	@Override
	public void run(TestResult tr) {
		for(Iterator<Test> iter=list.iterator();iter.hasNext();){
			Test t=iter.next();
			t.run(tr);
		}
	}
}

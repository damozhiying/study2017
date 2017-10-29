package com.tery.edu.jvm.engine;

import com.tery.edu.jvm.loader.ClassFileLoader;

/**
 * @author Create by tery007
 * @date   2017��10��20��
 *
 */
public class LiteJVM {

	public void run(String[] classPaths, String classname) {
		ClassFileLoader loader=new ClassFileLoader();
		
		for(int i=0;i<classPaths.length;i++){
			loader.addClassPath(classPaths[i]);
		}
		MethodArea area = MethodArea.getInstance();//һ��jvmֻ��һ��������
		
		area.addClassLoader(loader);
		
		String className=classname.replace('.', '/');
		ExcutorEngine engine = new ExcutorEngine();
		engine.excute(area.getMainMethod(className));
	}

}

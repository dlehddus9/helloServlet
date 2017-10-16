package kr.ac.hansung.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logger {

	@Pointcut("execution(void kr.ac.hansung.spring.aop.*.sound()))")
	private void selectSound() { //signature
		
	}

	@Before("selectSound()")
	public void aboutToSound() {
		System.out.println("before advice: about to sound() ");

		// before advice의 메소드를 담당한다

	}
}

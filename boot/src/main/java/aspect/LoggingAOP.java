package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAOP {

    //특정한 메서드나 패키지등의 join point
    //com.kh.boot.controller 패키지 하위 클래스의 모든 메서드에 전부 적용하겠다고 지점을 설정
    @Pointcut("execution(* com.kh.boot.controller..*.*(..))")
    private void cut(){};

    //cut메서드가 실행되는 지점 이전에 before() 메서드 실행
    @Before("cut()")
    public void before(JoinPoint joinPoint){
        
    }
}

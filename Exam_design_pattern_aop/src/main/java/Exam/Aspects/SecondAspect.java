package Exam.Aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SecondAspect {

    @Pointcut("execution(* Main.Application.start(..))")
    public void pc1(){}

    @Around("pc1()")
    public void aroundMain(ProceedingJoinPoint joinPoint){
        System.out.println("This is before in second Aspect Using Around !!");
        try {
            joinPoint.proceed();
        }catch (Exception e){
            System.out.println(e.getMessage());
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        System.out.println("This is the After in second Aspect Using Around !!");
    }
}

package edu.nf.emptyproject.advisors;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(Ordered.HIGHEST_PRECEDENCE)
public class BenchmarkAspect {

    @Around("execution(* *..*Service.*(..))")
    public Object executeTime(ProceedingJoinPoint joinPoint) throws Throwable {
        // 开始时间
        long before = System.currentTimeMillis();
        // 执行原方法
        Object ret = joinPoint.proceed();
        // 结束时间
        long after = System.currentTimeMillis();
        // 输出耗费的时间
        System.out.printf("\n>>> 执行方法 [%s] 一共用了 %d ms\n\n\n", joinPoint.getSignature().getName(), after - before);

        return ret;
    }

}

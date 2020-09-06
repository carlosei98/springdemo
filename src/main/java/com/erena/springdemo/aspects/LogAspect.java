package com.erena.springdemo.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LogAspect {
    @Around("execution(* com.erena.springdemo.controller.TrabajadoresController.*(..))")
    public Object printLog(@org.jetbrains.annotations.NotNull ProceedingJoinPoint joinPoint) {
        Object o = null;
        log.info("Método: " + joinPoint.getSignature().getName());
        switch (joinPoint.getSignature().getName()) {
            case "insertar":
                log.info("Se va a insertar el trabajador: " + joinPoint.getArgs()[0].toString());
                break;
            case "getTrabajadores":
                log.info("Se van a obtener los trabajadores");
                break;
        }
        try {
            o = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return o;
    }
}

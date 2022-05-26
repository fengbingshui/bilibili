package com.zhu.handler;

import com.zhu.domain.JsonResponse;
import com.zhu.domain.exception.ConditionException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhutao
 * @Classname CommonGlobalExceptionHandler
 * @Description 全局异常处理器
 * @Date 2022/5/26 18:45
 * @Version V1.0
 */
@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CommonGlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public JsonResponse<String> commonExceptionHandler(HttpServletRequest httpRequest, Exception e){
        String errMsg = e.getMessage();
        if(e instanceof ConditionException){
            String errorCode = ((ConditionException) e).getCode();
            return new JsonResponse<>(errorCode,errMsg);
        }else {
            return new JsonResponse<>("500",errMsg);
        }
    }
}

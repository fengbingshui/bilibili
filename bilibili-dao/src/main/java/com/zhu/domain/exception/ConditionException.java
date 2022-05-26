package com.zhu.domain.exception;

/**
 * @author zhutao
 * @Classname ConditionException
 * @Description 异常实体类
 * @Date 2022/5/26 18:47
 * @Version V1.0
 */
public class ConditionException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private String code;

    public ConditionException(String code,String name){
        super(name);
        this.code = code;
    }

    public ConditionException(String name){
        super(name);
        code = "500";
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

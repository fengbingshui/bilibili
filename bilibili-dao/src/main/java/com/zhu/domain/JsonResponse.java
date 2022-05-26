package com.zhu.domain;

/**
 * @author zhutao
 * @Classname JsonResponse
 * @Description 返回类
 * @Date 2022/5/25 17:51
 * @Version V1.0
 */
public class JsonResponse<T> {
    private String message;
    private String code;
    private T result;

    public JsonResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public JsonResponse(T result) {
        this.result = result;
        message = "成功";
        code = "0";
    }

    public static JsonResponse<String> success() {
        return new JsonResponse<>(null);
    }

    public static JsonResponse<String> success(String message) {
        return new JsonResponse<>(message);
    }

    public static JsonResponse<String> fail() {
        return new JsonResponse<>("1", "失败");
    }

    public static JsonResponse<String> fail(String code, String message) {
        return new JsonResponse<>(code, message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}

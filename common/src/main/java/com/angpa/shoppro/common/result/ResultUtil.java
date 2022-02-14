
package com.angpa.shoppro.common.result;


import com.angpa.shoppro.common.exception.ExceptionCode;

public class ResultUtil {

    public static <T> Result<T> success() {
        return Result.<T>builder().withCode(200).build();
    }

    public static <T> Result<T> success(T data) {
        return Result.<T>builder().withCode(200).withData(data).build();
    }

    public static <T> Result<T> success(String msg, T data) {
        return Result.<T>builder().withCode(200).withMsg(msg).withData(data).build();
    }

    public static <T> Result<T> success(int code, T data) {
        return Result.<T>builder().withCode(code).withData(data).build();
    }

    public static <T> Result<T> failed() {
        return Result.<T>builder().withCode(500).build();
    }

    public static <T> Result<T> failed(String errMsg) {
        return Result.<T>builder().withCode(500).withMsg(errMsg).build();
    }

    public static <T> Result<T> failed(int code, T data) {
        return Result.<T>builder().withCode(code).withData(data).build();
    }

    public static <T> Result<T> failed(int code, T data, String errMsg) {
        return Result.<T>builder().withCode(code).withData(data).withMsg(errMsg).build();
    }

    public static <T> Result<T> failedWithMsg(int code, String errMsg) {
        return Result.<T>builder().withCode(code).withMsg(errMsg).build();
    }

    public static <T> Result<T> buildResult(ExceptionCode exceptionCode, T data) {
        return Result.<T>builder().withCode(exceptionCode.getCode()).withMsg(exceptionCode.getMessage()).withData(data).build();
    }
}

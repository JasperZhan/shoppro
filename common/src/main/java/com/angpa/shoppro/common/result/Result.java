package com.angpa.shoppro.common.result;

import com.angpa.shoppro.common.exception.ExceptionCode;

import java.io.Serializable;

/**
 * @author Jasper Zhan
 * @date 2022年02月03日 17:09
 */
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 6095433538316185017L;

    private int code;

    private String message;

    private T data;

    public Result() {
    }

    public Result(int code, String message, T data) {
        this.code = code;
        this.setMessage(message);
        this.data = data;
    }

    public Result(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public Result(int code, String message) {
        this.code = code;
        this.setMessage(message);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return this.code == 0  || this.code == 200;
    }

    @Override
    public String toString() {
        return "Result{" + "code=" + code + ", message='" + message + '\'' + ", data=" + data + '}';
    }

    public static <T> RestResultBuilder<T> builder() {
        return new RestResultBuilder<>();
    }

    public static final class RestResultBuilder<T> {

        private int code;

        private String message;

        private T data;

        private RestResultBuilder() {
        }

        public RestResultBuilder<T> withCode(int code) {
            this.code = code;
            return this;
        }

        public RestResultBuilder<T> withMsg(String errMsg) {
            this.message = errMsg;
            return this;
        }

        public RestResultBuilder<T> withData(T data) {
            this.data = data;
            return this;
        }

        public RestResultBuilder<T> withExceptionCode(ExceptionCode exceptionCode) {
            this.code = exceptionCode.getCode();
            this.message = exceptionCode.getMessage();
            return this;
        }

        public Result<T> build() {
            Result<T> restResult = new Result<>();
            restResult.setCode(code);
            restResult.setMessage(message);
            restResult.setData(data);
            return restResult;
        }
    }
}

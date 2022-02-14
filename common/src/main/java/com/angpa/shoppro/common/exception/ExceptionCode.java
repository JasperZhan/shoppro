package com.angpa.shoppro.common.exception;

/**
 * 异常错误码
 * 异常错误码为字符串类型，共 5 位，分成两个部分：异常产生来源+四位数字编号。
 * 异常产生来源分为 2/3/4，
 * 2 表示错误来源于用户，
 * 3 表示错误来源于当前系统，
 * 4 表示错误来源于第三方服务。
 *
 */
public enum ExceptionCode {

    /**
     * 未知错误
     */
    UnKnownException (10001, "未知异常"),

    /**
     * A0001 用户端异常
     * 一级宏观异常错误码
     */
    ClientException (20001, "用户端异常"),

    /**
     * A0100用户操作错误
     * 二级宏观异常错误码
     */
    OperationException (20100, "用户操作异常"),

    /**
     *
     */
    DataValidationException (20101, "用户数据校验异常"),
    /**
     * B0001 系统异常
     * 一级宏观异常错误码
     */
    SystemException (30001, "系统异常"),

    /**
     * C0001 第三方服务异常
     * 一级宏观异常错误码
     */
    ThirdPartyExcpetion (40001, "第三方服务异常");

    private final int code;
    private final String message;

    ExceptionCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode () {
        return this.code;
    }

    public String getMessage () {
        return this.message;
    }

}

package com.angpa.shoppro.common.advice;

import com.angpa.shoppro.common.exception.ExceptionCode;
import com.angpa.shoppro.common.result.Result;
import com.angpa.shoppro.common.result.ResultUtil;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;


/**
 * @author Jasper Zhan
 * @date 2022年02月03日 16:53
 */
@RestControllerAdvice
public class ExceptionAdvice {

    /**
     * 未知异常处理
     */
    @ExceptionHandler(value = Throwable.class)
    public Result<Map<String, String>> handler(Throwable e) {

        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("errMsg", e.getMessage());
        errorMap.put("cause", String.valueOf(e.getCause()));

        return ResultUtil.buildResult(ExceptionCode.UnKnownException, errorMap);

    }

    /**
     * 参数校验异常
     */
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public Result<Map<String, String>> handler(MethodArgumentNotValidException e) {

        Map<String, String> errorMap = new HashMap<>();

        e.getBindingResult().getFieldErrors().forEach(fieldError ->
                errorMap.put(fieldError.getField(), fieldError.getDefaultMessage()));

        return ResultUtil.buildResult(ExceptionCode.DataValidationException, errorMap);

    }

}

package com.angpa.shoppro.common.advice;

import com.alibaba.fastjson.JSON;
import com.angpa.shoppro.common.result.Result;
import com.angpa.shoppro.common.result.ResultUtil;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @author Jasper Zhan
 * @date 2022年02月03日 22:00
 */

@RestControllerAdvice
public class ResponseAdvice implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;
    }


    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        if (o == null) {
            return ResultUtil.failed();
        }
        if (o instanceof Result) {
            return o;
        }
        if (o instanceof String) {
            return JSON.toJSONString(ResultUtil.success(o));
        }
        if (o instanceof Boolean) {
            return Result.builder().withCode((boolean)o ? 200 : 500).build();
        }
        return ResultUtil.success(o);
    }
}

package cn.opm.vue_server_api.controller;

import cn.opm.vue_server_api.service.ex.BaseException;
import cn.opm.vue_server_api.util.JsonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandlerException {

    @ExceptionHandler(BaseException.class)
    public JsonResult<Void> handler(Exception e) {
        return new JsonResult<>(400, e.getMessage());
    }
}

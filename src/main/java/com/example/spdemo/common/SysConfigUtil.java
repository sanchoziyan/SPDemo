package com.example.spdemo.common;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 系统配置工具类
 */
@Component
public class SysConfigUtil {

    /**
     * 获取HttpServletRequest
     * @return
     */
    public HttpServletRequest getRequest(){
        ServletRequestAttributes sra = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = sra.getRequest();
        return request;
    }

}

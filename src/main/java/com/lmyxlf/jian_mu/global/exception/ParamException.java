package com.lmyxlf.jian_mu.global.exception;

/**
 * @author lmy
 * @email 2130546401@qq.com
 * @date 2024/7/6 17:32
 * @description 参数错误异常
 * @since 17
 */
public class ParamException extends RuntimeException {

    private String errMsg;

    public ParamException() {
        super();
    }

    /**
     * 构造方法
     *
     * @param errMsg 异常信息
     */
    public ParamException(String errMsg) {
        this.errMsg = errMsg;
    }


    public String getErrMsg() {
        return errMsg;
    }


}
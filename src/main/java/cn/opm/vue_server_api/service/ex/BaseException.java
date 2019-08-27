package cn.opm.vue_server_api.service.ex;

import java.io.Serializable;

/**
 * 异常基类
 */
public class BaseException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = -2263163912742454861L;

    public BaseException() {
        super();
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    protected BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

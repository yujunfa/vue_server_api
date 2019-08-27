package cn.opm.vue_server_api.service.ex;

/**
 * 用户数据插入异常
 */
public class InsertException extends BaseException{

    private static final long serialVersionUID = 6325303475738670019L;

    public InsertException() {
        super();
    }

    public InsertException(String message) {
        super(message);
    }

    public InsertException(String message, Throwable cause) {
        super(message, cause);
    }

    public InsertException(Throwable cause) {
        super(cause);
    }

    protected InsertException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

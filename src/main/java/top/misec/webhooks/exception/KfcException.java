package top.misec.webhooks.exception;

/**
 * @author moshi
 */
public class KfcException extends Exception {
    public KfcException(String msg) {
        super(msg);
    }

    public KfcException(Throwable ex) {
        super(ex);
    }

    public KfcException(String msg, Throwable ex) {
        super(msg, ex);
    }
}

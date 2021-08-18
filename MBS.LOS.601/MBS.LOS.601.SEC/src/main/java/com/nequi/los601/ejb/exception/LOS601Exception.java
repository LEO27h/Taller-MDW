/**
 * 
 */
package com.nequi.los601.ejb.exception;

/**
 *
 */
public class LOS601Exception extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 3551944729909835454L;

    /**
     * 
     */
    public LOS601Exception() {
    }

    /**
     * @param message
     */
    public LOS601Exception(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public LOS601Exception(Throwable cause) {
        super(cause);
    }

    /**
     * @param message
     * @param cause
     */
    public LOS601Exception(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */
    public LOS601Exception(String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}

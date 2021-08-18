/**
 * 
 */
package com.nequi.los601.ejb.exception;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nequi.los601.ejb.exception.LOS601Exception;

public class LOS601ExceptionTest {

    @Test
    public void testFIS617Exception() {
        LOS601Exception exception = new LOS601Exception();
        assertNotNull(exception);
    }

    @Test
    public void testFIS617ExceptionString() {
        LOS601Exception exception = new LOS601Exception("ErrorString");
        assertNotNull(exception);
    }

    @Test
    public void testFIS617ExceptionThrowable() {
        LOS601Exception exception = new LOS601Exception(new Exception());
        assertNotNull(exception);
    }

    @Test
    public void testFIS617ExceptionStringThrowable() {
        LOS601Exception exception = new LOS601Exception("ErrorStringThrowable",
                new Exception());
        assertNotNull(exception);
    }

    @Test
    public void testFIS617ExceptionStringThrowableBooleanBoolean() {
        LOS601Exception exception = new LOS601Exception("StringThrowableBooleanBoolean",
                new Exception(), Boolean.TRUE, Boolean.TRUE);
        assertNotNull(exception);
    }

}

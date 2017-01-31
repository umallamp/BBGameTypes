package edu.asu.wpcarey.exceptions;

/**
 * This class is a wrapper for all the exceptions created in the core package.
 */
public class BBCoreException extends Exception {

    public BBCoreException(String message, Throwable cause) {
        super (message, cause);
    }

    public BBCoreException(String message) {
        super(message);
    }
}

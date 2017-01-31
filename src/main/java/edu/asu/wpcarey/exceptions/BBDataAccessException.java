package edu.asu.wpcarey.exceptions;

/**
 * This class is a wrapper for all the exceptions created in the core package.
 */
public class BBDataAccessException extends Exception {

    public BBDataAccessException(String message, Throwable cause) {
        super (message, cause);
    }

    public BBDataAccessException(String message) {
        super(message);
    }
}

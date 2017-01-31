package edu.asu.wpcarey.exceptions;

/**
 * This class is a wrapper for the incorrect configuration or inputs passed to the core package.
 */
public class InvalidInputException extends Exception {

    public InvalidInputException(String message, Throwable cause) {
        super (message, cause);
    }

    public InvalidInputException(String message) {
        super(message);
    }
}

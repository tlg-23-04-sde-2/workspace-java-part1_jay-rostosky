package com.entertainment;

/*
 * Application-specific custom exception class - CHECKED EXCEPTION.
 */
public class InvalidVolumeException extends Exception {

    public InvalidVolumeException() {
        super();
    }

    public InvalidVolumeException(String message) {
        super(message);
    }

    public InvalidVolumeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidVolumeException(Throwable cause) {
        super(cause);
    }
}
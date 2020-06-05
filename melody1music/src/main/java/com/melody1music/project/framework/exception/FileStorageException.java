package com.melody1music.project.framework.exception;

public class FileStorageException extends RuntimeException {

	private static final long serialVersionUID = -1512620412152489998L;

	public FileStorageException(String message) {
        super(message);
    }

    public FileStorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
package com.venky.exception.handling.custom;

@SuppressWarnings("serial")
public class UncheckedCustomException extends RuntimeException {
	UncheckedCustomException(String message) {
		super(message);
	}

}

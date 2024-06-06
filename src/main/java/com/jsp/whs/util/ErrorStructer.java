package com.jsp.whs.util;

public class ErrorStructer<T> {
	
	private  int status;
	private String message;
	private T rootCause;
	
	
	public int getStatus() {
		return status;
	}
	public String getMessage() {
		return message;
	}
	public T getRootCause() {
		return rootCause;
	}
	public ErrorStructer<T> setStatus(int status) {
		this.status = status;
		return this;
	}
	public ErrorStructer<T> setMessage(String message) {
		this.message = message;
		return this;
	}
	public ErrorStructer<T> setRootCause(T rootCause) {
		this.rootCause = rootCause;
		return this;
	}

	
}

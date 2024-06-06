package com.jsp.whs.util;

public class ResponseStructer<T> {
	
	private int status;
	private String message;
	private T body;
	
	public int getStatus() {
		return status;
	}
	public String getMessage() {
		return message;
	}
	public T getBody() {
		return body;
	}
	public ResponseStructer<T> setStatus(int status) {
		this.status = status;
		return this;
	}
	public ResponseStructer<T> setMessage(String message) {
		this.message = message;
		return this;
	}
	public ResponseStructer<T> setBody(T body) {
		this.body = body;
		return this;
	}

	
}

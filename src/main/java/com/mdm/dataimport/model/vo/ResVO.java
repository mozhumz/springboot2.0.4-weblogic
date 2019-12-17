package com.mdm.dataimport.model.vo;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


public class ResVO<R> implements Serializable {

	private boolean status;
	private int code;
	private String message;
	private R data;
	private Map<String, Object> otherData = new HashMap();

	public ResVO() {
	}

	public static <R> ResVO<R> success(R data) {
		ResVO<R> response = new ResVO();
		response.status = true;
		response.data = data;
		return response;
	}

	public static <R> ResVO<R> successMessage(String message) {
		return message(true, message);
	}

	public static <R> ResVO<R> message(boolean status, String message) {
		ResVO<R> response = new ResVO();
		response.status = status;
		response.message = message;
		return response;
	}
	public static <R> ResVO<R> message(boolean status, String message,int code) {
		ResVO<R> response = new ResVO();
		response.status = status;
		response.message = message;
		response.code=code;
		return response;
	}

	public static <R> ResVO<R> failure(String message) {
		return message(false, message);
	}

	public static <R> ResVO<R> failure(int code,String message) {
		return message(false, message,code);
	}

	public ResVO<R> setOtherData(Map<String, Object> otherData) {
		this.otherData = otherData;
		return this;
	}

	public ResVO<R> addOtherData(String key, Object value) {
		this.otherData.put(key, value);
		return this;
	}

	public ResVO<R> removeOtherData(String key) {
		this.otherData.remove(key);
		return this;
	}

	public ResVO<R> setStatus(boolean status) {
		this.status = status;
		return this;
	}

	public ResVO<R> setCode(int code) {
		this.code = code;
		return this;
	}

	public ResVO<R> setMessage(String message) {
		this.message = message;
		return this;
	}

	public ResVO<R> setData(R data) {
		this.data = data;
		return this;
	}

	public boolean isStatus() {
		return this.status;
	}

	public int getCode() {
		return this.code;
	}

	public String getMessage() {
		return this.message;
	}

	public R getData() {
		return this.data;
	}

	public Map<String, Object> getOtherData() {
		return this.otherData;
	}
}


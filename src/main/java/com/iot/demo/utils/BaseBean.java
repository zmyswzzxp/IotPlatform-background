package com.iot.demo.utils;

import java.io.Serializable;

public class BaseBean implements Serializable{

	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	private Integer start;
	private Integer length;
}

package com.iot.demo.utils;

import java.io.Serializable;
import java.util.List;

public class PageBean<T>  implements Serializable{
	
private List<T> list;
private int allRow;
private int totalRow;

private int currentPage;

private int pageSize;

private int totalPage;

public int getTotalPage() {
	return totalPage;
}

public void setTotalPage(int totalPage) {
	this.totalPage = totalPage;
}

public List<T> getList() {
	return list;
}

public void setList(List<T> list) {
	this.list = list;
}

public int getAllRow() {
	return allRow;
}

public void setAllRow(int allRow) {
	this.allRow = allRow;
}

public int getTotalRow() {
	return totalRow;
}

public void setTotalRow(int totalRow) {
	this.totalRow = totalRow;
}

public int getCurrentPage() {
	return currentPage;
}

public void setCurrentPage(int currentPage) {
	this.currentPage = currentPage;
}

public int getPageSize() {
	return pageSize;
}

public void setPageSize(int pageSize) {
	this.pageSize = pageSize;
}

}

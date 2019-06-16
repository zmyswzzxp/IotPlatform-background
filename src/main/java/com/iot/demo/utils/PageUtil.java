package com.iot.demo.utils;

public class PageUtil {
	public static int countTotalPage(int allRow,int pageSize){
		return allRow %pageSize==0? allRow /pageSize:allRow /pageSize+1;
	}
	
	public static int countCurrentPage(int currentPage){
	return currentPage==0?1:currentPage;
	}
	
	public static int countStart(int pageSize,int currentPage){
		return pageSize*(currentPage-1);
	}

}

package com.sxt.renthouse.utils;

import java.io.Serializable;

/**
 * 
 * explain 分页工具类   
 * @author wenber
 * @date 2016年4月5日
 * @version v1.0
 *
 */
public class PageUtils implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 每页显示行数
	private Integer pageSize = 8;
	// 总行数
	private Integer rowCount;
	// 总页数
	private Integer pageCount;
	// 下一页
	private Integer nextPage;
	// 上一页
	private Integer prePage;
	// 第一页
	private Integer firstPage = 1;
	// 最后一页 总页数
	private Integer lastPage;
	// 当前页
	private Integer currentPage;
	// 当前页开始行数
	private Integer startRow;
	// 当前页结束行数
	private Integer endRow;

	
	/**
	 * 构造方法
	 * @param rowCount 总行数
	 * @param currentPage  当前页序号
	 */
	public PageUtils(Integer rowCount, Integer currentPage) {
		this.rowCount = rowCount;
		this.currentPage = currentPage;
		//判断总行数时不是每页显示的倍数
		if(rowCount%pageSize==0){
			pageCount=rowCount/pageSize;
		}else{
			//如果不是倍数，总页数等于整除后加一页
			pageCount=rowCount/pageSize+1;
		}
		
		//如果当前页小于或者等于零 将当前页赋值为1
		if(currentPage<=0){
			currentPage=1;
		//如果当前页大于总页数 将总页数赋值为总页数
		}else if(currentPage>=pageCount){
			currentPage=pageCount;
		}
		
		//如果当前页大于1并且当前页小于等于总页数，则上一页等于当前-1否则，上一页等于开始页
		if(currentPage>1&&currentPage<=pageCount){
			prePage=currentPage-1;
		}else{
			prePage=firstPage;
		}
		
		//给最后一页赋值
		lastPage=pageCount;
		//如果当前页大于0并且当前页小于总也数，则下一页等于当前页+1，否则下一页直接等于总页数
		if(currentPage>0&&currentPage<pageCount){
			nextPage=currentPage+1;
		}else{
			nextPage=pageCount;
		}
		
		//起始行(当前页-1)乘以每页总行数(仅适用于Mysql数据库)
		//startRow=(currentPage-1)*pageSize;
		//结束行(仅适用于Mysql数据库)
		//endRow=currentPage*pageSize-1;
		
		//起始行(当前页-1)乘以每页总行数(仅适用于Oracle数据库)
		startRow=(currentPage-1)*pageSize;
		//结束行(仅适用于Oracle数据库)
		endRow=currentPage*pageSize;
		
	}
	
	/**
	 * 重载的构造方法
	 * @param rowCount 总行数数
	 * @param currentPage 当前页序号(从1开始)
	 * @param pageSize 每页显示行数
	 */
	public PageUtils(Integer rowCount, Integer currentPage,Integer pageSize) {
		this.pageSize=pageSize;
		this.rowCount = rowCount;
		this.currentPage = currentPage;
		//判断总行数时不是每页显示的倍数
		if(rowCount%pageSize==0){
			pageCount=rowCount/pageSize;
		}else{
			//如果不是倍数，总页数等于整除后加一页
			pageCount=rowCount/pageSize+1;
		}
		
		//如果当前页小于或者等于零 将当前页赋值为1
		if(currentPage<=0){
			currentPage=1;
		//如果当前页大于总页数 将总页数赋值为总页数
		}else if(currentPage>=pageCount){
			currentPage=pageCount;
		}
		
		//如果当前页大于1并且当前页小于等于总页数，则上一页等于当前-1否则，上一页等于开始页
		if(currentPage>1&&currentPage<=pageCount){
			prePage=currentPage-1;
		}else{
			prePage=firstPage;
		}
		
		//给最后一页赋值
		lastPage=pageCount;
		//如果当前页大于0并且当前页小于总也数，则下一页等于当前页+1，否则下一页直接等于总页数
		if(currentPage>0&&currentPage<pageCount){
			nextPage=currentPage+1;
		}else{
			nextPage=pageCount;
		}
		
		//起始行(当前页-1)乘以每页总行数(仅适用于Mysql数据库)
		startRow=(currentPage-1)*pageSize;
		//结束行(仅适用于Mysql数据库)
		endRow=currentPage*pageSize-1;
		
		//起始行(当前页-1)乘以每页总行数(仅适用于Oracle数据库)
		//startRow=(currentPage-1)*pageSize+1;
		//结束行(仅适用于Oracle数据库)
		//endRow=currentPage*pageSize;
		
	}


	// 获取当前页的开始行数
	public Integer getStartRow() {
		return startRow;
	}
	//设置当前页开始行数
	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getRowCount() {
		return rowCount;
	}

	public void setRowCount(Integer rowCount) {
		this.rowCount = rowCount;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Integer getNextPage() {
		return nextPage;
	}

	public void setNextPage(Integer nextPage) {
		this.nextPage = nextPage;
	}

	public Integer getPrePage() {
		return prePage;
	}

	public void setPrePage(Integer prePage) {
		this.prePage = prePage;
	}

	public Integer getFirstPage() {
		return firstPage;
	}

	public void setFirstPage(Integer firstPage) {
		this.firstPage = firstPage;
	}

	public Integer getLastPage() {
		return lastPage;
	}

	public void setLastPage(Integer lastPage) {
		this.lastPage = lastPage;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getEndRow() {
		return endRow;
	}

	public void setEndRow(Integer endRow) {
		this.endRow = endRow;
	}

	

}

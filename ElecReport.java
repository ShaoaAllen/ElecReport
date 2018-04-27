package com.pojo;

public class ElecReport {
	
	private String id;
	private String shipCode; // 船舶硬件号
	private String shipName; //船名
	private String startTime;// 起始时间
	private String endTime; // 结束时间
	private String dockName;//码头名称
	private String insertDate;// 记录写入系统时间
	private String visitorCount;//游客数量
	
	private String sljg; // 受理机构
	private String ydgk; // 预抵港口
	private String tkbw;// 停靠泊位
	private String ydsj; // 预抵时间
	private String qcs;// 前吃水
	private String hcs;// 后吃水
	private String hcrb;// 航次日报      是    否

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}

	public String getDockName() {
		return dockName;
	}

	public void setDockName(String dockName) {
		this.dockName = dockName;
	}


	public String getVisitorCount() {
		return visitorCount;
	}

	public void setVisitorCount(String visitorCount) {
		this.visitorCount = visitorCount;
	}

	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getShipCode() {
		return shipCode;
	}

	public void setShipCode(String shipCode) {
		this.shipCode = shipCode;
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public String getSljg() {
		return sljg;
	}

	public void setSljg(String sljg) {
		this.sljg = sljg;
	}

	public String getYdgk() {
		return ydgk;
	}

	public void setYdgk(String ydgk) {
		this.ydgk = ydgk;
	}

	public String getTkbw() {
		return tkbw;
	}

	public void setTkbw(String tkbw) {
		this.tkbw = tkbw;
	}

	public String getYdsj() {
		return ydsj;
	}

	public void setYdsj(String ydsj) {
		this.ydsj = ydsj;
	}

	public String getQcs() {
		return qcs;
	}

	public void setQcs(String qcs) {
		this.qcs = qcs;
	}

	public String getHcs() {
		return hcs;
	}

	public void setHcs(String hcs) {
		this.hcs = hcs;
	}

	public String getHcrb() {
		return hcrb;
	}

	public void setHcrb(String hcrb) {
		this.hcrb = hcrb;
	}

}

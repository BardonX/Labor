package com.labor.domain;

import java.io.Serializable;
import java.sql.Date;

public class T_notice implements Serializable {

	private static final long serialVersionUID = 1L;

	private int notice_id;
	private int course_id;
	private String notice_contrent;
	private Date notice_uploadTime;
	private Date notice_updateTime;
	private String notice_uploader;
	private String notice_regenerator;
	private String eg1;
	private String eg2;
	private String eg3;
	private String eg4;
	public int getNotice_id() {
		return notice_id;
	}
	public void setNotice_id(int notice_id) {
		this.notice_id = notice_id;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getNotice_contrent() {
		return notice_contrent;
	}
	public void setNotice_contrent(String notice_contrent) {
		this.notice_contrent = notice_contrent;
	}
	public Date getNotice_uploadTime() {
		return notice_uploadTime;
	}
	public void setNotice_uploadTime(Date notice_uploadTime) {
		this.notice_uploadTime = notice_uploadTime;
	}
	public Date getnotice_updateTime() {
		return notice_updateTime;
	}
	public void setNotice_updateTime(Date notice_updateTime) {
		this.notice_updateTime = notice_updateTime;
	}
	public String getNotice_uploader() {
		return notice_uploader;
	}
	public void setNotice_uploader(String notice_uploader) {
		this.notice_uploader = notice_uploader;
	}
	public String getNotice_regenerator() {
		return notice_regenerator;
	}
	public void setNotice_regenerator(String notice_regenerator) {
		this.notice_regenerator = notice_regenerator;
	}
	public String getEg1() {
		return eg1;
	}
	public void setEg1(String eg1) {
		this.eg1 = eg1;
	}
	public String getEg2() {
		return eg2;
	}
	public void setEg2(String eg2) {
		this.eg2 = eg2;
	}
	public String getEg3() {
		return eg3;
	}
	public void setEg3(String eg3) {
		this.eg3 = eg3;
	}
	public String getEg4() {
		return eg4;
	}
	public void setEg4(String eg4) {
		this.eg4 = eg4;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "T_notice [notice_id=" + notice_id + ", course_id=" + course_id
				+ ", notice_contrent=" + notice_contrent
				+ ", notice_uploadTime=" + notice_uploadTime
				+ ", notice_uploadeTime=" + notice_updateTime
				+ ", notice_uploader=" + notice_uploader
				+ ", notice_regenerator=" + notice_regenerator + ", eg1=" + eg1
				+ ", eg2=" + eg2 + ", eg3=" + eg3 + ", eg4=" + eg4 + "]";
	}
	
	
	
}


package com.labor.domain;

import java.io.Serializable;
import java.sql.Date;

public class T_student implements Serializable {

	private static final long serialVersionUID = 1L;
	private int student_id;
	private String student_name;
	private String student_sex;
	private int student_age;
	private String student_phone;
	private String student_email;
	//数据库类型为money
	private int student_money;
	private Date student_date;
	private String eg1;
	private String eg2;	
	private String eg3;
	private String eg4;
	private int parents_id;
	public int getParents_id() {
		return parents_id;
	}
	public void setParents_id(int parents_id) {
		this.parents_id = parents_id;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_sex() {
		return student_sex;
	}
	public void setStudent_sex(String student_sex) {
		this.student_sex = student_sex;
	}
	public int getStudent_age() {
		return student_age;
	}
	public void setStudent_age(int student_age) {
		this.student_age = student_age;
	}
	public String getStudent_phone() {
		return student_phone;
	}
	public void setStudent_phone(String student_phone) {
		this.student_phone = student_phone;
	}
	public String getStudent_email() {
		return student_email;
	}
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}
	public int getStudent_money() {
		return student_money;
	}
	public void setStudent_money(int student_money) {
		this.student_money = student_money;
	}
	public Date getStudent_date() {
		return student_date;
	}
	public void setStudent_date(Date student_date) {
		this.student_date = student_date;
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
	
	

}

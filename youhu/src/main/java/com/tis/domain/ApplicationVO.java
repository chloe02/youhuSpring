package com.tis.domain;

import lombok.Data;

@Data
public class ApplicationVO {
	
	private int aidx;
	private String name;
	private int sex;
	private String birth;
	private String tel;
	private String post;
	private String addr1;
	private String addr2;
	private String contents;
	private java.sql.Date wdate;
	private int midx;
	private int downcg_code;
	 
	
	public String getAllAddr() {
		return "["+post+"]"+addr1+addr2;
	}
}

package com.tis.domain;

import lombok.Data;

@Data
public class BoardVO {
	
	private int bidx;
	private String subject;
	private String name;
	private String contents;
	private java.sql.Date indate; 
	private int downcg_code;
	private int midx;
	
}

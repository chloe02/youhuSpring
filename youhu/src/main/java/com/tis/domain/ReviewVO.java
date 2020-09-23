package com.tis.domain;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class ReviewVO {
	
	private int ridx;
	private String subject;
	private String name;
	private String content;
	private Timestamp indate;
	private String image1;
	private String image2;
	private int downcg_code;
	private int midx;
	
	
	public ReviewVO() {
		
	}
	
	public ReviewVO(int ridx, String subject, String name, String content, Timestamp indate, String image1,
			String image2, int downcg_code, int midx) {
		super();
		this.ridx = ridx;
		this.subject = subject;
		this.name = name;
		this.content = content;
		this.indate = indate;
		this.image1 = image1;
		this.image2 = image2;
		this.downcg_code = downcg_code;
		this.midx = midx;
	}

	
}

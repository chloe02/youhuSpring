package com.tis.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class ShelterDTO implements Serializable {

	private String careNm; //보호센터 센터명
	private int care_reg_no; //보호센터 등록번호
	
	private String careAddr; //보호센터 주소(도로명)
	private Timestamp weekOprStime; //평일 운영 시작시간
	private Timestamp weekOprEStime; //운영 종료시간
	private String closeDay; //휴무일
	private int vetPersonCnt; //수의사 수
	private int medicalCnt; //진료실 수
	private int careTel; //연락처
	
	
	public ShelterDTO() {}
	
	public ShelterDTO(String careNm, String careAddr, int careTel) {
		super();
		this.careNm=careNm;
		this.careAddr=careAddr;
		this.careTel=careTel;
	}

	public ShelterDTO(String careNm, int care_reg_no,String careAddr, Timestamp weekOprStime, Timestamp weekOprEStime, String closeDay,
			int vetPersonCnt, int medicalCnt, int careTel) {
		super();
		this.careNm = careNm;
		this.care_reg_no=care_reg_no;
		this.careAddr = careAddr;
		this.weekOprStime = weekOprStime;
		this.weekOprEStime = weekOprEStime;
		this.closeDay = closeDay;
		this.vetPersonCnt = vetPersonCnt;
		this.medicalCnt = medicalCnt;
		this.careTel = careTel;
	}

	public String getCareNm() {
		return careNm;
	}

	public void setCareNm(String careNm) {
		this.careNm = careNm;
	}
	
	public int getCare_reg_no() {
		return care_reg_no;
	}

	public void setCare_reg_no(int care_reg_no) {
		this.care_reg_no = care_reg_no;
	}

	public String getCareAddr() {
		return careAddr;
	}

	public void setCareAddr(String careAddr) {
		this.careAddr = careAddr;
	}

	public Timestamp getWeekOprStime() {
		return weekOprStime;
	}

	public void setWeekOprStime(Timestamp weekOprStime) {
		this.weekOprStime = weekOprStime;
	}

	public Timestamp getWeekOprEStime() {
		return weekOprEStime;
	}

	public void setWeekOprEStime(Timestamp weekOprEStime) {
		this.weekOprEStime = weekOprEStime;
	}

	public String getCloseDay() {
		return closeDay;
	}

	public void setCloseDay(String closeDay) {
		this.closeDay = closeDay;
	}

	public int getVetPersonCnt() {
		return vetPersonCnt;
	}

	public void setVetPersonCnt(int vetPersonCnt) {
		this.vetPersonCnt = vetPersonCnt;
	}

	public int getMedicalCnt() {
		return medicalCnt;
	}

	public void setMedicalCnt(int medicalCnt) {
		this.medicalCnt = medicalCnt;
	}

	public int getCareTel() {
		return careTel;
	}

	public void setCareTel(int careTel) {
		this.careTel = careTel;
	}
	
	
	
}

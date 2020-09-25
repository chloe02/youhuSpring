package com.tis.youhu;
//Action인터페이스를 상속받는 
//추상 클래스 : execute() 추상 메소드를 상속 받아 가지고 있음.
abstract public class AbstractAction implements Action{
	
	private String viewPage; //보여줄 뷰 페이지
	private boolean isRedirect=false; //페이지 이동방식에 따라 redirect이면 true, forward방식이면 false
	
	public String getViewPage() {
		return viewPage;
	}
	public void setViewPage(String viewPage) {
		this.viewPage = viewPage;
	}
	public boolean isRedirect() {
		return isRedirect;
	}
	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}
	
	//setter, getter
	
	
}

package com.tis.youhu;
//Action�������̽��� ��ӹ޴� 
//�߻� Ŭ���� : execute() �߻� �޼ҵ带 ��� �޾� ������ ����.
abstract public class AbstractAction implements Action{
	
	private String viewPage; //������ �� ������
	private boolean isRedirect=false; //������ �̵���Ŀ� ���� redirect�̸� true, forward����̸� false
	
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

package hrsystem.action.base;

import com.opensymphony.xwork2.ActionSupport;

import hrsystem.service.EmpManager;


public class EmpBaseAction extends ActionSupport
{
	// ������ҵ���߼����
	protected EmpManager mgr;
	// ����ע��ҵ���߼�����������setter����
	public void setEmpManager(EmpManager mgr)
	{
		this.mgr = mgr;
	}
}
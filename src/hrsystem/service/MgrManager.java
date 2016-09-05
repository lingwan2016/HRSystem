package hrsystem.service;

import hrsystem.vo.*;
import hrsystem.domain.*;
import hrsystem.exception.*;

import java.util.*;


public interface MgrManager
{
	
	void addEmp(Employee emp , String mgr)
		throws HrException;


	
	List<SalaryBean> getSalaryByMgr(String mgr);

	
	List<EmpBean> getEmpsByMgr(String mgr);

	
	List<AppBean> getAppsByMgr(String mgr);

	
	void check(int appid, String mgrName, boolean result);
}
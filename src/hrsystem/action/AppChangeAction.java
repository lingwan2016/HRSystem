package hrsystem.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import hrsystem.exception.HrException;
import hrsystem.action.base.EmpBaseAction;
import hrsystem.vo.*;

import java.util.*;
import java.text.SimpleDateFormat;


public class AppChangeAction extends EmpBaseAction
{
	// 封装所有异动的列表
	private List types;
	// types的setter和getter方法
	public void setTypes(List types)
	{
		this.types = types;
	}
	public List getTypes()
	{
		return this.types;
	}
	// 处理用户请求
	public String execute()
		throws Exception
	{
		setTypes(mgr.getAllType());
		return SUCCESS;
	}
}
package hrsystem.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import hrsystem.exception.HrException;
import hrsystem.domain.*;
import hrsystem.action.base.MgrBaseAction;


public class AddEmpAction extends MgrBaseAction
{
	// 代表新增员工的成员变量
	private Employee emp;

	// emp的setter和getter方法
	public void setEmp(Employee emp)
	{
		this.emp = emp;
	}
	public Employee getEmp()
	{
		return this.emp;
	}

	public String execute()
		throws Exception
	{
		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		// 获取HttpSession中的user属性
		String mgrName = (String)ctx.getSession()
			.get(WebConstant.USER);
		// 添加新用户
		mgr.addEmp(emp , mgrName);
		addActionMessage("新增员工成功");
		return SUCCESS;
	}
}
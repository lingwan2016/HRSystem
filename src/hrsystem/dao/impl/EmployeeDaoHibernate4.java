package hrsystem.dao.impl;

import java.util.*;

import hrsystem.domain.*;
import common.dao.impl.BaseDaoHibernate4;
import hrsystem.dao.*;


public class EmployeeDaoHibernate4 extends BaseDaoHibernate4<Employee>
	implements EmployeeDao
{
	
	public List<Employee> findByNameAndPass(Employee emp)
	{
		return find("select p from Employee p where p.name = ?0 and p.pass=?1"
			, emp.getName() , emp.getPass());
	}

	
	public Employee findByName(String name)
	{
		List<Employee> emps = find("select e from Employee e where e.name = ?0"
			, name);
		if (emps!= null && emps.size() >= 1)
		{
			return emps.get(0);
		}
		return null;
	}
}

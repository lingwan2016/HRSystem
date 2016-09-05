package hrsystem.dao.impl;

import java.util.*;

import hrsystem.domain.*;
import common.dao.impl.BaseDaoHibernate4;
import hrsystem.dao.*;


public class ApplicationDaoHibernate4 extends BaseDaoHibernate4<Application>
	implements ApplicationDao
{
	
	public List<Application> findByEmp(Employee emp)
	{
		return find("select a from Application as a where "
			+ "a.attend.employee=?0" , emp);
	}
}

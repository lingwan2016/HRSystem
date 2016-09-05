package hrsystem.dao.impl;

import java.util.*;
import java.text.*;

import hrsystem.domain.*;
import common.dao.impl.BaseDaoHibernate4;
import hrsystem.dao.*;


public class AttendDaoHibernate4 extends BaseDaoHibernate4<Attend>
	implements AttendDao
{
	
	public List<Attend> findByEmpAndMonth(Employee emp , String month)
	{
		return find("from Attend as a where a.employee=?0 " +
			"and substring(a.dutyDay , 0 , 7)=?1" , emp , month);
	}

	
	public List<Attend> findByEmpAndDutyDay(Employee emp
		, String dutyDay)
	{
		return find("from Attend as a where a.employee=?0 and "
			+ "a.dutyDay=?1" , emp , dutyDay);
	}

	
	public Attend findByEmpAndDutyDayAndCome(Employee emp ,
		String dutyDay , boolean isCome)
	{
		List<Attend> al = findByEmpAndDutyDay(emp , dutyDay);
		if (al != null || al.size() > 1)
		{
			for (Attend attend : al)
			{
				if (attend.getIsCome() == isCome )
				{
					return attend;
				}
			}
		}
		return null;
	}

	
	public List<Attend> findByEmpUnAttend(Employee emp
		, AttendType type)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		String end = sdf.format(c.getTime());
		c.add(Calendar.DAY_OF_MONTH, -3);
		String start = sdf.format(c.getTime());
		return find("from Attend as a where a.employee=?0 and "
			+ "a.type != ?1 and a.dutyDay between ?2 and ?3" ,
			emp , type , start , end);
	}
}

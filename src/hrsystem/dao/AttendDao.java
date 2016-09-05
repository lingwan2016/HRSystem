package hrsystem.dao;

import java.util.*;

import common.dao.BaseDao;
import hrsystem.domain.*;


public interface AttendDao extends BaseDao<Attend>
{
	
	List<Attend> findByEmpAndMonth(Employee emp , String month);

	
	List<Attend> findByEmpAndDutyDay(Employee emp
		, String dutyDay);

	
	Attend findByEmpAndDutyDayAndCome(Employee emp ,
		String dutyDay , boolean isCome);

	
	List<Attend> findByEmpUnAttend(Employee emp
		, AttendType type);
}

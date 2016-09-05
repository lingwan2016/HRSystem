package hrsystem.dao;

import java.util.*;

import common.dao.BaseDao;
import hrsystem.domain.*;


public interface EmployeeDao extends BaseDao<Employee>
{
	
	List<Employee> findByNameAndPass(Employee emp);

	
	Employee findByName(String name);
}

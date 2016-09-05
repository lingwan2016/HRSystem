package hrsystem.dao;

import java.util.*;

import common.dao.BaseDao;
import hrsystem.domain.*;


public interface ApplicationDao extends BaseDao<Application>
{
	
	List<Application> findByEmp(Employee emp);
}

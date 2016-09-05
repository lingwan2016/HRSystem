package hrsystem.dao;

import java.util.*;

import common.dao.BaseDao;
import hrsystem.domain.*;


public interface ManagerDao extends BaseDao<Manager>
{
	
	List<Manager> findByNameAndPass(Manager mgr);

	
	Manager findByName(String name);
}

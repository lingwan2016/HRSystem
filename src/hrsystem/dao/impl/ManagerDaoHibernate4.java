package hrsystem.dao.impl;

import java.util.*;

import hrsystem.domain.*;
import common.dao.impl.BaseDaoHibernate4;
import hrsystem.dao.*;


public class ManagerDaoHibernate4 extends BaseDaoHibernate4<Manager>
	implements ManagerDao
{
	
	public List<Manager> findByNameAndPass(Manager mgr)
	{
		return find("select m from Manager m where m.name = ?0 and m.pass=?1"
			, mgr.getName() , mgr.getPass());
	}

	
	public Manager findByName(String name)
	{
		List<Manager> ml = find("select m from Manager m where m.name=?0"
			, name);
		if (ml != null && ml.size() > 0)
		{
			return ml.get(0);
		}
		return null;
	}
}

package hrsystem.dao;

import java.util.List;

import common.dao.BaseDao;
import hrsystem.domain.Employee;
import hrsystem.domain.Payment;


public interface PaymentDao extends BaseDao<Payment>
{
	
	List<Payment> findByEmp(Employee emp);

	
	Payment findByMonthAndEmp(String payMonth , Employee emp);
}

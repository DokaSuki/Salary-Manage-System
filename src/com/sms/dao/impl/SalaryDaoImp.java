package com.sms.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sms.dao.ISalaryDao;
import com.sms.entity.Salary;

public class SalaryDaoImp implements ISalaryDao {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void addSalary(Salary salary) {
		getSession().save(salary);
	}

	@Override
	public void modifySalary(Salary salary) {
		getSession().clear();
		getSession().update(salary);
	}

	@Override
	public void deleteSalary(Salary salary) {
		getSession().clear();
		getSession().delete(salary);

	}

	@Override
	public Salary findSalaryById(Integer id) {
		Query query = getSession().createQuery("from Salary as s where s.id = ?");
		query.setString(0,id.toString());
		Salary s = (Salary)query.uniqueResult();
		return s;
	}

	@Override
	public List<Salary> findSalaryByEId(Integer eid) {
		Query query = getSession().createQuery("from Salary as s where s.eid = ?");
		query.setString(0,eid.toString());
		return (List<Salary>)query.list();
	}

	@Override
	public Salary findLastSalaryById(Integer eid) {
		Query query = getSession().createQuery("from Salary as s where s.eid = ? order by time desc");
		query.setString(0,eid.toString());
		return (Salary)query.list().get(0);
	}

}

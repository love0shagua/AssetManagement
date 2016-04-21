package com.dao.impl;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dao.IAssetClassDao;
import com.dao.IUserDao;

public class AssetClassDao extends HibernateDaoSupport implements IAssetClassDao {
	private SessionFactory sessionFactory;
	public SessionFactory getFactory() {

		return sessionFactory;//hibernate��SessionFactory������springע�룮
	}

	public void setFactory(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;//get/set������springע��ʱʹ��
	}
	
	public boolean addAssetClass(Object obj){
		
		try {
			this.getHibernateTemplate().save(obj);  
			return true;
		} catch (Exception e) {
			return false;
		}

	}

}

package com.dao.impl;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.SessionFactory;

import com.dao.IBaseDao;
import java.lang.reflect.ParameterizedType;
import java.util.List;



public class BaseDao<T> extends HibernateDaoSupport implements IBaseDao<T> {
	
	private SessionFactory sessionFactory;
	protected Class<T> entityClass;
	protected String className;
	
	public BaseDao(){
	         entityClass=(Class<T>)((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	         className=entityClass.getName();
	}
	public SessionFactory getFactory() {

		return sessionFactory;//hibernate��SessionFactory������springע�룮
	}

	public void setFactory(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;//get/set������springע��ʱʹ��
	}
	public T get(long id){
		return (T)this.getHibernateTemplate().get(entityClass, id);
			
	}
	public boolean create(T t){
		try {
		     this.getHibernateTemplate().save(t);
		     return true;
		} catch (Exception e) {
			// TODO: handle exception
		     return false;
		}
	 }
	 public boolean delete(T t){
		try {
		     this.getHibernateTemplate().delete(t);
		     return true;
		} catch (Exception e) {
			// TODO: handle exception
		     return false;
		}
	 }
	 public boolean update(T t){
		try {
		     this.getHibernateTemplate().update(t);
		     return true;
		} catch (Exception e) {
			// TODO: handle exception
		     return false;
		}
	 }
	 
	 public List<T> getAll(){
	     return (List<T>)this.getHibernateTemplate().find("from "+className+" as c order by c.id desc");
	 }
}

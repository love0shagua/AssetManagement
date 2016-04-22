package com.dao.impl;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.dao.IUserDao;
import com.entity.Userinformation;;

public class UserDao extends HibernateDaoSupport implements IUserDao {
	private SessionFactory sessionFactory;
	public SessionFactory getFactory() {

		return sessionFactory;//hibernate��SessionFactory������springע�룮
	}

	public void setFactory(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;//get/set������springע��ʱʹ��
	}
	
	public List getLoginUser(Integer userid,String userpwd){
		Object o[]={userid,userpwd};
		return this.getHibernateTemplate().find("select userinformation from Userinformation as userinformation where userinformation.userid=? and userinformation.userpwd=?",o);
		
	}
	
	  public boolean add(Object o) {  
        try {  
            this.getHibernateTemplate().save(o);  
            return true;  
        } catch (Exception e) {  
            return false;  
        }  
    }  
	  
	  public List getUserList() {
			
			return this.getHibernateTemplate().find("from Userinformation");
		}
	  
	  public Userinformation getUser(Integer userid) {
			
			return (Userinformation)this.getHibernateTemplate().get(Userinformation.class, userid);
		}
	 
	  public boolean saveOrUpdateUser(Object o) {  
		
	        try {  
	        	
	            this.getHibernateTemplate().saveOrUpdate(o); 
	            return true;  
	        } catch (Exception e) {  
	        	
	            return false;  
	        }  
	    }
	  public boolean deleteUser(Object o) {  
        try {  
            this.getHibernateTemplate().delete(o);  
            return true;  
        } catch (Exception e) {  
            return false;  
        }  
    }
}

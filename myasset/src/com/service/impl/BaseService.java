package com.service.impl;

import java.util.List;

import com.dao.IBaseDao;
import com.dao.IUserDao;
import com.entity.Userinformation;
import com.service.IBaseService;
import com.service.IUserService;

public class BaseService<T> implements IBaseService<T> {
	protected IBaseDao<T> dao; 
	
     public T get(long id){
         return dao.get(id);
     }
	     
     public boolean create(T obj){
         return dao.create(obj);
     }
	     
     public boolean delete(T obj){
    	 return dao.delete(obj);
     }
     
     public boolean update(T obj){
    	 return dao.update(obj);
	 }
	 
	 public List<T> getAll(){
	     return dao.getAll();
	 }
	     
     public void setDao(IBaseDao<T> dao) {
         this.dao = dao;
     }
}

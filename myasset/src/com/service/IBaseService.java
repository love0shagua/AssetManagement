package com.service;

import java.util.List;

import com.entity.Assetclass;
import com.entity.Userinformation;

public interface IBaseService<T> {
	public T get(long id);
	public boolean create(T obj);     
	public boolean delete(T obj);
	public boolean update(T obj);
	public List<T> getAll();
}

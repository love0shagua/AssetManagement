package com.dao;

import java.util.List;

import com.entity.Userinformation;

public interface IBaseDao<T> {
	public T get(long id);
	public boolean create(T t);
	public boolean delete(T t);
	public boolean update(T t);
	public List<T> getAll();
}

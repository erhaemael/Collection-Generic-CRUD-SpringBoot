package com.crud.generic.service.generic.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import com.crud.generic.entity.baseEntity.BaseEntity;
import com.crud.generic.repository.generic.GenericRepository;
import com.crud.generic.service.generic.ServiceGeneric;

public class ServiceGenericImpl<T extends BaseEntity> implements ServiceGeneric<T> {
	
	@Autowired
	protected GenericRepository<T> genericRepository;
	
	@Override
	public ArrayList<T> findAll() throws Exception {
		try {
			return (ArrayList<T>) genericRepository.findAll(); 
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public T getById(Long id) throws Exception  
	{  
		try {
			return genericRepository.findById(id).get();  
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public T save(T entity) throws Exception {
		try {
			return genericRepository.save(entity);
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public void delete(Long id) throws Exception {
		try {
			genericRepository.deleteById(id);
		} catch (Exception e) {
			throw e;
		}
	}

}

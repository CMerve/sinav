package com.merve.sinav.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.merve.sinav.dao.impl.OgrencilerDaoImpl;
import com.merve.sinav.service.impl.OgrencilerServiceImpl;
import com.merve.sinav.entity.Ogrenciler;

@Service
public class OgrencilerService implements OgrencilerServiceImpl {
	
	OgrencilerDaoImpl ogrencilerDaoImpl;

	@Autowired
	public OgrencilerService(OgrencilerDaoImpl ogrencilerDaoImpl) {
		super();
		this.ogrencilerDaoImpl = ogrencilerDaoImpl;
	}

	@Override
	@Transactional//aop özelliği
	public List<Ogrenciler> getAll() {
		return this.ogrencilerDaoImpl.getAll();
	}

	@Override
	@Transactional
	public void add(Ogrenciler ogrenciler) {
		//iş kodları yazılabilir taleplere göre
		this.ogrencilerDaoImpl.add(ogrenciler);
		
	}

	@Override
	@Transactional
	public void update(Ogrenciler ogrenciler) {
		this.ogrencilerDaoImpl.update(ogrenciler);
		
	}

	@Override
	@Transactional
	public void delete(Ogrenciler ogrenciler) {
		this.ogrencilerDaoImpl.delete(ogrenciler);
		
	}

	@Override
	@Transactional
	public Ogrenciler getByTc(String TC) {
		
		return this.ogrencilerDaoImpl.getByTc(TC);
	}
	
	
	
	
	

}

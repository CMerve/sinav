package com.merve.sinav.dao;
import java.util.List;

import javax.persistence.*;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.merve.sinav.dao.impl.OgrencilerDaoImpl;
import com.merve.sinav.entity.Ogrenciler;

@Repository
public class HibernateOgrencilerDao implements OgrencilerDaoImpl {

	//hibernate session ile iletişim kuracak sınıf
	private EntityManager entityManager;
		
	//session factorye otomatik enjekte eden anotasyon
	@Autowired
	public HibernateOgrencilerDao(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional //aop, unit of work tasarım deseni için session aç-kapa
	public List<Ogrenciler> getAll() {
		Session session=entityManager.unwrap(Session.class);
		@SuppressWarnings("unchecked")
		List<Ogrenciler> ogrenciler=session.createQuery("from Ogrenciler").getResultList();
		return ogrenciler;
		
	}

	@Override
	@Transactional
	public void add(Ogrenciler ogrenciler) {
		//var olan öğrenciyi kaydettirmeyecek iş kodunu yaz
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(ogrenciler);
		
		
	}

	@Override
	@Transactional
	public void update(Ogrenciler ogrenciler) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(ogrenciler);
	}

	@Override
	@Transactional
	public void delete(Ogrenciler ogrenciler) {
		Session session=entityManager.unwrap(Session.class);
		Ogrenciler ogrencilerDelete=session.get(Ogrenciler.class, ogrenciler.getOgrenciTc());
		session.delete(ogrencilerDelete);
	}

	@Override
	public Ogrenciler getByTc(String TC) {
		Session session=entityManager.unwrap(Session.class);
		Ogrenciler ogrenciler=session.get(Ogrenciler.class, TC);
		return ogrenciler;
	}

}

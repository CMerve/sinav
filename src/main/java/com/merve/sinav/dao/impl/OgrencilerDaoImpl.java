package com.merve.sinav.dao.impl;
import java.util.List;
import com.merve.sinav.entity.Ogrenciler;

public interface OgrencilerDaoImpl {
	
	//bütün öğrencileri listeler
	List<Ogrenciler> getAll();
	
	//öğrenci ekleme
	void add(Ogrenciler ogrenciler);
	
	//öğrenci güncelleme
	void update(Ogrenciler ogrenciler);
	
	//öğrenci silme
	void delete(Ogrenciler ogrenciler);
	
	//belli bir öğrenciyi listeleme
	Ogrenciler getByTc(String TC);

}

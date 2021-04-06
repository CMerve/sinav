package com.merve.sinav.service.impl;

import java.util.List;

import com.merve.sinav.entity.Ogrenciler;

public interface OgrencilerServiceImpl {
		//bütün öğrencileri listeler
		List<Ogrenciler> getAll();
		
		//öğrenci ekleme
		void add(Ogrenciler ogrenciler);
		
		//öğrenci güncelleme
		void update(Ogrenciler ogrenciler);
		
		//öğrenci silme
		void delete(Ogrenciler ogrenciler);

		Ogrenciler getByTc(String TC);
	

}

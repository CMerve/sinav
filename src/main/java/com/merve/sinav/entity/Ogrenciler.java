package com.merve.sinav.entity;

import javax.persistence.*;

@Entity
@Table(name="ogrenciler")
public class Ogrenciler {
	@Id
	@Column(name="ogrenci_tc",  length=11,unique = true, nullable = false)
	private String ogrenciTc;
	
	@Column(name="ogrenci_ad", length=20)
	private String ogrenciAd;
	
	@Column(name="ogrenci_soyad",length=20)
	private String ogrenciSoyad;
	
	@Column(name="ogrenci_baba_adi",  length=20)
	private String ogrenciBabaAdi;
	
	@Column(name="ogrenci_tel",  length=20)
	private String ogrenciTel;
	
	@Column(name="ogrenci_mail",  length=30)
	private String ogrenciMail;
	
	@Column(name="ogrenci_adres",  length=50)
	private String ogrenciAdres;
	
	@Column(name="ogrenci_sf",  length=20)
	private String ogrenciSf;

	public Ogrenciler(String ogrenciTc, String ogrenciAd, String ogrenciSoyad, String ogrenciBabaAdi, String ogrenciTel,
			String ogrenciMail, String ogrenciAdres, String ogrenciSf) {
		super();
		this.ogrenciTc = ogrenciTc;
		this.ogrenciAd = ogrenciAd;
		this.ogrenciSoyad = ogrenciSoyad;
		this.ogrenciBabaAdi = ogrenciBabaAdi;
		this.ogrenciTel = ogrenciTel;
		this.ogrenciMail = ogrenciMail;
		this.ogrenciAdres = ogrenciAdres;
		this.ogrenciSf = ogrenciSf;
	}

	public Ogrenciler() {
		
	}

	public String getOgrenciTc() {
		return ogrenciTc;
	}

	public void setOgrenciTc(String ogrenciTc) {
		this.ogrenciTc = ogrenciTc;
	}

	public String getOgrenciAd() {
		return ogrenciAd;
	}

	public void setOgrenciAd(String ogrenciAd) {
		this.ogrenciAd = ogrenciAd;
	}

	public String getOgrenciSoyad() {
		return ogrenciSoyad;
	}

	public void setOgrenciSoyad(String ogrenciSoyad) {
		this.ogrenciSoyad = ogrenciSoyad;
	}

	public String getOgrenciBabaAdi() {
		return ogrenciBabaAdi;
	}

	public void setOgrenciBabaAdi(String ogrenciBabaAdi) {
		this.ogrenciBabaAdi = ogrenciBabaAdi;
	}

	public String getOgrenciTel() {
		return ogrenciTel;
	}

	public void setOgrenciTel(String ogrenciTel) {
		this.ogrenciTel = ogrenciTel;
	}

	public String getOgrenciMail() {
		return ogrenciMail;
	}

	public void setOgrenciMail(String ogrenciMail) {
		this.ogrenciMail = ogrenciMail;
	}

	public String getOgrenciAdres() {
		return ogrenciAdres;
	}

	public void setOgrenciAdres(String ogrenciAdres) {
		this.ogrenciAdres = ogrenciAdres;
	}

	public String getOgrenciSf() {
		return ogrenciSf;
	}

	public void setOgrenciSf(String ogrenciSf) {
		this.ogrenciSf = ogrenciSf;
	}
	
	
	

}

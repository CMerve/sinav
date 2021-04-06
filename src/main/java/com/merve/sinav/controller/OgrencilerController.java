package com.merve.sinav.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.merve.sinav.entity.Ogrenciler;
import com.merve.sinav.service.impl.OgrencilerServiceImpl;

@RestController
@RequestMapping("/api")
public class OgrencilerController {
	private OgrencilerServiceImpl ogrencilerServiceImpl;

	@Autowired
	public OgrencilerController(OgrencilerServiceImpl ogrencilerServiceImpl) {
		this.ogrencilerServiceImpl = ogrencilerServiceImpl;
	}
	
	@GetMapping("/ogrenciler")
	public List<Ogrenciler> get()
	{
		return ogrencilerServiceImpl.getAll();	
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Ogrenciler ogrenciler)
	{
		ogrencilerServiceImpl.add(ogrenciler);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Ogrenciler ogrenciler)
	{
		ogrencilerServiceImpl.update(ogrenciler);
	}
	@PostMapping("/delete")
	public void delete(@RequestBody Ogrenciler ogrenciler)
	{
		ogrencilerServiceImpl.delete(ogrenciler);
	}
	
	@GetMapping("/ogrenciler/{TC}")
	public Ogrenciler getByTc(@PathVariable String TC)
	{
		return ogrencilerServiceImpl.getByTc(TC);	
	}

}

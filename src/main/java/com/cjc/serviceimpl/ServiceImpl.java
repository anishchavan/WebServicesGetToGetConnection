package com.cjc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.homerepository.HomeRepository;
import com.cjc.model.Karvenagar;
import com.cjc.servicei.ServiceI;

@Service
public class ServiceImpl implements ServiceI {
	@Autowired
	HomeRepository hr; 
	@Override
	public Karvenagar saveData(Karvenagar kn) {
		
		return hr.save(kn);
	}
	@Override
	public List<Karvenagar> displayData() {
		
		return (List<Karvenagar>) hr.findAll();
	}
	@Override
	public List<Karvenagar> getByAddress(String address) {
		
		return hr.findByAddress(address);
	}

}

package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Karvenagar;
import com.cjc.servicei.ServiceI;

@RestController
public class HomeController {
	@Autowired
	ServiceI si;
	@PostMapping("/postdata")
	public Karvenagar postData(@RequestBody Karvenagar kn) {
		Karvenagar karvenagar = si.saveData(kn);
		return karvenagar;
	}
	
	@GetMapping("/getdata")
	public List<Karvenagar> getData(){
		List<Karvenagar> list = si.displayData();
		return list;
	}
	
	@GetMapping("/getbyaddress/{address}")
	public List<Karvenagar> getByAddress(@PathVariable String address){
		List<Karvenagar> list = si.getByAddress(address);
		return list;
	}
	
}

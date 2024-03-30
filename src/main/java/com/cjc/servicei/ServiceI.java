package com.cjc.servicei;

import java.util.List;

import com.cjc.model.Karvenagar;

public interface ServiceI {

	Karvenagar saveData(Karvenagar kn);

	List<Karvenagar> displayData();

	List<Karvenagar> getByAddress(String address);

}

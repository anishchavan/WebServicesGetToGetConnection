package com.cjc.homerepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Karvenagar;

@Repository
public interface HomeRepository extends CrudRepository<Karvenagar, Integer>{

	List<Karvenagar> findByAddress(String address);

}

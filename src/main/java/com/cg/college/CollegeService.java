package com.cg.college;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CollegeService {

	@Autowired
	private CollegeRepository repo;
	
	public List<College> listAll(){
		return repo.findAll();
	}
	
	public College get(Integer id) {
		return repo.findById(id).get();
	}
	
	public void save(College college) {
		repo.save(college);
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}

package com.iut.julien;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GeekService {
	@Autowired
	GeekDAO dao;
	
	public List<Geek> listage() {
		return dao.findAll();
	}
	
	public Geek findById(int id) {
		return dao.findById(id);
	}
	
	public Geek cree(Geek nouveauGeek) {
		dao.persist(nouveauGeek);
		return nouveauGeek;
	}
}

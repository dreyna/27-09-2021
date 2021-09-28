package com.example.repaso2709.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repaso2709.model.Facultad;
import com.example.repaso2709.repository.FacultadRepository;
import com.example.repaso2709.service.FacultadService;
@Service
public class FacultadServiceImpl implements FacultadService{

	@Autowired
	private FacultadRepository facultadRepository;
	@Override
	public Facultad create(Facultad f) {
		// TODO Auto-generated method stub
		return facultadRepository.save(f);
	}

	@Override
	public Facultad update(Facultad f) {
		// TODO Auto-generated method stub
		return facultadRepository.save(f);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		facultadRepository.deleteById(id);
	}

	@Override
	public Facultad read(Long id) {
		// TODO Auto-generated method stub
		return facultadRepository.findById(id).get();
	}

	@Override
	public List<Facultad> readAll() {
		// TODO Auto-generated method stub
		return facultadRepository.findAll();
	}

}

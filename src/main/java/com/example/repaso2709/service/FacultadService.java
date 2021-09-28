package com.example.repaso2709.service;

import java.util.List;

import com.example.repaso2709.model.Facultad;

public interface FacultadService {
  Facultad create(Facultad f);
  Facultad update(Facultad f);
  void delete(Long id);
  Facultad read(Long id);
  List<Facultad> readAll();
}

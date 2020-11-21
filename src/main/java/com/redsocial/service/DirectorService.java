package com.redsocial.service;

import java.util.List;

import com.redsocial.Entity.Director;

public interface DirectorService {

	public abstract Director inserta(Director obj);
	public abstract List<Director> listaDirector();
}
package com.example.template.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.template.bean.Produit;
import com.example.template.dao.ProduitDao;
import com.example.template.service.ProduitService;

@Service
public class ProduitServiceImpl implements ProduitService {
	@Autowired
	private ProduitDao dao;

	public ProduitDao getProduitDao() {
		return dao;
	}

	@Override
	public void save(Produit produit) {
		if(produit == null) return;
		this.dao.save(produit);
	}

	@Override
	public boolean existsById(Long id) {
		return this.dao.existsById(id);
	}

	@Override
	public List<Produit> findAll() {
		return this.dao.findAll();
	}

	@Override
	public Produit findById(Long id) {
		return this.dao.getById(id);
	}

	@Override
	public Produit findByRef(String ref) {
		return this.dao.findByRef(ref);
	}

	@Override
	public List<Produit> findByNomContaining(String nom) {
		return this.dao.findByNomContaining(nom);
	}

	@Override
	public List<Produit> findByPrix(BigDecimal prix) {
		return this.dao.findByPrix(prix);
	}

	@Override
	public Produit findByPrixGreaterThan(BigDecimal prix) {
		return this.dao.findByPrixGreaterThan(prix);
	}

	@Override
	public Produit findByPrixLessThan(BigDecimal prix) {
		return this.dao.findByPrixLessThan(prix);
	}

	@Override
	public Produit findByPrixBetween(BigDecimal min, BigDecimal max) {
		return this.dao.findByPrixBetween(min, max);
	}
	
}

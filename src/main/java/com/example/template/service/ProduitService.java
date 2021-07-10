package com.example.template.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.template.bean.Produit;

public interface ProduitService {
	public void save(Produit produit);
	public boolean exists(Long id);
	public List<Produit> findAll();
	
	public Produit findById(Long id);
	
	public Produit findByRef(String ref);
	
	public List<Produit> findByNomContaining(String nom);
	
	public List<Produit> findByPrix(BigDecimal prix);
	public Produit findByPrixGreaterThan(BigDecimal prix);
	public Produit findByPrixLessThan(BigDecimal prix);
	public Produit findByPrixBetween(BigDecimal min, BigDecimal max);
}

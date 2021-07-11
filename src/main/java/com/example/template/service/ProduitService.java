package com.example.template.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.template.bean.Produit;

public interface ProduitService {
	public void save(Produit produit);
	public Produit update(Long idProduit,Produit produit);
	public void delete(Long idProduit);
	public void deleteAll();
	public boolean existsById(Long id);
	public List<Produit> findAll();
	
	public Produit findById(Long id);
	
	public Produit findByRef(String ref);
	
	public List<Produit> findByNomContaining(String nom);
	
	public List<Produit> findByPrix(BigDecimal prix);
	public List<Produit> findByPrixGreaterThan(BigDecimal prix);
	public List<Produit> findByPrixLessThan(BigDecimal prix);
	public List<Produit> findByPrixBetween(BigDecimal min, BigDecimal max);
}

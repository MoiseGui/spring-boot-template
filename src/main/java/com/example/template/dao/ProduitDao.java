package com.example.template.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.template.bean.Produit;

public interface ProduitDao extends JpaRepository<Produit, Long> {
	public Produit findByRef(String ref);
	
	public List<Produit> findByNomContaining(String nom);
	
	public List<Produit> findByPrix(BigDecimal prix);
	public Produit findByPrixGreaterThan(BigDecimal prix);
	public Produit findByPrixLessThan(BigDecimal prix);
	public Produit findByPrixBetween(BigDecimal min, BigDecimal max);
}

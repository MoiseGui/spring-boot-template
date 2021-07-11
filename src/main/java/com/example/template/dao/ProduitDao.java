package com.example.template.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.template.bean.Produit;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

public interface ProduitDao extends JpaRepository<Produit, Long> {
	public Produit findByRef(String ref);

	public List<Produit> findByNomContaining( String nom);
	
	public List<Produit> findByPrix(BigDecimal prix);
	public List<Produit> findByPrixGreaterThan(BigDecimal prix);
	public List<Produit> findByPrixLessThan(BigDecimal prix);
	public List<Produit> findByPrixBetween(BigDecimal min, BigDecimal max);
}

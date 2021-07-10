package com.example.template.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.example.template.bean.Commande;

public interface CommandeService {
	public void save(Commande commande);
	public boolean exists(Long id);
	public List<Commande> findAll();
	
	public Commande findById(Long id);
	
	public Commande findByRef(String ref);
	
	public List<Commande> findByDateCmd(Date date);
	public List<Commande> findByDateCmdBefore(Date date);
	public List<Commande> findByDateCmdAfter(Date date);
	public List<Commande> findByDateCmdBetween(Date startDate, Date endDate);
	
	public Commande findByTotalGreaterThan(BigDecimal prix);
	public Commande findByTotalLessThan(BigDecimal prix);
	public Commande findByTotalBetween(BigDecimal min, BigDecimal max);
	
	public Commande findByCommandeItemId(Long idCommandeItem);
}

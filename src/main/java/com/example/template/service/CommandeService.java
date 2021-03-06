package com.example.template.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.example.template.bean.Commande;
import com.example.template.bean.CommandeItem;

public interface CommandeService {
	public Commande save(Commande commande);

	public Commande update(Long idCommande, Commande commande);

	public void delete(Long idCommande);

	public void deleteAll();

	public int deleteByRef(String ref);

	public boolean existsById(Long id);

	public List<Commande> findAll();

	public Commande findById(Long id);

	public Commande findByRef(String ref);

	public int deleteByMultipleRef(List<Commande> commandes);

	public List<Commande> findByDateCmd(Date date);

	public List<Commande> findByDateCmdBefore(Date date);

	public List<Commande> findByDateCmdAfter(Date date);

	public List<Commande> findByDateCmdBetween(Date startDate, Date endDate);

	public List<Commande> findByTotalGreaterThan(BigDecimal prix);

	public List<Commande> findByTotalLessThan(BigDecimal prix);

	public List<Commande> findByTotalBetween(BigDecimal min, BigDecimal max);

//	public Commande findByCommandeItemId(Long idCommandeItem);
}

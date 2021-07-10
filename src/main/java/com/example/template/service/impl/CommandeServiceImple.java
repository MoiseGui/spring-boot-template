package com.example.template.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.template.bean.Commande;
import com.example.template.dao.CommandeDao;
import com.example.template.service.CommandeService;

@Service
public class CommandeServiceImple implements CommandeService {
	
	@Autowired
	private CommandeDao dao;

	public CommandeDao getCommandeDao() {
		return dao;
	}

	@Override
	public void save(Commande commande) {
		if(commande == null) return;
		this.dao.save(commande);
	}

	@Override
	public boolean existsById(Long id) {
		return this.dao.existsById(id);
	}

	@Override
	public List<Commande> findAll() {
		return this.dao.findAll();
	}

	@Override
	public Commande findById(Long id) {
		return this.dao.getById(id);
	}

	@Override
	public Commande findByRef(String ref) {
		return this.dao.findByRef(ref);
	}

	@Override
	public List<Commande> findByDateCmd(Date date) {
		if(date == null) return null;
		return this.dao.findByDateCmd(date);
	}

	@Override
	public List<Commande> findByDateCmdBefore(Date date) {
		if(date == null) return null;
		return this.dao.findByDateCmdBefore(date);
	}

	@Override
	public List<Commande> findByDateCmdAfter(Date date) {
		if(date == null) return null;
		return this.dao.findByDateCmdBefore(date);
	}

	@Override
	public List<Commande> findByDateCmdBetween(Date startDate, Date endDate) {
		if(startDate == null || endDate == null) return null;
		return this.dao.findByDateCmdBetween(startDate, endDate);
	}

	@Override
	public Commande findByTotalGreaterThan(BigDecimal prix) {
		if(prix == null) return null;
		return this.dao.findByTotalGreaterThan(prix);
	}

	@Override
	public Commande findByTotalLessThan(BigDecimal prix) {
		if(prix == null) return null;
		return this.dao.findByTotalLessThan(prix);
	}

	@Override
	public Commande findByTotalBetween(BigDecimal min, BigDecimal max) {
		if(min == null || max == null) return null;
		return this.dao.findByTotalBetween(min, max);
	}

//	@Override
//	public Commande findByCommandeItemId(Long idCommandeItem) {
//		return this.dao.findByCommandeItemId(idCommandeItem);
//	}

}

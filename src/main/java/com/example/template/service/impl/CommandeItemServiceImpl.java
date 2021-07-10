package com.example.template.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.template.bean.CommandeItem;
import com.example.template.dao.CommandeItemDao;
import com.example.template.service.CommandeItemService;

@Service
public class CommandeItemServiceImpl implements CommandeItemService {
	
	@Autowired
	private CommandeItemDao dao;

	public CommandeItemDao getDao() {
		return dao;
	}

	@Override
	public void save(CommandeItem commandeItem) {
		if(commandeItem == null) return;
		this.dao.save(commandeItem);
	}

	@Override
	public boolean exists(Long id) {
		return this.dao.existsById(id);
	}

	@Override
	public List<CommandeItem> findAll() {
		return this.dao.findAll();
	}
	
	@Override
	public CommandeItem findById(Long id) {
		return this.dao.getById(id);
	}

	@Override
	public List<CommandeItem> findByProduitId(Long idProduit) {
		return this.dao.findByProduitId(idProduit);
	}

	@Override
	public List<CommandeItem> findByQte(BigDecimal qte) {
		if(qte == null) return null;
		return this.dao.findByQte(qte);
	}

	@Override
	public List<CommandeItem> findByQteGreaterThan(BigDecimal qte) {
		if(qte == null) return null;
		return this.dao.findByQteGreaterThan(qte);
	}

	@Override
	public List<CommandeItem> findByQteLessThan(BigDecimal qte) {
		if(qte == null) return null;
		return this.dao.findByQteLessThan(qte);
	}

	@Override
	public List<CommandeItem> findByQteBetween(BigDecimal qteMin, BigDecimal qteMax) {
		if(qteMin == null || qteMax == null) return null;
		return this.dao.findByQteBetween(qteMin, qteMax);
	}

	@Override
	public List<CommandeItem> findByCommandeId(Long idCommande) {
		return this.dao.findByCommandeId(idCommande);
	}

}

package com.example.template.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.template.bean.Commande;
import com.example.template.dao.CommandeDao;
import com.example.template.service.CommandeService;

@Service
public class CommandeServiceImpl implements CommandeService {

	@Autowired
	private CommandeDao dao;

	@Override
	public Commande save(Commande commande) {
		if (commande == null) {
			return null;
		}
		return this.dao.save(commande);
	}

	@Override
	public Commande update(Long idCommande, Commande commande) {
		commande.setId(idCommande);
		return dao.save(commande);
	}

	@Override
	public void delete(Long idCommande) {
		dao.deleteById(idCommande);

	}

	@Override
	public void deleteAll() {
		dao.deleteAll();

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
		return this.dao.findByRef(ref).orElse(null);
	}

	@Override
	public List<Commande> findByDateCmd(Date date) {
		if (date == null)
			return null;
		return this.dao.findByDateCmd(date);
	}

	@Override
	public List<Commande> findByDateCmdBefore(Date date) {
		if (date == null)
			return null;
		return this.dao.findByDateCmdBefore(date);
	}

	@Override
	public List<Commande> findByDateCmdAfter(Date date) {
		if (date == null)
			return null;
		return this.dao.findByDateCmdBefore(date);
	}

	@Override
	public List<Commande> findByDateCmdBetween(Date startDate, Date endDate) {
		if (startDate == null || endDate == null)
			return null;
		return this.dao.findByDateCmdBetween(startDate, endDate);
	}

	@Override
	public List<Commande> findByTotalGreaterThan(BigDecimal prix) {
		if (prix == null)
			return null;
		return this.dao.findByTotalGreaterThan(prix);
	}

	@Override
	public List<Commande> findByTotalLessThan(BigDecimal prix) {
		if (prix == null)
			return null;
		return this.dao.findByTotalLessThan(prix);
	}

	@Override
	public List<Commande> findByTotalBetween(BigDecimal min, BigDecimal max) {
		if (min == null || max == null)
			return null;
		return this.dao.findByTotalBetween(min, max);
	}

	@Override
	@Transactional
	public int deleteByRef(String ref) {
		// TODO Auto-generated method stub
		Commande commande = this.dao.findByRef(ref).orElse(null);
		if (commande != null) {
			this.dao.deleteById(commande.getId());
			return 1;

		}

		return -1;
	}

	@Override
	@Transactional
	public int deleteByMultipleRef(List<Commande> commandes) {
		int res = 0;
		for (int i = 0; i < commandes.size(); i++) {
			res += deleteByRef(commandes.get(i).getRef());
		}
		return res;
	}
//	@Override
//	public Commande findByCommandeItemId(Long idCommandeItem) {
//		return this.dao.findByCommandeItemId(idCommandeItem);
//	}

}

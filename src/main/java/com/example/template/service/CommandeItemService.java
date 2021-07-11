package com.example.template.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.template.bean.CommandeItem;
import com.example.template.bean.Produit;

public interface CommandeItemService {
	public void save(CommandeItem commandeItem);
	public CommandeItem update(Long idCommandeItem,CommandeItem commandeItem);
	public void delete(Long idCommandeItem);
	public void deleteAll();
	public boolean exists(Long id);
	public List<CommandeItem> findAll();
	
	public CommandeItem findById(Long id);
	
	public List<CommandeItem> findByProduitId(Long idProduit);
	
	public List<CommandeItem> findByQte(BigDecimal qte);
	public List<CommandeItem> findByQteGreaterThan(BigDecimal qte);
	public List<CommandeItem> findByQteLessThan(BigDecimal qte);
	public List<CommandeItem> findByQteBetween(BigDecimal qteMin, BigDecimal qteMax);
	
//	public List<CommandeItem> findByCommandeId(Long idCommande);
}

package com.example.template.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.template.bean.CommandeItem;

public interface CommandeItemDao extends JpaRepository<CommandeItem, Long> {
	public List<CommandeItem> findByProduitId(Long idProduit);
	
	public List<CommandeItem> findByQte(BigDecimal qte);
	public List<CommandeItem> findByQteGreaterThan(BigDecimal qte);
	public List<CommandeItem> findByQteLessThan(BigDecimal qte);
	public List<CommandeItem> findByQteBetween(BigDecimal qteMin, BigDecimal qteMax);
	
//	public List<CommandeItem> findByCommandeId(Long idCommande);
}

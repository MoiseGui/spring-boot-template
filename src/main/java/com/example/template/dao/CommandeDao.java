package com.example.template.dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.template.bean.Commande;

public interface CommandeDao extends JpaRepository<Commande, Long> {
	public Commande findByRef(String ref);
	
	public List<Commande> findByDateCmd(Date date);
	public List<Commande> findByDateCmdBefore(Date date);
	public List<Commande> findByDateCmdAfter(Date date);
	public List<Commande> findByDateCmdBetween(Date startDate, Date endDate);
	
	public List<Commande> findByTotalGreaterThan(BigDecimal prix);
	public List<Commande> findByTotalLessThan(BigDecimal prix);
	public List<Commande> findByTotalBetween(BigDecimal min, BigDecimal max);
	
//	public Commande findByCommandeItemId(Long idCommandeItem);
}

package com.example.template;

import com.example.template.bean.Commande;
import com.example.template.bean.CommandeItem;
import com.example.template.bean.Produit;
import com.example.template.dao.CommandeDao;
import com.example.template.dao.CommandeItemDao;
import com.example.template.dao.ProduitDao;
import com.example.template.service.CommandeItemService;
import com.example.template.service.CommandeService;
import com.example.template.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringTemplateApplication implements CommandLineRunner {
	@Autowired
	private CommandeService commandeService;
	@Autowired
	private ProduitService produitService;
	@Autowired
	private CommandeItemService commandeItemService;

	public static void main(String[] args) {
		SpringApplication.run(SpringTemplateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		produitService.deleteAll();
		commandeService.deleteAll();
		commandeItemService.deleteAll();
		Produit p1 = new Produit(null,"av112","chocola", new BigDecimal(14));
		Produit p2 = new Produit(null,"av123","jupe", new BigDecimal(141));
		Produit p3 = new Produit(null,"av124","sumsung", new BigDecimal(2000));
		Produit p4 = new Produit(null,"av125","nicke", new BigDecimal(12222));

		Stream.of(p1,p2,p3,p4).forEach(produit -> {
			 produitService.save(produit); });
		Commande cmd1 = new Commande();
		cmd1.setDateCmd(new Date());
		cmd1.setRef("rt134");
		cmd1.setTotal(new BigDecimal(100));

		Commande cmd2 = new Commande();
		cmd2.setDateCmd(new Date());
		cmd2.setRef("rt134erv");
		cmd2.setTotal(new BigDecimal(100));
		Stream.of(cmd1,cmd2).forEach(commande -> {
			commandeService.save(commande); });

		CommandeItem commandeItem1 = new CommandeItem();
		CommandeItem commandeItem2 = new CommandeItem();
		CommandeItem commandeItem3 = new CommandeItem();

		commandeItem1.setProduit(p1); commandeItem1.setQte(new BigDecimal(1)); commandeItem1.setCommande(cmd1);
		commandeItem2.setProduit(p3); commandeItem1.setQte(new BigDecimal(1)); commandeItem2.setCommande(cmd1);
		commandeItem3.setProduit(p4); commandeItem1.setQte(new BigDecimal(1)); commandeItem3.setCommande(cmd2);
		Stream.of(commandeItem1,commandeItem2,commandeItem3).forEach(commandeItem -> {
			commandeItemService.save(commandeItem); });


	}
}

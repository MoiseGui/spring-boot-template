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
import java.util.List;

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
		produitService.save(new Produit(null,"av112","chocola", new BigDecimal(14)));
		produitService.save(new Produit(null,"av123","jupe", new BigDecimal(141)));
		produitService.save(new Produit(null,"av124","sumsung", new BigDecimal(2000)));
		produitService.save(new Produit(null,"av125","nicke", new BigDecimal(12222)));


	}
}

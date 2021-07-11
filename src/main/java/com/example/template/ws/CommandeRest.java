package com.example.template.ws;

import com.example.template.bean.Commande;
import com.example.template.bean.CommandeItem;
import com.example.template.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/commande")
@CrossOrigin("*")
public class CommandeRest {
	@Autowired
	private CommandeService commandeService;

	@PostMapping("/deleteMultipleByref")
	public int deleteByMultipleRef(@RequestBody List<Commande> commandes) {
		return commandeService.deleteByMultipleRef(commandes);
	}

	@DeleteMapping("/ref/{ref}")
	public int deleteByRef(@PathVariable String ref) {
		return commandeService.deleteByRef(ref);
	}

	@PostMapping("/")
	public Commande save(@RequestBody Commande commande) {
		return commandeService.save(commande);
	}

	@PutMapping("/{id}")
	public Commande update(@PathVariable Long id, @RequestBody Commande commande) {
		return commandeService.update(id, commande);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		commandeService.delete(id);
	}

	@DeleteMapping("/")
	public void deleteAll() {
		commandeService.deleteAll();
	}

	@GetMapping("/commandeExist/{id}")
	public boolean existsById(@PathVariable(name = "id") Long id) {
		return commandeService.existsById(id);
	}

	@GetMapping("/")
	public List<Commande> findAll() {
		return commandeService.findAll();
	}

	@GetMapping("/id/{id}")
	public Commande findById(@PathVariable(name = "id") Long id) {
		return commandeService.findById(id);
	}

	@GetMapping("/ref/{ref}")
	public Commande findByRef(@PathVariable(name = "ref") String ref) {
		return commandeService.findByRef(ref);
	}

	@GetMapping("/dateCommande/{date}")
	public List<Commande> findByDateCmd(@PathVariable(name = "date") Date date) {
		return commandeService.findByDateCmd(date);
	}

	@GetMapping("/dateCommandeBefore/{date}")
	public List<Commande> findByDateCmdBefore(@PathVariable(name = "date") Date date) {
		return commandeService.findByDateCmdBefore(date);
	}

	@GetMapping("/dateCommandeAfter/{date}")
	public List<Commande> findByDateCmdAfter(@PathVariable(name = "date") Date date) {
		return commandeService.findByDateCmdAfter(date);
	}

	@GetMapping("/dateCommandeBetween/{datemin}/{datemax}")
	public List<Commande> findByDateCmdBetween(@PathVariable(name = "datemin") Date datemin,
			@PathVariable(name = "datemax") Date datemax) {
		return commandeService.findByDateCmdBetween(datemin, datemax);
	}

	@GetMapping("/TotalGreaterThan/{totale}")
	public List<Commande> findByTotalGreaterThan(@PathVariable(name = "totale") BigDecimal totale) {
		return commandeService.findByTotalGreaterThan(totale);
	}

	@GetMapping("/TotalLessThan/{totale}")
	public List<Commande> findByTotalLessThan(@PathVariable(name = "totale") BigDecimal totale) {
		return commandeService.findByTotalLessThan(totale);
	}
//    @GetMapping("/CommandeItem/TotalBetween/{totalemin}/{totalemax}")
//    public List<Commande> findByTotalBetween(@PathVariable(name = "totalemin") BigDecimal totalemin,@PathVariable(name = "totalemax") BigDecimal totalemax){
//        return commandeService.findByTotalBetween(totalemin,totalemax);
//    }

}

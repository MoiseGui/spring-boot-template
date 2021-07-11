package com.example.template.ws;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.template.bean.Produit;
import com.example.template.service.ProduitService;

@RestController
@RequestMapping("/produit")
@CrossOrigin("*")
public class ProduitRest {
    @Autowired
    private ProduitService produitService;


    @PostMapping("/")
    public void save(@RequestBody Produit produit){
         produitService.save(produit);
    }
    @PutMapping("/{id}")
    public Produit update(@PathVariable Long id, @RequestBody Produit produit){
       return produitService.update(id,produit);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
         produitService.delete(id);
    }
    @DeleteMapping("/")
    public void deleteAll(){
        produitService.deleteAll();
    }
    @GetMapping("/produitExist/{id}")
    public boolean existsById(@PathVariable(name = "id") Long id){
        return produitService.existsById(id);
   }
    @GetMapping("/")
    public List<Produit> findAll(){
        return produitService.findAll();
    }
    @GetMapping("/id/{id}")
    public Produit findById(@PathVariable(name = "id") Long id){
        return produitService.findById(id);
    }
    @GetMapping("/ref/{ref}")
    public Produit findByRef(@PathVariable(name = "ref") String ref){
        return produitService.findByRef(ref);
    }
    @GetMapping("/nom/{nom}")
    public List<Produit> findByNomContaining(@PathVariable(name = "nom") String nom){
        return produitService.findByNomContaining(nom);
    }
    @GetMapping("/prix/{prix}")
    public List<Produit> findByPrix(@PathVariable(name = "prix") BigDecimal prix){
        return produitService.findByPrix(prix);
    }
    @GetMapping("/prixGreaterThan/{prix}")
    public List<Produit> findByPrixGreaterThan(@PathVariable(name = "prix") BigDecimal prix){
        return produitService.findByPrixGreaterThan(prix);
    }
    @GetMapping("/prixLessThan/{prix}")
    public List<Produit> findByPrixLessThan(@PathVariable(name = "prix") BigDecimal prix){
        return produitService.findByPrixLessThan(prix);
    }
    @GetMapping("/prixBetween/{prixmin}/{prixmax}")
    public List<Produit> findByPrixBetween(@PathVariable(name = "prixmin") BigDecimal prixmin,@PathVariable(name = "prixmax") BigDecimal prixmax){
        return produitService.findByPrixBetween(prixmin,prixmax);
    }


}

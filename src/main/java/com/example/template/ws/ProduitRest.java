package com.example.template.ws;

import com.example.template.bean.Produit;
import com.example.template.dao.ProduitDao;
import com.example.template.service.ProduitService;
import com.example.template.service.impl.ProduitServiceImpl;
import com.sun.xml.internal.ws.developer.StreamingAttachment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class ProduitRest {
    @Autowired
    private ProduitService produitService;


    @PostMapping("/produit")
    public void save(@RequestBody Produit produit){
         produitService.save(produit);
    }
    @PutMapping("/produit/{id}")
    public Produit update(@PathVariable Long id, @RequestBody Produit produit){
       return produitService.update(id,produit);
    }
    @DeleteMapping("/produit/{id}")
    public void delete(@PathVariable Long id){
         produitService.delete(id);
    }
    @DeleteMapping("/produits")
    public void deleteAll(){
        produitService.deleteAll();
    }
    @GetMapping("/produit/produitExist/{id}")
    public boolean existsById(@PathVariable(name = "id") Long id){
        return produitService.existsById(id);
   }
    @GetMapping("/produits")
    public List<Produit> findAll(){
        return produitService.findAll();
    }
    @GetMapping("/produit/id/{id}")
    public Produit findById(@PathVariable(name = "id") Long id){
        return produitService.findById(id);
    }
    @GetMapping("/produit/ref/{ref}")
    public Produit findByRef(@PathVariable(name = "ref") String ref){
        return produitService.findByRef(ref);
    }
    @GetMapping("/produit/nom/{nom}")
    public List<Produit> findByNomContaining(@PathVariable(name = "nom") String nom){
        return produitService.findByNomContaining(nom);
    }
    @GetMapping("/produit/prix/{prix}")
    public List<Produit> findByPrix(@PathVariable(name = "prix") BigDecimal prix){
        return produitService.findByPrix(prix);
    }
    @GetMapping("/produit/PrixGreaterThan/{prix}")
    public List<Produit> findByPrixGreaterThan(@PathVariable(name = "prix") BigDecimal prix){
        return produitService.findByPrixGreaterThan(prix);
    }
    @GetMapping("/produit/PrixLessThan/{prix}")
    public List<Produit> findByPrixLessThan(@PathVariable(name = "prix") BigDecimal prix){
        return produitService.findByPrixLessThan(prix);
    }
    @GetMapping("/produit/PrixBetween/{prixmin}/{prixmax}")
    public List<Produit> findByPrixBetween(@PathVariable(name = "prixmin") BigDecimal prixmin,@PathVariable(name = "prixmax") BigDecimal prixmax){
        return produitService.findByPrixBetween(prixmin,prixmax);
    }


}

package com.example.template.ws;

import com.example.template.bean.CommandeItem;
import com.example.template.bean.Produit;
import com.example.template.service.CommandeItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/CommandeItem")
@CrossOrigin("*")
public class CommadeItemRest {
    @Autowired
    private CommandeItemService commandeItemService;

    @PostMapping("/")
    public void save(@RequestBody CommandeItem commandeItem){
        commandeItemService.save(commandeItem);
    }
    @PutMapping("/{id}")
    public CommandeItem update(@PathVariable Long id, @RequestBody CommandeItem commandeItem){
        return commandeItemService.update(id,commandeItem);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        commandeItemService.delete(id);
    }
    @DeleteMapping("/")
    public void deleteAll(){
        commandeItemService.deleteAll();
    }
        @GetMapping("/commandeItemExist/{id}")
   public boolean existsById(@PathVariable(name = "id") Long id){
       return commandeItemService.exists(id);
    }
    @GetMapping("/")
    public List<CommandeItem> findAll(){
        return commandeItemService.findAll();
    }
    @GetMapping("/id/{id}")
    public CommandeItem findById(@PathVariable(name = "id") Long id){
        return commandeItemService.findById(id);
    }
    @GetMapping("/idProduit/{id}")
    public List<CommandeItem> findByProduitId(@PathVariable(name = "id") Long idProduit){
        return commandeItemService.findByProduitId(idProduit);
    }
    @GetMapping("/quantite/{qte}")
    public List<CommandeItem> findByQte(@PathVariable(name = "qte") BigDecimal qte){
        return commandeItemService.findByQte(qte);
    }
    @GetMapping("/qteGreaterThan/{qte}")
    public List<CommandeItem> findByQteGreaterThan(@PathVariable(name = "qte") BigDecimal qte){
        return commandeItemService.findByQteGreaterThan(qte);
    }
    @GetMapping("/qteLessThan/{qte}")
    public List<CommandeItem> findByQteLessThan(@PathVariable(name = "qte") BigDecimal qte){
        return commandeItemService.findByQteLessThan(qte);
    }
    @GetMapping("/qteBetween/{qtemin}/{qtemax}")
    public List<CommandeItem> findByQteBetween(@PathVariable(name = "qtemin") BigDecimal qtemin,@PathVariable(name = "qtemax") BigDecimal qtemax){
        return commandeItemService.findByQteBetween(qtemin,qtemax);
    }


}

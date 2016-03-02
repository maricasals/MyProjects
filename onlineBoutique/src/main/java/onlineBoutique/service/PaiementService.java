/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineBoutique.service;

import onlineBoutique.entity.Commande;
import onlineBoutique.entity.SousComande;
import onlineBoutique.exeption.CommandeNulleException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class PaiementService {
    
    @Autowired
    private ArticleService articleService;

    @Autowired
    private CommandeService  commandeService;
    
    public void payer(long id) throws CommandeNulleException {

        Commande c =  commandeService.findOne(id);
        
        if (c.getSousCommandes().isEmpty()) 
        {
            throw new CommandeNulleException("Votre panier est vide");
        } 
        else 
        {
            //Paiement
            c.setCommandePaye(Boolean.TRUE);
            
            //Gestion de stock
            for(SousComande sousComande : c.getSousCommandes())
            {
//                sousComande.getArticle().getStock()
//                articleService.findByArticleOrderBynom(c.getSousCommandes);
            }
            System.out.println("Votre paiement à été bien effectué");

        }

    }

}

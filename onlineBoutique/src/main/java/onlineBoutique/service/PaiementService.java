/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineBoutique.service;

import onlineBoutique.entity.Commande;
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

    public void payer(Commande c) throws CommandeNulleException {

        if (c.getSousCommandes().isEmpty()) 
        {
            throw new CommandeNulleException("Votre panier est vide");
        } 
        else 
        {
            //Gestion de stock
            for(int i=0; i<=c.getSousCommandes().size();i++)
            {
//                articleService.findByArticleOrderBynom(c.getSousCommandes);
            }
            System.out.println("Votre paiement à été bien effectué");

        }

    }

}

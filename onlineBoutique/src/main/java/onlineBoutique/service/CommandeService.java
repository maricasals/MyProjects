/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineBoutique.service;

import java.util.List;
import onlineBoutique.entity.Commande;
import onlineBoutique.entity.Utilisateur;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author admin
 */
public interface CommandeService extends CrudRepository<Commande, Long>{
    
    public List<Commande> findByUtilisateurOrderBydateCommande(Utilisateur u);
    public List<Commande> findByPaieOrderBydateCommande(Boolean b);
    public List<Commande> findByLivreOrderBydateCommande(Boolean b);
    
}

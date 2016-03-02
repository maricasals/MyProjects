/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineBoutique.service;

import onlineBoutique.entity.Utilisateur;
import onlineBoutique.exeption.UtilisateurNoExistantException;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author admin
 */
@Repository
public interface ConnexionServiceCrud extends CrudRepository<Utilisateur, Long>{
    
    /**
     *
     * @param email
     * @param mdp
     * @return
     * @throws onlineBoutique.exeption.UtilisateurNoExistantException
     */
    public Utilisateur findOneByEmailAndMdp(String email,String mdp) throws UtilisateurNoExistantException;
    
}

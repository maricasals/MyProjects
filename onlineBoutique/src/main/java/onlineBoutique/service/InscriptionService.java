/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineBoutique.service;

import onlineBoutique.entity.Utilisateur;
import onlineBoutique.exeption.UtilisateurExistantExeption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class InscriptionService {

    @Autowired
    private UtilisateurService utilisateurService;
    
    @Autowired
    private MailService mailService;

    public void inscription(Utilisateur u) throws UtilisateurExistantExeption {

        Iterable<Utilisateur> ListUtilisateurs = utilisateurService.findAll();
        for (Utilisateur ut : ListUtilisateurs)
        {
            if (u.getEmail().equals(ut.getEmail())) 
            {
                throw new UtilisateurExistantExeption("Utilisateur déjà en Base de donners");
            }
            else
            {
                utilisateurService.save(u);
                mailService.envoyerMail(ut, "Merci pour vous avoir inscrit dans OnlineBoutique notre equipe vous souhaite des bons achats");
                System.out.println("Merci pour vous avoir inscrit dans OnlineBoutique notre equipe vous souhaite des bons achats");
            }
        }
    }

}

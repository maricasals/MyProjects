/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineBoutique.service;

import onlineBoutique.entity.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class ConnexionService {
    
    @Autowired
    private UtilisateurService utilisateurService;
    
    public Utilisateur connected(Utilisateur u){
//        utilisateurService.findByEmailAndMdpOrderNomAsc(u.getEmail().n, u.getMdp());
        return (u);
    }
    
}

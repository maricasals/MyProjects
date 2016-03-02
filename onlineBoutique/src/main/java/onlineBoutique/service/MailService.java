/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineBoutique.service;

import onlineBoutique.entity.Utilisateur;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class MailService {
    public void envoyerMail(Utilisateur destinataire, String msg){
        System.out.println("Email envoyer à l'adresse : "+ destinataire.getEmail()+"  "+"Avec son correspondant message");
        
    }
}

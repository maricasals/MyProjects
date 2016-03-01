/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineBoutique.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class DBService {
    
    @PersistenceContext
    private EntityManager em;
    
    @Autowired
    private ArticleService articleService;
    
    @Autowired
    private CategorieService categorieService;
    
    @Autowired
    private CodePromoService codePromoService;
    
    @Autowired
    private CommandeService commandeService;
    
    @Autowired
    private ModeLivraisonService modeLivraisonService;
    
    @Autowired
    private SousComandeService sousComandeService;
    
    @Autowired
    private UtilisateurService utilisateurService;
    
    
    public void supprimerTout(){
        sousComandeService.deleteAll();
        commandeService.deleteAll();
        articleService.deleteAll();
        utilisateurService.deleteAll();
        modeLivraisonService.deleteAll();
        categorieService.deleteAll();
        codePromoService.deleteAll();
        
    }
    
    
}

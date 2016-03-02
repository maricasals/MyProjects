/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineBoutique.test;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import onlineBoutique.entity.Article;
import onlineBoutique.entity.Categorie;
import onlineBoutique.entity.TypeUtil;
import onlineBoutique.entity.Utilisateur;
import onlineBoutique.exeption.UtilisateurExistantExeption;
import onlineBoutique.exeption.UtilisateurNoExistantException;
import onlineBoutique.service.ArticleService;
import onlineBoutique.service.CategorieService;
import onlineBoutique.service.DBService;
import onlineBoutique.service.InscriptionService;
import onlineBoutique.service.UtilisateurService;
import onlineBoutique.spring.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import onlineBoutique.service.ConnexionServiceCrud;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author ETY
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringConfig.class)
public class MappingTest {

    @PersistenceContext
    private EntityManager em;

    @Autowired
    private DBService dbService;

    @Autowired
    private UtilisateurService utilisateurService;

    @Autowired
    private CategorieService categorieService;

    @Autowired
    private ArticleService articleService;

    @Autowired
    private InscriptionService inscriptionService;

    @Autowired
    private ConnexionServiceCrud connexionServiceInter;

//    @Before
    public void avantTout() {
        dbService.supprimerTout();
    }

    @Test
    public void initialisationDonnes() {

        //Creation utilisateurs
        Utilisateur u1 = new Utilisateur("emailu1", "mdpU1", "Avenue Gustave Effel", 33000L, "Bordeaux", "Thomas", "Baudrey", "0678894506", TypeUtil.CLIENT);
        Utilisateur u2 = new Utilisateur("emailu2", "mdpU2", "Rue Castelbou", 31000L, "Toulouse", "Maria", "Casals Soler", "0726779779", TypeUtil.CLIENT);

        u1.setId(1L);
        u2.setId(2L);

        utilisateurService.save(u1);
        utilisateurService.save(u2);

        //Creation des categories
        Categorie c1 = new Categorie("Chaussures");
        Categorie c2 = new Categorie("Vêtments");
        Categorie c3 = new Categorie("Accessoires");
        Categorie c4 = new Categorie("Sacs");

        categorieService.save(c1);
        categorieService.save(c2);
        categorieService.save(c3);
        categorieService.save(c4);

        //Creation Articles
        Article a1 = new Article("Sac à main", 50L, 125L, new Categorie("Sacs"));
        a1.setCategorieArticle(c4);

        Article a2 = new Article("Crocs", 60L, 25L, new Categorie("Chaussures"));
        a2.setCategorieArticle(c1);

        Article a3 = new Article("Bottes", 7L, 75L, new Categorie("Chaussures"));
        a3.setCategorieArticle(c1);

        articleService.save(a1);
        articleService.save(a2);
        articleService.save(a3);
    }

//    @Test
    public void inscriptionTest() throws UtilisateurExistantExeption {

        Utilisateur u = new Utilisateur("emailu1", "mdpU1", "Avenue Gustave Effel", 33000L, "Bordeaux", "Thomas", "Baudrey", "0678894506", TypeUtil.CLIENT);
        inscriptionService.inscription(u);
        utilisateurService.save(u);
    }

    @Test
    public void connectedTest() {
        boolean thrown = false;

        try {
            connexionServiceInter.findOneByEmailAndMdp("emailu1", "mdpU1").toString();
            connexionServiceInter.findOneByEmailAndMdp("email", "mdpU1").toString();
        } catch (UtilisateurNoExistantException ne) {
            thrown = true;
        }

        assertTrue(thrown);

//        
//        connexionServiceInter.findOneByEmailAndMdp("email", "mdp");
    }
}

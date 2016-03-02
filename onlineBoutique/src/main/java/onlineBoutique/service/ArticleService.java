/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineBoutique.service;

import java.util.List;
import onlineBoutique.entity.Article;
import onlineBoutique.entity.Categorie;
import onlineBoutique.entity.SousComande;
import onlineBoutique.entity.Utilisateur;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author admin
 */
public interface ArticleService extends CrudRepository<Article, Long>{
    
    public List<Article> findByCategorieOrderBynom(Categorie categorie);
    public List<Article> findByPrixOrderByprixDESC(Article article);
    public List<Article> findByUtilisateurOrderBynom(Utilisateur utilisateur);
    public List<Article> findByArticleOrderBynom(SousComande sousComande);
    
}

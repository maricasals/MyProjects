/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineBoutique.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author admin
 */
@Entity
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(length = 128)
    private String nom;
    
    private Long stock;
    private Long prix;
    
    @Enumerated(EnumType.STRING)
    private Genre genre;
    
    @ManyToOne
    @JoinColumn(name = "CATEGORIES_ID")
    private Categorie categorie;
    
    @OneToMany(mappedBy = "article")
    private List<SousComande> sousComandes = new ArrayList<>();
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Article)) {
            return false;
        }
        Article other = (Article) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "onlineBoutique.entity.Article[ id=" + id + " ]";
    }

    public Article() {
    }

    public Article(String nom, Long stock, Long prix, Categorie categorieArticle) {
        this.nom = nom;
        this.stock = stock;
        this.prix = prix;
        this.categorie = categorieArticle;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public Long getPrix() {
        return prix;
    }

    public void setPrix(Long prix) {
        this.prix = prix;
    }

    public Categorie getCategorieArticle() {
        return categorie;
    }

    public void setCategorieArticle(Categorie categorieArticle) {
        this.categorie = categorieArticle;
    }

    public List<SousComande> getSouscomandes() {
        return sousComandes;
    }

    public void setSouscomandes(List<SousComande> souscomandes) {
        this.sousComandes = souscomandes;
    }
    
    
}

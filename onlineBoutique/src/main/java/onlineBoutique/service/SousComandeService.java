/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineBoutique.service;

import onlineBoutique.entity.SousComande;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author admin
 */
public interface SousComandeService extends CrudRepository<SousComande, Long>{
    
}

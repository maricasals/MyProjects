/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineBoutique.service;

import onlineBoutique.entity.CodePromo;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author admin
 */
public interface CodePromoService extends CrudRepository<CodePromo, Long>{
    
}

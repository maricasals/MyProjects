/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineBoutique.test;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import onlineBoutique.service.DBService;
import onlineBoutique.spring.SpringConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author ETY
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=SpringConfig.class)
public class MappingTest {
    
    @PersistenceContext
    private EntityManager em;
    
    @Autowired
    private DBService dbService;
    
    @Before
    public void avantTout(){
        dbService.supprimerTout();
    }
    
    @Test
    public void doNadaOK(){
        
    }
    
}

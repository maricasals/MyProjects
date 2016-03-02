/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineBoutique.service;

import java.util.Random;
import onlineBoutique.entity.CodePromo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class GenerationCodePromoService {

    @Autowired
    private CodePromoService codePromoService;

    public void generationDunCodePromo(CodePromo codePromo) {
        Random rand = new Random();
        Integer max =9999;
        Integer min =1000; 
        Integer numAleatoire = rand.nextInt(max - min + 1) + min;
        
        codePromo.setCodePromo(numAleatoire.toString());
        codePromoService.save(codePromo);
    }

}

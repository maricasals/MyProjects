/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineBoutique.exeption;

/**
 *
 * @author admin
 */
public class UtilisateurExistantExeption extends Exception{

    public UtilisateurExistantExeption() {
    }

    public UtilisateurExistantExeption(String message) {
        super(message);
    }
}

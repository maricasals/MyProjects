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
public class UtilisateurNoExistantException extends Exception {

    /**
     * Creates a new instance of <code>UtilisateurNoExistantException</code>
     * without detail message.
     */
    public UtilisateurNoExistantException() {
    }

    /**
     * Constructs an instance of <code>UtilisateurNoExistantException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public UtilisateurNoExistantException(String msg) {
        super(msg);
    }
}

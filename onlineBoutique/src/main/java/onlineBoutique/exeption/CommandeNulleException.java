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
public class CommandeNulleException extends Exception {

    /**
     * Creates a new instance of <code>CommandeNulleException</code> without
     * detail message.
     */
    public CommandeNulleException() {
    }

    /**
     * Constructs an instance of <code>CommandeNulleException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public CommandeNulleException(String msg) {
        super(msg);
    }
}

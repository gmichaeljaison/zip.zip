/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package zip;

import java.io.Serializable;

/**
 *
 * @author Mike
 */
public class FileExistsException extends Exception implements Serializable {

    /**
     * Creates a new instance of <code>FileExistsException</code> without detail message.
     */
    public FileExistsException() {
    }


    /**
     * Constructs an instance of <code>FileExistsException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public FileExistsException(String msg) {
        super(msg);
    }
}

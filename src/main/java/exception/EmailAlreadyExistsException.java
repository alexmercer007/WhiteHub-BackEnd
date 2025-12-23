

package exception;

/**
 *
 * @author Alejandro
 */
public class EmailAlreadyExistsException extends RuntimeException{    
    
    public EmailAlreadyExistsException(String exception){
       super(exception);
    }
    
}

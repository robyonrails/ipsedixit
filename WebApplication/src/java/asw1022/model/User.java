package asw1022.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 *
 * @author Roberto Casadei <roberto.casadei12@studio.unibo.it>
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class User extends BasicObject {

    protected String password;
      
    public void setPassword(String password) { this.password = password; }
    public String getPassword(){ return this.password; }
    
}

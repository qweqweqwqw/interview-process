package org.interview.server;

import org.interview.client.PersonService;
import org.interview.shared.PersonInfo;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * Simple service class the make database queries to the Person table 
 */
public class PersonServiceImpl extends RemoteServiceServlet implements PersonService {

    private static final long serialVersionUID = 3595567717763427649L;

    
    @Override
    public PersonInfo getPerson(int personID) throws Exception{
        PersonInfo returnValue = new PersonInfo();
        
        returnValue.setFirstName("Tyrion");
        returnValue.setLastName("Lannister");
        returnValue.setPersonID(1);
        
        return returnValue;
    }
    
    
}

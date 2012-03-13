package org.interview.client;

import org.interview.shared.PersonInfo;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("person")
public interface PersonService extends RemoteService{

    PersonInfo getPerson(int personID) throws Exception;
    
}

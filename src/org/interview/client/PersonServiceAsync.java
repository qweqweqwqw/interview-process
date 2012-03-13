package org.interview.client;

import org.interview.shared.PersonInfo;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface PersonServiceAsync {

    void getPerson(int personID, AsyncCallback<PersonInfo> callback);

}

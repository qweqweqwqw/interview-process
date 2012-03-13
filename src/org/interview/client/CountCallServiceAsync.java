package org.interview.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface CountCallServiceAsync {

    void countCall(Integer number, AsyncCallback<Integer> callback);

}

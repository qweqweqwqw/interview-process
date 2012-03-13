package org.interview.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("countCall")
public interface CountCallService extends RemoteService{

    Integer countCall(Integer number);
}

package org.interview.server;

import org.interview.client.CountCallService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * Service Implementation for counting number of successful call transmitted to Server.
 */
public class CountCallServiceImpl extends RemoteServiceServlet implements CountCallService{

    private static final long serialVersionUID = -429333543049967755L;

    @Override
    public Integer countCall(Integer number) {
        System.out.println("Successfully received call for this integer : " + number);
        return number+1;
    }
}

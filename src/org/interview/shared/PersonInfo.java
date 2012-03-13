package org.interview.shared;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.IsSerializable;

public class PersonInfo implements IsSerializable {

    private int personID;
    private String lastName;
    private String firstName;
    
    private ArrayList<LocationInfo> addresses;
    
    public int getPersonID() { return personID; }
    public void setPersonID(int personID) { this.personID = personID; }
    
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    
    public ArrayList<LocationInfo> getAddresses() { return addresses; }
    public void setAddresses(ArrayList<LocationInfo> addresses) { this.addresses = addresses; }
    
    public String getName(){
        return "";
    }
    
}

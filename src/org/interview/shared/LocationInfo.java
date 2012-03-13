package org.interview.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

public class LocationInfo implements IsSerializable{
    
    private int locationID;
    private int personID;
    private String address;
    
    public int getLocationID() { return locationID; }
    public void setLocationID(int locationID) { this.locationID = locationID; }
    
    public int getPersonID() { return personID; }
    public void setPersonID(int personID) { this.personID = personID; }
    
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    
}

package CollectionsTask;

import java.util.HashMap;
import java.util.Map;

public class User {

    private long id;
    private String username;
    private Map<String, Address> addresses;

    public User(String username) {
        this.username = username;
        addresses = new HashMap<>();
    }

    public void addAddress(Address userAddress, String addressType){
        addresses.put(addressType, userAddress);
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public Map<String, Address> getAddresses() {
        return addresses;
    }
    public void setAddresses(Map<String, Address> addresses) {
        this.addresses = addresses;
    }
}
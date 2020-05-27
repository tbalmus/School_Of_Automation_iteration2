package OOPTask;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractUser {

    protected long id;
    protected String username;
    protected Map<String, Address> addresses;
//    protected UserOrder order;

    public AbstractUser(String username) {
        this.username = username;
        addresses = new HashMap<>();
    }

    public void addAddress(Address userAddress, String addressType){
        addresses.put(addressType, userAddress);
    }

    public Map<String, Address> getAddresses() {
        return addresses;
    }
    public void setAddresses(Map<String, Address> addresses) {
        this.addresses = addresses;
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


}

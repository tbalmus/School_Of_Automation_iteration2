package OOPTask;


public class AdminUser extends AbstractUser {

    public AdminUser(String username) {
        super(username);
    }





    public void approveOrder (UserOrder order) {
        System.out.println("Order: " + order.getId() + " was approved");
    }


    public void rejectOrder(UserOrder order) {
        System.out.println("Order: " + order.getId() + " was rejected");
    }


}

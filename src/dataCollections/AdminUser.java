package dataCollections;

public class AdminUser extends AbstractUser {

    public AdminUser(String userName) {
        super(userName);
    }

    @Override
    public String toString() {
        return "AdminUser: " + super.toString();
    }

    @Override
    public void logIn() {
        System.out.println("Log in as an Admin User");
    }

    public void approveOrder(Order order) {
        order.setStatus(Status.APPROVED);
    }

    public void rejectOrder(Order order) {
        order.setStatus(Status.REJECTED);
    }
}

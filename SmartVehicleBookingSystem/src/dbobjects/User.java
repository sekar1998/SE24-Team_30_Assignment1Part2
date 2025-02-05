package dbobjects;

import SmartVehicleBookingSystem.src.dbobjects.Trip;
import SmartVehicleBookingSystem.src.dbobjects.UserIdentity;
import SmartVehicleBookingSystem.src.dbobjects.Wallet;
import SmartVehicleBookingSystem.src.dbobjects.PaymentDetails;
import java.util.List;

public class User {
    private UserIdentity id;
    private Wallet wallet;
    private List<Trip> tripHistory;
    private PaymentDetails payment;

    public UserIdentity getId() {
        return id;
    }

    public void setId(UserIdentity id) {
        this.id = id;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public List<Trip> getTripHistory() {
        return tripHistory;
    }

    public void setTripHistory(List<Trip> tripHistory) {
        this.tripHistory = tripHistory;
    }

    public PaymentDetails getPayment() {
        return payment;
    }

    public void setPayment(PaymentDetails payment) {
        this.payment = payment;
    }
}
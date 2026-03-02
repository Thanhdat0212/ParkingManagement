
package Model;

import java.sql.Timestamp;

public class Invoice {
    private int invoiceId;
    private int subscriptionId;
    private double price;
    private Timestamp issuedDate;
    private String paymentStatus;
    private String paymentMethod;

    public Invoice() {}

    public int getInvoiceId() {
        return invoiceId;
    }

    public int getSubscriptionId() {
        return subscriptionId;
    }

    public double getPrice() {
        return price;
    }

    public Timestamp getIssuedDate() {
        return issuedDate;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIssuedDate(Timestamp issuedDate) {
        this.issuedDate = issuedDate;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    
    
}

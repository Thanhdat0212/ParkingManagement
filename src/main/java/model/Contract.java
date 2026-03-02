
package Model;

import java.sql.Date;

public class Contract {
    private int subscriptionId;
    private int vehicleId;
    private int slotId;
    private int packageId;
    private int durationMonths;
    private Date startDate;
    private Date endDate;
    private String status;

    public Contract() {}

    public int getSubscriptionId() {
        return subscriptionId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public int getSlotId() {
        return slotId;
    }

    public int getPackageId() {
        return packageId;
    }

    public int getDurationMonths() {
        return durationMonths;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public void setDurationMonths(int durationMonths) {
        this.durationMonths = durationMonths;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}

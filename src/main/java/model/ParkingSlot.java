
package Model;


public class ParkingSlot {
    private int slotId;
    private String slotNumber;
    private String zone;
    private String vehicleType;
    private String serviceTier;
    private String status;

    public ParkingSlot() {}

    public int getSlotId() {
        return slotId;
    }

    public String getSlotNumber() {
        return slotNumber;
    }

    public String getZone() {
        return zone;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getServiceTier() {
        return serviceTier;
    }

    public String getStatus() {
        return status;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public void setSlotNumber(String slotNumber) {
        this.slotNumber = slotNumber;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setServiceTier(String serviceTier) {
        this.serviceTier = serviceTier;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}

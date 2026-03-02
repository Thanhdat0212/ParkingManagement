
package Model;


public class Vehicle {
    private int vehicleId;
    private String licensePlate;
    private int seaterCount;
    private String vehicleType; // Cột computed trong SQL
    private String brand;
    private String color;
    private String roomNumber; // FK

    public Vehicle() {}

    public int getVehicleId() {
        return vehicleId;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getSeaterCount() {
        return seaterCount;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setSeaterCount(int seaterCount) {
        this.seaterCount = seaterCount;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    
    
}

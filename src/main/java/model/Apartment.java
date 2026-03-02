package Model;


public class Apartment {
    private String roomNumber;
    private int floor;
    private String buildingBlock;

    public Apartment() {}

    public Apartment(String roomNumber, int floor, String buildingBlock) {
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.buildingBlock = buildingBlock;
    }

    // Getters and Setters
    public String getRoomNumber() { return roomNumber; }
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }
    public int getFloor() { return floor; }
    public void setFloor(int floor) { this.floor = floor; }
    public String getBuildingBlock() { return buildingBlock; }
    public void setBuildingBlock(String buildingBlock) { this.buildingBlock = buildingBlock; }
}
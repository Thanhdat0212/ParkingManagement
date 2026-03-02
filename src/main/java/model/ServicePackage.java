
package Model;

public class ServicePackage {
    private int packageId;
    private String packageName;
    private String durationType;
    private double price;
    private String description;

    public ServicePackage() {}

    public int getPackageId() {
        return packageId;
    }

    public String getPackageName() {
        return packageName;
    }

    public String getDurationType() {
        return durationType;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public void setDurationType(String durationType) {
        this.durationType = durationType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}

public class Car {

    private String carManufacturer;
    private String carModel;
    private String licenseNumber;

    public Car(String carManufacturer, String carModel, String licenseNumber){
        this.carManufacturer = carManufacturer;
        this.carModel = carModel;
        this.licenseNumber = licenseNumber;
    }

    public String getCarManufacturer(){
        return this.carManufacturer;
    }
    public void setCarManufacturer(String carManufacturer){
        this.carManufacturer = carManufacturer;
    }

    public String getCarModel(){
        return this.carModel;
    }
    public void setCarModel(String carModel){
        this.carModel = carModel;
    }

    public String getLicenseNumber(){
        return this.licenseNumber;
    }
    public void setLicenseNumber(String licenseNumber){
        this.licenseNumber = licenseNumber;
    }

}

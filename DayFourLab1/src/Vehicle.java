public class Vehicle {


    //attributes
    private String type;
    private String brand;
    private  String model;
    private int rpm;
    private  String fuel;
    private int wheels;
    private int engineTemperature;
    private boolean hasOBD;


    public Vehicle(String type, String brand, String model, int rpm, String fuel, int wheels, int engineTemperature, boolean hasOBD){
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.rpm = rpm;
        this.fuel = fuel;
        this.wheels = wheels;
        this.engineTemperature = engineTemperature;
        this.hasOBD = hasOBD;
    }


    boolean isHasOBD(){
        return this.hasOBD;
    }

    String printVehicle(){
        String mss = "Type : " + this.getType() + "\n" +
                "Brand : " + this.getBrand() + "\n" +
                "Model : " + this.getModel() + "\n" +
                "Fuel : " + this.getFuel() + "\n" +
                "RPM : " + this.getRpm() + "\n" +
                "Wheels : " + this.getWheels() +"\n" +
                "Engine Temprature : " + this.getEngineTemperature() + "\n" +
                "Has OBD : " + this.isHasOBD() + "\n";

        return mss;
    }


    public Vehicle() {

    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getEngineTemperature() {
        return engineTemperature;
    }

    public void setEngineTemperature(int engineTemperature) {
        this.engineTemperature = engineTemperature;
    }

    public void setHasOBD(boolean hasOBD) {
        this.hasOBD = hasOBD;
    }





}

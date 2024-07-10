public class Car extends Vehicle {

    public Car(){
        this.setBrand("Nissan");
        this.setType("Car");
        this.setRpm(2500);
        this.setHasOBD(true);
        this.setModel("2024");
        this.setEngineTemperature(2000);
        this.setWheels(4);
        this.setFuel("90");
    }

    public Car (String _brand, String _type, int _rpm, boolean _hasOBD, String _model, int _engineTemp, int _wheels, String _fuel) {
        this.setBrand(_brand);
        this.setType(_type);
        this.setRpm(_rpm);
        this.setHasOBD(_hasOBD);
        this.setModel(_model);
        this.setEngineTemperature(_engineTemp);
        this.setWheels(_wheels);
        this.setFuel(_fuel);
    }

}

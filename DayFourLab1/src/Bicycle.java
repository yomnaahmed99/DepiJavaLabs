public class Bicycle extends Vehicle{

    public Bicycle(){
        this.setBrand("Trek Bikes");
        this.setType("Bicycle");
        this.setRpm(500);
        this.setHasOBD(false);
        this.setModel("2022");
        this.setEngineTemperature(20);
        this.setWheels(2);
        this.setFuel("90");
    }

    public Bicycle (String _brand, String _type, int _rpm, boolean _hasOBD, String _model, int _engineTemp, int _wheels, String _fuel) {
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

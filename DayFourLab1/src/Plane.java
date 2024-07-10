public class Plane extends Vehicle{

    public Plane (){
        this.setBrand("Aircraft");
        this.setType("Plane");
        this.setRpm(5000);
        this.setHasOBD(true);
        this.setModel("2018");
        this.setEngineTemperature(2000);
        this.setWheels(3);
        this.setFuel("100");
    }

    public Plane(String _brand, String _type, int _rpm, boolean _hasOBD, String _model, int _engineTemp, int _wheels, String _fuel) {
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

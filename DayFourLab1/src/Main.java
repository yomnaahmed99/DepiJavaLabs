public class Main {
    public static void main(String[] args) {



        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle.printVehicle());

        Car car = new Car();
        System.out.println(car.printVehicle());

        Plane plane = new Plane();
        System.out.println(plane.printVehicle());

        Ship ship = new Ship();
        System.out.println(ship.printVehicle());

        Train train = new Train();
        System.out.println(train.printVehicle());

    }

}
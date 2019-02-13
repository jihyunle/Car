public class CarApp {
    public static void main(String[]args){
        Car car1 = new Car();
        car1.setColor("Dune ");
        car1.setMake("Kia ");
        car1.setModel("Soul");
        print(car1.startEngine());
        print(car1.accelerate());
        car1.setSpeed(70);
        print(car1.getSpeed());
        print(car1.slowDown());
        print(car1.isStopped());

        Car car2 = new Car();
        car2.setColor("Silver ");
        car2.setMake("Chrysler ");
        car2.setModel("Pacifica");
        print(car1.startEngine());
        print(car2.startEngine());
        print(car1.accelerate());
        print(car2.accelerate());
        print(car2.hasStopped());
        print(car2.passTest());
        car1.setSpeed(60);
        print(car1.getSpeed());
        print(car1.isStopped());
        print(car2.passCar(car2, car1));
    }

    public static void print(String str){
        System.out.println(str);
    }
}

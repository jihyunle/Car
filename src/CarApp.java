import java.util.Scanner;
import java.util.ArrayList;

public class CarApp {
    public static void main(String[]args){
//        exercise1();
//        exercise3();

        Driver driver = new Driver();
        Pilot pilot = new Pilot();
        Captain captain = new Captain();

        /*Add a print statement that says the red porsche is being driven by Bob.
        You will get Bob from the person.getName() method.*/
        Car car = new Car("red", "porsche");
        driver.setName("Bob");
        print("The " + car.getColor() + " " + car.getMake() + " is being driven by " + driver.getName());

    }

    public static void print(String str){
        System.out.println(str);
    }

    public static void exercise1(){
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

        exercise2(car1);
    }

    public static void exercise2(Car car1){
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

    public static void exercise3(){
        // modified app
        ArrayList<Car> cars = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true){
            Car car = new Car();
            System.out.println("Please enter the car's color: ");
            car.setColor(input.nextLine());
            System.out.println("Please enter the car's make: ");
            car.setMake(input.nextLine());
            System.out.println("Please enter the car's model: ");
            car.setModel(input.nextLine());
            System.out.println("Please enter the year the car was made: ");
            car.setYear(input.nextInt());
            input.nextLine();   // consume new line character
            cars.add(car);
            System.out.println("Would you like to add another car?: Y/N");
            if (input.nextLine().equalsIgnoreCase("N")){
                break;
            }
        }

        // display
        for (Car car:cars){
            System.out.println(car.getDescription());
        }
    }
}

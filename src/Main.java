import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.*;


public class Main {
    public static void main(String[] args) {
        Car tesla = new Car("Tesla Model X", "Mid-size luxury crossover SUV", 5390,
                new Driver("Chris", "Tomson", 35, 13), new Engine("electric", 375, 487));

        Car porsche911 = new SportCar("Porsche 911", "SL", 3636, new Driver("Adam", "William", 27, 8),
                new Engine("Gas", 478, 1950),330);

        Car kamaz = new Lorry("KamAZ-5320", "Lorry", 17636.98, new Driver("Andrew", "Downey", 44, 21),
                new Engine("Diesel", 210, 667), 20000);

        Car[] cars = new Car[]{tesla, porsche911, kamaz};

        for (Car car:cars) {
            System.out.println("<------------------------>");
            System.out.println(car);
            car.start();
            if(cars[1].equals(car)) car.turnRight();
            if(car instanceof Lorry) car.turnLeft();
            car.stop();
            System.out.println("<------------------------>");
        }
    }
}
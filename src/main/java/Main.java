import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] cars = new Car[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите название автомобиля " + (i + 1) + ":");
            String name = scanner.nextLine();

            int speed = 0;
            while (true) {
                System.out.println("Введите скорость автомобиля " + (i + 1) + " (0 < скорость > 250):");
                speed = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over
                if (speed > 0 && speed <= 250) {
                    break;
                } else {
                    System.out.println("Неправильная скорость, попробуйте ещё раз.");
                }
            }

            cars[i] = new Car(name, speed);
        }

        Race race = new Race();
        Car winner = race.determineWinner(cars);

        System.out.println("Самая быстрая машина: " + winner.getName());
    }
}

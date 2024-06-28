public class Race {
    public Car determineWinner(Car[] cars) {
        Car winner = null;
        int maxDistance = 0;

        for (Car car : cars) {
            int distance = car.getSpeed() * 24;
            if (distance > maxDistance) {
                maxDistance = distance;
                winner = car;
            }
        }
        return winner;
    }
}

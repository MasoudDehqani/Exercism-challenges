public class CarsAssemble {
    private static final int MINIMUM_CARS_PRODUCED_EACH_HOUR = 221;

    public double productionRatePerHour(int speed) {
        if (speed >= 1 && speed <= 4) {
            return speed * MINIMUM_CARS_PRODUCED_EACH_HOUR;
        } else if (speed >= 5 && speed <= 8) {
            return (MINIMUM_CARS_PRODUCED_EACH_HOUR * 0.9) * speed;
        } else if (speed == 9) {
            return (MINIMUM_CARS_PRODUCED_EACH_HOUR * 0.8) * speed;
        } else {
            return (MINIMUM_CARS_PRODUCED_EACH_HOUR * 0.77) * speed;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}

public class Plane implements Polet {
    int countPassengers;

    public Plane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public void fly() throws FlyException {
        if (this.countPassengers < 0) {
            try {
                throw new FlyException();
            } catch (FlyException var2) {
                System.out.println("В самолете 0 пассаж");
            }
        } else {
            System.out.println("Самолет летит");
        }

    }
}
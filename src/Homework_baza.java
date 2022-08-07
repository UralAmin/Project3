public class Homework_baza {
    public Homework_baza() {
    }

    public static void main(String[] args) throws FlyException {
        Duck duck = new Duck(false);
        Duck duck1 = new Duck(true);
        Plane plane = new Plane(-1);
        Plane plane1 = new Plane(10);
        Polet[] polets = new Polet[]{duck, duck1, plane1, plane};
        Polet[] var6 = polets;
        int var7 = polets.length;

        for(int var8 = 0; var8 < var7; ++var8) {
            Polet polet = var6[var8];
            polet.fly();
        }

    }
}

